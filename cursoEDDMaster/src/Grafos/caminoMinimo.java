package Grafos;

public class caminoMinimo {

    //Metodo para determinar todos los caminos Floyd
    public String algoritmoFloyd(long[][] mAdy) {
        int vertices = mAdy.length;
        long matrizAdyacencia[][] = mAdy;
        String caminos[][] = new String[vertices][vertices];
        String caminosAuxiliares[][] = new String[vertices][vertices];
        String caminosRecorrido = "";
        String cadena = "";
        String caminitos = "";
        float temporal1, temporal2, temporal3, temporal4, minimo;

        //Inicializando las matrices caminos y caminosAuxiliares
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                caminos[i][j] = "";
                caminosAuxiliares[i][j] = "";
            }
        }

        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    temporal1 = matrizAdyacencia[i][j];
                    temporal2 = matrizAdyacencia[i][k];
                    temporal3 = matrizAdyacencia[k][j];
                    temporal4 = temporal2 + temporal3;
                    //Encontrar el minimo
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4) {
                        if (minimo == temporal4) {
                            caminosRecorrido = "";
                            caminosAuxiliares[i][j] = k + "";
                            caminos[i][j] = caminosR(i, k, caminosAuxiliares, caminosRecorrido) + (k + 1);
                        }
                    }
                    matrizAdyacencia[i][j] = (long) minimo;
                }
            }
        }
        //Agregando camino minimo a cadena
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                cadena += "[ " + matrizAdyacencia[i][j] + " ]";
            }
            cadena += "\n";
        }

        //////////////////////////
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (matrizAdyacencia[i][j] != 1000000000) {
                    if (i != j) {
                        if (caminos[i][j].equals("")) {
                            caminitos += "De ( " + (i + 1) + " ---> " + (j + 1)
                                    + " ) Irse por... ( " + (i + 1) + ", " + (j + 1) + " )\n";
                        } else {
                            caminitos += "De ( " + (i + 1) + " ---> " + (j + 1)
                                    + " ) Irse por... ( " + (i + 1) + ", " + caminos[i][j]
                                    + ", " + (j + 1) + " )\n";

                        }
                    }
                }
            }
        }

        return "La Matriz de Caminos Más Cortos Entre Los Diferentes Vértices es:\n " + cadena
                + "\nLos Diferentes Caminos Más Cortos Entre Vértices Son:\n" + caminitos;

    }

    public String caminosR(int i, int k, String[][] caminosAuxiliares, String caminoRecorrido) {
        if (caminosAuxiliares[i][k].equals("")) {
            return "";
        } else {
            //Recursividad al Millón
            caminoRecorrido += caminosR(i, Integer.parseInt(caminosAuxiliares[i][k]), caminosAuxiliares, caminoRecorrido) + (Integer.parseInt(caminosAuxiliares[i][k]) + 1) + ", ";
            return caminoRecorrido;

        }
    }

}
