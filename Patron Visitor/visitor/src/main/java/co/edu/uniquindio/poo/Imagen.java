package co.edu.uniquindio.poo;

public class Imagen extends ElementoBase {

    public Imagen(String contenido) {
        super(contenido);
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
    
}
