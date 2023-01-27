package listaDoblementeEnlazada;

public class ListaDoble {

    //Para saber donde apunta el Nodo
    private NodoDoble inicio, fin;

    //Metodo constructor
    public ListaDoble() {
        inicio = fin = null;
    }

    //Metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //Metodo para agregar Nodo al final
    public void agregarAlFinal(int d) {
        try {
            if (!estaVacia()) {
                fin = new NodoDoble(d, null, fin);
                fin.anterior.siguiente = fin;
            } else {
                inicio = fin = new NodoDoble(d);
            }
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    //Metodo para agregar Nodo al inicio
    public void agregarAlInicio(int d) {
        try {
            if (!estaVacia()) {
                inicio = new NodoDoble(d, inicio, null);
                inicio.siguiente.anterior = inicio;
            } else {
                inicio = fin = new NodoDoble(d);
            }
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin() {
        try {
            if (!estaVacia()) {
                String datos = "<---> ";
                System.out.println("");
                NodoDoble auxiliar = inicio;
                while (auxiliar != null) {
                    datos += "[ " + auxiliar.dato + " ] " + "<---> ";
                    auxiliar = auxiliar.siguiente;
                }

                System.out.print(datos);

                /*
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
                 */
            }
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaFinInicio() {
        try {
            if (!estaVacia()) {
                String datos = "<---> ";
                System.out.println("");
                NodoDoble auxiliar = fin;
                while (auxiliar != null) {
                    datos += "[ " + auxiliar.dato + " ] " + "<---> ";
                    auxiliar = auxiliar.anterior;
                }

                System.out.print(datos);

                /*
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
                 */
            }
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
    }

    //Eliminar Nodo del Inicio
    public int eliminarInicio() {
        try {
            int elemento = inicio.dato;
            if (!estaVacia()) {
                if (inicio == fin) {
                    inicio = fin = null;
                } else {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                }
                
            } else {
                System.out.println("Esta vacia\nNo se puede eliminar Nodo\nSin un elementos");
            }
            return elemento;
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
        return 0;
    }

    //Eliminar Nodo del Final
    public int eliminarFinal() {
        try {
            int elemento = fin.dato;
            if (!estaVacia()) {
                if (inicio == fin) {
                    inicio = fin = null;
                } else {
                    fin = fin.anterior;
                    fin.siguiente = null;
                }

            } else {
                System.out.println("Esta vacia\nNo se puede eliminar Nodo\nSin un elementos");
            }
            return elemento;
        } catch (Exception e) {
            System.out.println("Error de datos");
        }
        return 0;
    }

}
