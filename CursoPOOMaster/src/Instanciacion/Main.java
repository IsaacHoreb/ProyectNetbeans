
package Instanciacion;

import javax.swing.JOptionPane;

public class Main {

    //Declaramos los atribustos y asignamos valores iniciales
    String Color;
    String Marca;
    int Modelo;
    double Precio;
    
    public static void main(String[] args) {
        //Creando Objetos
        Main primerAuto = new Main();
        Main segundoAuto = new Main();
        Main tercerAuto = new Main();
        
        //Asignando Valores al primer auto
        primerAuto.Marca = "Nissa";
        primerAuto.Color = "Rojo";
        primerAuto.Modelo = 2010;
        primerAuto.Precio = 20022.1231;
        
        //Asignando Valores al swgundo auto
        segundoAuto.Marca = "Toyota";
        segundoAuto.Color = "Negro";
        segundoAuto.Modelo = 2019;
        segundoAuto.Precio = 2313.434;
        
        //Asignando Valores al tercero auto
        tercerAuto.Marca = "Guu";
        tercerAuto.Color = "Amarillo";
        tercerAuto.Modelo = 2020;
        tercerAuto.Precio = 2311.424;
        
        //IMPRIMIR LOS DATOS DE LOS 3 AUTOS
        
        //IMPRIMIR PRIMER AUTO
        StringBuilder sp = new StringBuilder();
        
        sp.append("DATOS DEL PRIMER AUTO");
        sp.append("\nMarca = ");
        sp.append(primerAuto.Marca);
        sp.append("\nColor = ");
        sp.append(primerAuto.Color);
        sp.append("\nModelo = ");
        sp.append(primerAuto.Modelo);
        sp.append("\nPrecio = ");
        sp.append(primerAuto.Precio);
        
        //System.out.println(sp);
        JOptionPane.showMessageDialog(null,sp);
        
        //IMPRIMIR SEFUNDO AUTOS
        StringBuilder pk = new StringBuilder();
        
        pk.append("DATOS DEL SEGUNDO AUTO");
        pk.append("\nMarca = ");
        pk.append(segundoAuto.Marca);
        pk.append("\nColor = ");
        pk.append(segundoAuto.Color);
        pk.append("\nModelo = ");
        pk.append(segundoAuto.Modelo);
        pk.append("\nPrecio = ");
        pk.append(segundoAuto.Precio);
        
        //System.out.println(pk);
        JOptionPane.showMessageDialog(null,pk);
        
        //IMPRIMIR TERCER AUTO
        StringBuilder pQ = new StringBuilder();
        
        pQ.append("DATOS DEL TERCER AUTO");
        pQ.append("\nMarca = ");
        pQ.append(tercerAuto.Marca);
        pQ.append("\nColor = ");
        pQ.append(tercerAuto.Color);
        pQ.append("\nModelo = ");
        pQ.append(tercerAuto.Modelo);
        pQ.append("\nPrecio = ");
        pQ.append(tercerAuto.Precio);
        
        //System.out.println(pQ);
        JOptionPane.showMessageDialog(null,pQ);
        
    }
    
}
