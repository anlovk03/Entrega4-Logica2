class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public void insertarEnPosicion(int dato, int indice) {
        Nodo nuevoNodo = new Nodo(dato);

        if (indice == 0) { 
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
            return;
        }

        Nodo actual = cabeza;
        for (int i = 0; actual != null && i < indice - 1; i++) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Índice fuera del rango");
            return;
        }

        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarEnPosicion(10, 0);
        lista.insertarEnPosicion(23, 1);
        lista.insertarEnPosicion(38, 2);
        lista.insertarEnPosicion(15, 1); 

        lista.imprimirLista();
    }
}
