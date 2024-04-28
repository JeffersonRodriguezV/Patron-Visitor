package co.edu.uniquindio.poo;

public class Parrafo extends ElementoBase {

    public Parrafo(String contenido) {
        super(contenido);
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
    
}
