public class Main {
    public static void main(String[] args) {
        ListaBidirezionale lista = new ListaBidirezionale();

        
        lista.addTail(10);
        lista.addTail(20);
        lista.addTail(30);

        
        System.out.println("Lista in avanti:");
        lista.stampaAvanti();

        
        System.out.println("\nLista all'indietro:");
        lista.stampaIndietro();

        ListaBidirezionale l2 = new ListaBidirezionale();
        l2.addHead(30);
        l2.addHead(20);
        l2.addHead(10);

        System.out.println("Lista2 in avanti:");
        l2.stampaAvanti();
        
    }
}
