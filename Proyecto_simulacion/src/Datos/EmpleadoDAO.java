package Datos;

import java.sql.*;
import Domain.Empleado;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoDAO {

    //conectarme por medio de la instancia
    ConexionBD instanciaMysql = ConexionBD.getInstance();

    //Creando la constante para los uso de las funciones de Mysql
    private static final String SQL_SELECT = "SELECT * FROM registro";
    private static final String SQL_INSERT = "INSERT INTO registro(nombre,apellido,telefono,postal,email,noIdentificador,sexo,noSeguro,area,formacion,observacion) values(?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPTADE = "UPTADE registro SET nombre = ?,apellido = ?,telefono = ?,postal = ?,email = ?,noIdentificador = ?,sexo = ?,noSeguro = ?,area = ?,formacion = ?,observacion = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM registro WHERE id = ?";

    //Constructor vacio
    public EmpleadoDAO() {

    }

    public int insertar(Empleado empleado) throws SQLException {

        try {
            
            int registro = 0;
            
            Connection conexion = instanciaMysql.conectar();
            PreparedStatement consultaPreparada = conexion.prepareStatement(SQL_INSERT);
            
            try {
                consultaPreparada.setString(1, empleado.getNombre());
                consultaPreparada.setString(2, empleado.getApellido());
                consultaPreparada.setString(3, empleado.getTelefono());
                consultaPreparada.setInt(4, empleado.getPostal());
                consultaPreparada.setString(5, empleado.getEmail());
                consultaPreparada.setInt(6, empleado.getNoIndentificado());
                consultaPreparada.setString(7, empleado.getSexo());
                consultaPreparada.setString(8, empleado.getNoSeguro());
                consultaPreparada.setString(9, empleado.getAreaT());
                consultaPreparada.setString(10, empleado.getFormacionAcademica());
                consultaPreparada.setString(11, empleado.getObservacion());
                
                registro = consultaPreparada.executeUpdate();
                
            } catch (SQLException e) {
                System.out.println("3\n" + e.getMessage());
            } finally {
                instanciaMysql.cerrarStatement(consultaPreparada);
                instanciaMysql.desconectar(conexion);
            }
            
            return registro;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int modificar(Empleado empleado) throws SQLException, ClassNotFoundException {
        int registro = 0;
        Connection conexion = instanciaMysql.conectar();
        PreparedStatement consultaPreparada = conexion.prepareStatement(SQL_UPTADE);

        try {

            consultaPreparada.setString(1, empleado.getNombre());
            consultaPreparada.setString(2, empleado.getApellido());
            consultaPreparada.setString(3, empleado.getTelefono());
            consultaPreparada.setInt(4, empleado.getPostal());
            consultaPreparada.setString(5, empleado.getEmail());
            consultaPreparada.setInt(6, empleado.getNoIndentificado());
            consultaPreparada.setString(7, empleado.getSexo());
            consultaPreparada.setString(8, empleado.getNoSeguro());
            consultaPreparada.setString(9, empleado.getAreaT());
            consultaPreparada.setString(10, empleado.getFormacionAcademica());
            consultaPreparada.setString(11, empleado.getObservacion());

            registro = consultaPreparada.executeUpdate();

        } catch (SQLException e) {
            System.out.println("14");
        } finally {
            instanciaMysql.desconectar(conexion);
            instanciaMysql.cerrarStatement(consultaPreparada);
        }

        return registro;
    }

    public int eliminar(Empleado empleado) throws SQLException, ClassNotFoundException {

        int registro = 0;
        Connection conexion = instanciaMysql.conectar();
        PreparedStatement consultaPreparada = conexion.prepareStatement(SQL_DELETE);

        try {
            consultaPreparada.setInt(1, empleado.getId());
            registro = consultaPreparada.executeUpdate();

        } catch (SQLException e) {
            System.out.println("13");
        } finally {
            instanciaMysql.cerrarStatement(consultaPreparada);
            instanciaMysql.desconectar(conexion);
        }

        return registro;

    }

//    //Creamos el metodo para listar los datos
//    public List<Empleado> listar() throws SQLException {
//
//        List<Empleado> empleolist = new ArrayList<>();
//
//        Connection conexion = instanciaMysql.conectar();
//        PreparedStatement consultaPreparada = conexion.prepareStatement(SQL_SELECT);
//        ResultSet resultado = consultaPreparada.executeQuery();
//
//        try {
//            while (resultado.next()) {
//                int id = resultado.getInt("id");
//                String nombre = resultado.getString("nombre");
//                String apellido = resultado.getString("apellido");
//                String telef = resultado.getString("telefono");
//                int postal = resultado.getInt("postal");
//                String correo = resultado.getString("email");
//                int identidad = resultado.getInt("noIdentificador");
//                String sexo = resultado.getString("sexo");
//                String noSeguro = resultado.getString("noSeguro");
//                String area = resultado.getString("area");
//                String estudioAcad = resultado.getString("formacion");
//                String observacion = resultado.getString("observacion");
//
//                Empleado empleado = new Empleado(id, nombre, apellido, telef, postal, correo, identidad, sexo, noSeguro, area, estudioAcad, observacion);
//                empleolist.add(empleado);
//            }
//
//            return empleolist;
//
//        } catch (SQLException e) {
//            System.out.println("4\n" + e.getMessage());
//        } finally {
//            instanciaMysql.cerrarConexion();
//            resultado.close();
//            consultaPreparada.close();
//        }
//        return empleolist;
//    }
}
