package co.edu.uniquindio.poo;

public interface Visitor {

    void visitar(Documento documento);
    void visitar(Parrafo parrafo);
    void visitar(Imagen imagen);
    
}
