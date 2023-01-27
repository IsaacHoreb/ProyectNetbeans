package datos;

import domain.Clientes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CienteDao {

    Conexion instanciaMysql = Conexion.getInstancia();
    private Connection conexionTransaccional; //Conexion transaccional

    private static final String SQL_SELECT = "SELECT * FROM cliente";
    private static final String SQL_INSERT = "INSERT INTO cliente(nombre,apellido,email,telefono,saldo) values(?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombre = ?, apellido = ?, email = ?, telefono = ?, saldo = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id = ?";

    //Constructor
    public CienteDao() {

    }

    public CienteDao(Connection conexiontransaccional) {
        this.conexionTransaccional = conexiontransaccional;
    }

    //Creamos el metodo para listar los datos
    public List<Clientes> listar() throws SQLException {
        Connection conexion = null;
        PreparedStatement consultaPreparada = null;
        ResultSet resultado = null;
        List<Clientes> clientes = new ArrayList<>();
        Clientes cliente;

        try {
            //conexion = conexion = instanciaMysql.conectar(); //CONEXION NORMAL
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();

            consultaPreparada = conexion.prepareStatement(SQL_SELECT);
            resultado = consultaPreparada.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String email = resultado.getString("email");
                String telefono = resultado.getString("telefono");
                double saldo = resultado.getDouble("saldo");

                cliente = new Clientes(id, nombre, apellido, email, telefono, saldo);
                clientes.add(cliente);

            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            instanciaMysql.cerrarResultado(resultado);
            instanciaMysql.cerrarStatement(consultaPreparada);
            //instanciaMysql.cerrarConexion(conexion);
            if (this.conexionTransaccional == null) {
                instanciaMysql.desconectar(conexion);
            }

        }
        return clientes;
    }

    //Creamos el metodo para insertar
    public int insertar(Clientes cliente) {
        Connection conexion = null;
        PreparedStatement consultaPreparada = null;
        int registro = 0;

        try {
            //conexion = instanciaMysql.conectar();
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();
            consultaPreparada = conexion.prepareStatement(SQL_INSERT);

            consultaPreparada.setString(1, cliente.getNombre());
            consultaPreparada.setString(2, cliente.getApellido());
            consultaPreparada.setString(3, cliente.getEmail());
            consultaPreparada.setString(4, cliente.getTelefono());
            consultaPreparada.setDouble(5, cliente.getSaldo());

            registro = consultaPreparada.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            instanciaMysql.cerrarStatement(consultaPreparada);
            //instanciaMysql.desconectar(conexion);
            if (this.conexionTransaccional == null) {
                instanciaMysql.desconectar(conexion);
            }
        }

        return registro;

    }

    //Creamos el metodo para modificar
    public int modificar(Clientes cliente) {
        Connection conexion = null;
        PreparedStatement consultaPreparada = null;
        int registro = 0;

        try {
            //conexion = instanciaMysql.conectar();
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();
            consultaPreparada = conexion.prepareStatement(SQL_UPDATE);

            consultaPreparada.setString(1, cliente.getNombre());
            consultaPreparada.setString(2, cliente.getApellido());
            consultaPreparada.setString(3, cliente.getEmail());
            consultaPreparada.setString(4, cliente.getTelefono());
            consultaPreparada.setDouble(5, cliente.getSaldo());
            consultaPreparada.setInt(6, cliente.getId());

            registro = consultaPreparada.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            instanciaMysql.cerrarStatement(consultaPreparada);
            //instanciaMysql.desconectar(conexion);
            if (this.conexionTransaccional == null) {
                instanciaMysql.desconectar(conexion);
            }
        }

        return registro;

    }

    //Creamos el metodo para eliminar registros
    public int eliminar(Clientes cliente) {
        Connection conexion = null;
        PreparedStatement consultaPreparada = null;
        int registro = 0;

        try {
            //conexion = instanciaMysql.conectar();
            conexion = this.conexionTransaccional != null ? this.conexionTransaccional : instanciaMysql.conectar();
            consultaPreparada = conexion.prepareStatement(SQL_DELETE);

            consultaPreparada.setInt(1, cliente.getId());
            registro = consultaPreparada.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            instanciaMysql.cerrarStatement(consultaPreparada);
            //instanciaMysql.desconectar(conexion);
            if (this.conexionTransaccional == null) {
                instanciaMysql.desconectar(conexion);
            }
        }

        return registro;
    }

}
