public class Test {
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();

        lista.Enqueue(5);
        lista.Enqueue(8);
        lista.Enqueue(3);
        lista.Enqueue(12);
        lista.Enqueue(0);
        lista.Enqueue(89);
        lista.Enqueue(77);
        lista.Dequeue();
        lista.Dequeue();
        lista.Dequeue();
        lista.print();
    // Los resultados son los esperados, ya que por la estructura de cola que tiene la lista, los primeros en ser incluidos son los primeros en desencolarse
    }
}
