package interfaces;

import dao.Conexion;
import java.sql.*;
import persona.Empleados;

public class DAO_EmpleadosInplementacion implements DAO_Empleados {

    Conexion conexion = Conexion.getInstance();

    @Override
    public void registrar(Empleados empleados) {

        try {

            Connection conectar = conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement(
                    "insert into empleados values (?,?)");

            insertar.setInt(1, empleados.getId());
            insertar.setString(2, empleados.getNombre());
            insertar.executeUpdate();

            conexion.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Error de Datos", "Mensaje", 2);
        }

    }

    @Override
    public void modificar(Empleados empleados) {

        try {
            Connection conectar = conexion.conectar();
            PreparedStatement modificar = conectar.prepareStatement(
                    "update empleados set nombre = ? where id = ?");

            modificar.setString(1, empleados.getNombre());
            modificar.setInt(2, empleados.getId());
            modificar.executeUpdate();

            conexion.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Error de Datos", "Mensaje", 2);
        }

    }

    @Override
    public void eliminar(Empleados empleados) {

        try {

            Connection conectar = conexion.conectar();
            PreparedStatement eliminar = conectar.prepareStatement("delete from empleados where id = ?");

            eliminar.setInt(1, empleados.getId());
            eliminar.executeUpdate();

            conexion.cerrarConexion();

        } catch (SQLException e) {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Error de Datos", "Mensaje", 2);
        }

    }

    @Override
    public void buscar(Empleados empleados) {

        try {

            Connection conectar = conexion.conectar();
            PreparedStatement buscar = conectar.prepareStatement("select * from empleados where id = ?");

            buscar.setInt(1, empleados.getId());
            ResultSet consulta = buscar.executeQuery(); //Sirva para hacer una consulta a una BD

            if (consulta.next()) {
                empleados.setId(Integer.parseInt(consulta.getString("id")));
                empleados.setNombre(consulta.getString("nombre"));
            }

            conexion.cerrarConexion();

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Error de Datos", "Mensaje", 2);
        }

    }

}
