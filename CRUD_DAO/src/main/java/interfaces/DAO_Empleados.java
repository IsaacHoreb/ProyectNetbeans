package interfaces;

import persona.Empleados;

public interface DAO_Empleados {

    public void registrar(Empleados empleados);

    public void modificar(Empleados empleados);

    public void eliminar(Empleados empleados);

    public void buscar(Empleados empleados);

}
