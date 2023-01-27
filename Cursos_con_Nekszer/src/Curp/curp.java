package Curp;

import javax.swing.JOptionPane;

/**
 *
 * @author ISAAC
 */
public class curp {

    //1.- Creamos el constructo 
    public curp() {

    }

    //13.- Creamos varibale(Sexo)
    String sexo = "";

    //17.- Creamos variable(Estado)
    String estado = "";

    //21.- Declaramos variables para el nombre completo
    String nombre = "";
    String apellidoP = "";
    String apellidoM = "";

    //2.- Declaramos las variables para las fechas
    Integer dia = 0, año = 0, mes = 0;

    //34.1- Creamos variables para entidadFederativa(EF)
    char a, b;

    //39.- declaramos para la venta de validadico lo convertimos de char a String
    String curpg = "";

    //3.- Creamos el metodo para obtener la fecha 
    public void getFecha(String a, String b, String c) {

        dia = Integer.parseInt(a);
        mes = Integer.parseInt(b);
        año = Integer.parseInt(c);
    }

    public void getSexo(String radio) {
        sexo = radio;
    }

    //16.- Creamos el metodo para los estados
    //34.2 Se convierte en variable para el Switch
    public void getEstado(String boxEstado) {
        estado = boxEstado;
    }

    //20.- Creamos metodo de nombre
    public void getNombreCompleto(String a, String b, String c) {
        nombre = a.toUpperCase();    //.toUpperCase() = comvierte la letras a mayuscula
        apellidoP = b.toUpperCase();
        apellidoM = c.toUpperCase();
    }

    //25.- Los quitamos ya que sabemos que el app ya muestra los datos que deseamos
//    public void mostrarDatos(){
//        //6.- Imprimir los datos por pantalla
//        JOptionPane.showMessageDialog(null,"La fecha es "+dia+"/"+mes+"/"+año, "Mensaje", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "El boton de radio seleccionado es: "+sexo);
//        //19.- Imprimir los datos del estado
//        JOptionPane.showMessageDialog(null, "El valor del Item es: "+estado);
//        //23.- Imprimir los datos del nombre completo
//        JOptionPane.showMessageDialog(null,"El nombre es: "+nombre+" "+apellidoP+" "+apellidoM);
//        
//    }    
    //26.- Creamos un metodo para que nos muestro los datos de una curp
    //Buscamos que obtenga el inicia y primera vocal interna del apellido
    public void curpGent() {
        char c1 = apellidoP.charAt(0); // El primer caracter del apellido
        char c2 = 0;

        for (int i = 1; i < apellidoP.length(); i++) {
            char l = apellidoP.charAt(i);
            if (l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
                c2 = l;
                break;
            }
        }

        //28.-Obtener el inicial del segundo apellido
        char c3 = apellidoM.charAt(0);
        //29.- obtener el inicial del nombre
        char c4 = nombre.charAt(0);

        //30.- obtener los ultimos 2 digitos del año
        String year = String.valueOf(año); // combrertilo a string

        //Obtenemos los dos ultimos digitos [1,9,9,3]
        //indice -------------------------->[0,1,2,3]
        char c5 = year.charAt(2);
        char c6 = year.charAt(3);

        //31.- obtener los dos digitos del mes
        String month = String.valueOf(mes);
        //31.1- Declaramos las variables
        char c7 = 0;
        char c8 = 0;

        //31.2 Cremaos la condicional para el mes
        if (mes < 10) {
            c7 = '0';
            c8 = month.charAt(0);
        } else {
            c7 = month.charAt(0);
            c8 = month.charAt(1);
        }

        //32.- obtener los digitos del dia
        String day = String.valueOf(dia);
        //32.1- Declaramos las variables
        char c9 = 0;
        char c10 = 0;
        //32.2- Creamos la condicional para el dia
        if (dia < 10) {
            c9 = '0';
            c10 = day.charAt(0);
        } else {
            c9 = day.charAt(0);
            c10 = day.charAt(1);
        }

        //33.- Obtener la inicial del sexo usuario
        char c11 = sexo.charAt(0);

        //35.- Dar los valores que corresponden de la EF.
        entidadFederativa();
        char c12 = a;
        char c13 = b;

        //37.- Obtenemos primeras consonante interna del primer apelldio,
        char c14 = 0;

        for (int i = 1; i < apellidoP.length(); i++) {
            char l = apellidoP.charAt(i);
            if (l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U') { //Excluimos a las vocales
                c14 = l;
                break;
            }
        }

        //37.1- //Obtenemos primeras consonante interna del segundo apellido  
        char c15 = 0;

        for (int i = 1; i < apellidoM.length(); i++) {
            char l = apellidoM.charAt(i);
            if (l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U') { //Excluimos a las vocales
                c14 = l;
                break;
            }
        }

        //37.2- Obtenemos primeras consonante interna del nombre pila  
        char c16 = 0;

        for (int i = 1; i < nombre.length(); i++) {
            char l = nombre.charAt(i);
            if (l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U') { //Excluimos a las vocales
                c16 = l;
                break;
            }
        }

        //38.- numero aleatorios de ultimos dos digitos
        //indice 17
        int numero = (int) (Math.random() * 9 + 1);
        String n = String.valueOf(numero);
        char c17 = n.charAt(0);

        //indice 18
        numero = (int) (Math.random() * 9 + 1);
        String b = String.valueOf(numero);
        char c18 = b.charAt(0);

        //39.1- convertido a cadena 
        curpg = String.valueOf(c1 + "" + c2 + "" + c3 + "" + c4 + "" + c5 + "" + c6 + "" + c7 + "" + c8 + "" + c9 + "" + c10 + "" + c11 + "" + c12 + "" + c13 + "" + c14 + "" + c15 + "" + c16 + "" + c17 + "" + c18);

        //27.- Mandamos a imprimir los datos de curpGent(
        JOptionPane.showMessageDialog(null, curpg);

    }

