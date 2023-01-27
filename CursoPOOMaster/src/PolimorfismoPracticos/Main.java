package PolimorfismoPracticos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //CREAR LOS OBJETOS (POLIMORFISMO OVERLOAD)
        Programador prog = new Programador();
        Analista anal = new Analista();
        AdministradorBD abd = new AdministradorBD();

        //CREAR LOS OBJETOS (POLIMORFISMO OVERRIDE)
        ProgramadorOverride pro2 = new ProgramadorOverride();
        AnalistaOverride anal2 = new AnalistaOverride();
        AdministradorBDOverride abd2 = new AdministradorBDOverride();

        JOptionPane.showMessageDialog(null, "AQUI INICIOA EL POLIMOSFISMO OVERLOAD",/////////////////////////////
                "POLIMOSFISMO OVERLOAD", JOptionPane.WARNING_MESSAGE);////////////////////////////////////////////

        //INGRESA DATOS DEL PROGRAMADOR
        JOptionPane.showMessageDialog(null, "PROGRAMADO", "PROGRAMADOR", JOptionPane.INFORMATION_MESSAGE);
        String nom = JOptionPane.showInputDialog(null, "Agrega nombre =\n");
        String apellidos = JOptionPane.showInputDialog(null, "Agrega Apelidos =\n");

        //INGRESA SUELOD DEL PROGRAMADOR
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las horaas de trabajo =\n"));
        double pah = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el pago por horas =\n "));

        //INGRESA LABORES DEL PROGRAMADOR
        String lab = JOptionPane.showInputDialog(null, "Ingrese labores del programador =\n");

        //IMPRIMIR LOS DATOS RECIBIDOS
        prog.datos(nom, apellidos);
        prog.sueldo(horas, pah);
        prog.labores(lab);

        //INGRESA DATOS DEL ANALISTA
        JOptionPane.showMessageDialog(null, "ANALISTA", "ANALISTA", JOptionPane.INFORMATION_MESSAGE);
        String nom1 = JOptionPane.showInputDialog(null, "Agrega nombre =\n");
        String apellidos1 = JOptionPane.showInputDialog(null, "Agrega Apelidos =\n");
        String direccion1 = JOptionPane.showInputDialog(null, "Agrega Direccion =\n");

        //INGRESA SUELOD DEL ANALISTA
        int horas1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las horaas de trabajo =\n"));
        double pah1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el pago por horas =\n "));
        double incent = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Incentivo =\n "));

        //INGRESA LABORES DEL ANALISTA
        String lab2 = JOptionPane.showInputDialog(null, "Ingrese labores del Analista =\n");
        int horas2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las horaas de trabajo del labor =\n"));

        //IMPRIMIR LOS DATOS RECIBIDOS
        anal.datos(nom1, apellidos1, direccion1);
        anal.sueldo(horas1, pah1, incent);
        anal.labores(lab2, horas2);

        //INGRESA DATOS DEL ADMINISTRADORBD
        JOptionPane.showMessageDialog(null, "ADMINISTRADOR", "ADMINISTRADOR", JOptionPane.INFORMATION_MESSAGE);
        String nom3 = JOptionPane.showInputDialog(null, "Agrega nombre =\n");

        //INGRESA SUELOD DEL ADMINISTRADORBD
        double suel3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el pago =\n "));

        //INGRESA LABORES DEL ANALISTA
        String lab3 = JOptionPane.showInputDialog(null, "Ingrese labores del Administrador =\n");

        //IMPRIMIR LOS DATOS RECIBIDOS
        abd.datos(nom3);
        abd.sueldo(suel3);
        abd.labores(lab3);

        JOptionPane.showMessageDialog(null, "AQUI INICIOA EL POLIMOSFISMO OVERRIDE",
                "POLIMOSFISMO OVERRIDE", JOptionPane.WARNING_MESSAGE);

        //IMPRIMIR LOS DATOS DEL PROGRAMADOR OVERRIDE
        String dat2 = JOptionPane.showInputDialog(null, "Ingresa el nombre =\n", "PROGRAMADOR", JOptionPane.INFORMATION_MESSAGE);

        //IMPRIMIR LOS DATOS DEL PROGRAMADOR OVERRIDE
        double sud2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el sueldo =\n", "PROGRAMADOR", JOptionPane.INFORMATION_MESSAGE));

        //IMPRIMIR LOS DATOS DEL PROGRAMADOR OVERRIDE
        String labo2 = JOptionPane.showInputDialog(null, "Ingresa el labor =\n", "PROGRAMADOR", JOptionPane.INFORMATION_MESSAGE);

        //IMPRIMIR LOS DATOS DEL PROGRAMADOR OVERRIDE
        pro2.datos(dat2);
        pro2.sueldo(sud2);
        pro2.labores(labo2);

        //IMPRIMIR LOS DATOS DEL ANALISTA OVERRIDE
        String dat22 = JOptionPane.showInputDialog(null, "Ingresa el nombre =\n", "ANALISTA", JOptionPane.INFORMATION_MESSAGE);

        //IMPRIMIR LOS DATOS DEL ANALISTA OVERRIDE
        double sud22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el sueldo =\n", "ANALISTA", JOptionPane.INFORMATION_MESSAGE));

        //IMPRIMIR LOS DATOS DEL PROGRAMADOR OVERRIDE
        String labo22 = JOptionPane.showInputDialog(null, "Ingresa el labor =\n", "ANALISTA", JOptionPane.INFORMATION_MESSAGE);

        //IMPRIMIR LOS DATOS DEL ANALISTA OVERRIDE
        anal2.datos(dat22);
        anal2.sueldo(sud22);
        anal2.labores(labo22);

        //IMPRIMIR LOS DATOS DEL ADMINISTRADORBD OVERRIDE
        String dat222 = JOptionPane.showInputDialog(null, "Ingresa el nombre =\n", "ADMINISTRADORBD", JOptionPane.INFORMATION_MESSAGE);

        //IMPRIMIR LOS DATOS DEL ADMINISTRADORBD OVERRIDE
        double sud222 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el sueldo =\n", "ADMINISTRADORBD", JOptionPane.INFORMATION_MESSAGE));

        //IMPRIMIR LOS DATOS DEL PROGRAMADOR OVERRIDE
        String labo222 = JOptionPane.showInputDialog(null, "Ingresa el labor =\n", "ADMINISTRADORBD", JOptionPane.INFORMATION_MESSAGE);

        //IMPRIMIR LOS DATOS DEL ADMINISTRADOR OVERRIDE
        abd2.datos(dat222);
        abd2.sueldo(sud222);
        abd2.labores(labo222);

    }

}
