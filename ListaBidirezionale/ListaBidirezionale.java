public class ListaBidirezionale {
    private Nodo testa;
    private Nodo coda;

    public ListaBidirezionale() {
        testa = null;
        coda = null;
    }

    // Aggiunge un nodo in fondo alla lista
    public void addTail(int dato) {
        Nodo nuovo = new Nodo(dato);
        if (testa == null) {
            testa = coda = nuovo;
        } else {
            coda.setSuccessivo(nuovo);
            nuovo.setPrecedente(coda);
            coda = nuovo;
        }
    }

    // Stampa la lista dal primo all'ultimo elemento
    public void stampaAvanti() {
        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println(corrente);
            corrente = corrente.getSuccessivo();
        }
    }

    // Stampa la lista dall'ultimo al primo elemento
    public void stampaIndietro() {
        Nodo corrente = coda;
        while (corrente != null) {
            System.out.println(corrente);
            corrente = corrente.getPrecedente();
        }
    }
}