    //34.- Metodo para obtener la entidad federativa[CURP]       
    public void entidadFederativa() {

        //este metodo asigna las letras de la entidad federativa
        switch (estado) {

            case "Aguas Calientes":
                a = 'A';
                b = 'S';
                break;

            case "Baja California":
                a = 'B';
                b = 'C';
                break;

            case "Baja California Sur":
                a = 'B';
                b = 'S';

                break;

            case "Campeche":
                a = 'C';
                b = 'C';
                break;

            case "Coahuila de Zaragoza":
                a = 'C';
                b = 'L';
                break;

            case "Colima":
                a = 'C';
                b = 'M';
                break;

            case "Chiapas":
                a = 'C';
                b = 'S';
                break;

            case "Chihuahua":
                a = 'C';
                b = 'H';
                break;

            case "Distrito Federal":
                a = 'D';
                b = 'F';
                break;

            case "Durango":
                a = 'D';
                b = 'G';
                break;

            case "Guanajuato":
                a = 'G';
                b = 'T';
                break;

            case "Guerrero":
                a = 'G';
                b = 'R';
                break;

            case "Hidalgo":
                a = 'H';
                b = 'G';
                break;

            case "Jalisco":
                a = 'J';
                b = 'C';
                break;

            case "Estado de México":
                a = 'M';
                b = 'C';
                break;

            case "Michoacan de Ocampo":
                a = 'M';
                b = 'N';
                break;

            case "Morelos":
                a = 'M';
                b = 'S';
                break;

            case "Nayarit":
                a = 'N';
                b = 'T';
                break;

            case "Nuevo Leon":
                a = 'N';
                b = 'L';
                break;

            case "Oaxaca":
                a = 'O';
                b = 'C';
                break;

            case "Puebla":
                a = 'P';
                b = 'L';
                break;

            case "Queretaro de Arteaga":
                a = 'Q';
                b = 'T';
                break;

            case "Quintana Roo":
                a = 'Q';
                b = 'R';
                break;

            case "San Luis Potosi":
                a = 'S';
                b = 'P';
                break;

            case "Sinaloa":
                a = 'S';
                b = 'L';
                break;

            case "Sonora":
                a = 'S';
                b = 'R';
                break;

            case "Tabasco":
                a = 'T';
                b = 'C';
                break;

            case "Tamaulipas":
                a = 'T';
                b = 'S';
                break;

            case "Tlaxcala":
                a = 'T';
                b = 'L';
                break;

            case "Veracruz":
                a = 'V';
                b = 'Z';
                break;

            case "Yucatan":
                a = 'Y';
                b = 'N';
                break;

            case "Zacatecas":
                a = 'Z';
                b = 'S';
                break;

            case "Nacido en el Extranjero":
                a = 'N';
                b = 'E';
                break;

        }
    }

}
