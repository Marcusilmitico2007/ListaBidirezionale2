public class Nodo {
    private int dato;
    private Nodo precedente;
    private Nodo successivo;

    
    public Nodo(int dato) {
        this.dato = dato;
        this.precedente = null;
        this.successivo = null;
    }

    
    public int getDato() {
        return dato;
    }

    
    public void setDato(int dato) {
        this.dato = dato;
    }

    
    public Nodo getPrecedente() {
        return precedente;
    }

    
    public void setPrecedente(Nodo precedente) {
        this.precedente = precedente;
    }

    
    public Nodo getSuccessivo() {
        return successivo;
    }

    
    public void setSuccessivo(Nodo successivo) {
        this.successivo = successivo;
    }

    
    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", precedente=" + (precedente != null ? precedente.dato : "null") +
                ", successivo=" + (successivo != null ? successivo.dato : "null") +
                '}';
    }
}
