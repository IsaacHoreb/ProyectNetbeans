package Domain;

public class Empleado {

    //1.- Declaramos las variables de uso de manera private
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private int postal;
    private String email;
    private int noIndentificado;
    private String sexo;
    private String noSeguro;
    private String areaT;
    private String formacionAcademica;
    private String observacion;

    public Empleado(int id) { //Buscar a la persona
        this.id = id;
    }

    public Empleado(String nombre, String apellido, String telefono, int postal, String email, int noIndentificado, String sexo, String noSeguro, String areaT, String formacionAcademica, String observacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.postal = postal;
        this.email = email;
        this.noIndentificado = noIndentificado;
        this.sexo = sexo;
        this.noSeguro = noSeguro;
        this.areaT = areaT;
        this.formacionAcademica = formacionAcademica;
        this.observacion = observacion;
    }

    public Empleado(int id, String nombre, String apellido, String telefono, int postal, String email, int noIndentificado, String sexo, String noSeguro, String areaT, String formacionAcademica, String Observacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.postal = postal;
        this.email = email;
        this.noIndentificado = noIndentificado;
        this.sexo = sexo;
        this.noSeguro = noSeguro;
        this.areaT = areaT;
        this.formacionAcademica = formacionAcademica;
        this.observacion = Observacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoIndentificado() {
        return noIndentificado;
    }

    public void setNoIndentificado(int noIndentificado) {
        this.noIndentificado = noIndentificado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNoSeguro() {
        return noSeguro;
    }

    public void setNoSeguro(String noSeguro) {
        this.noSeguro = noSeguro;
    }

    public String getAreaT() {
        return areaT;
    }

    public void setAreaT(String areaT) {
        this.areaT = areaT;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
