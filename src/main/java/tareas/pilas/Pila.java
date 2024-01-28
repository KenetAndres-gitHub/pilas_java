package tareas.pilas;

public class Pila {
    
    class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo raiz;  // Puntero al nodo superior de la pila

    public Pila() {
        raiz = null;  // Inicializar la raíz como null indica que la pila está vacía
    }

    public void push(int x) {
        Nodo nuevo;
        nuevo = new Nodo();  // Crear un nuevo nodo para el elemento a agregar
        nuevo.info = x;  // Asignar el valor al nuevo nodo
        if (raiz == null) {
            nuevo.sig = null;  // Si la pila está vacía, el nuevo nodo será el único
            raiz = nuevo;  // La raíz de la pila apunta al nuevo nodo
        } else {
            nuevo.sig = raiz;  // El nuevo nodo apunta al nodo que estaba en la cima de la pila
            raiz = nuevo;  // La raíz de la pila apunta al nuevo nodo
        }
    }

    public void imprimirPila() {
        Nodo aux = raiz;
        System.out.println("La pila tiene los siguientes valores: ");
        while (aux != null) {  // Recorrer la pila y mostrar los valores de cada nodo
            System.out.println(aux.info + "-");  // Imprimir el valor del nodo
            aux = aux.sig;  // Avanzar al siguiente nodo en la pila
        }
    }

    public int pop() {
        if (raiz != null) {
            int inf = raiz.info;  // Almacenar el valor del nodo en la cima de la pila
            raiz = raiz.sig;  // Eliminar el nodo de la cima de la pila
            return inf;  // Devolver el valor eliminado
        } else {
            return Integer.MAX_VALUE;  // Devolver un valor máximo para indicar que la pila está vacía
        }
    }

    public static void main(String[] args) {
        Pila pila1 = new Pila();  // Crear una nueva instancia de la clase Pila
        pila1.push(4);  // Agregar elementos a la pila
        pila1.push(9);
        pila1.push(133);

        pila1.imprimirPila();  // Imprimir la pila antes de eliminar un elemento
        pila1.pop();  // Eliminar un elemento de la pila
        pila1.imprimirPila();  // Imprimir la pila después de eliminar un elemento
    }
}
