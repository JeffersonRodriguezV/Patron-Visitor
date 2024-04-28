package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Documento implements ElementoDocumento {

    private List<ElementoDocumento> elementos;

    public Documento() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoDocumento elemento) {
        elementos.add(elemento);
    }

    public void aceptar(Visitor visitor) {
        for (ElementoDocumento elemento : elementos) {
            elemento.aceptar(visitor);
        }
        visitor.visitar(this);
    }
    
}
