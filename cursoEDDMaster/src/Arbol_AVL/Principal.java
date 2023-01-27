package Arbol_AVL;

public class Principal {

    public static void main(String[] args) {
        ArbolAVL arbolitoAVL = new ArbolAVL();

        arbolitoAVL.insertar(10);
        arbolitoAVL.insertar(5);
        arbolitoAVL.insertar(12);
        arbolitoAVL.insertar(1);
        arbolitoAVL.insertar(6);
        arbolitoAVL.insertar(17);
        arbolitoAVL.preOrden(arbolitoAVL.obtenerRaiz());
    }

}
