package co.edu.uniquindio.poo;

public class ContadorPalabrasVisitor implements Visitor {

    private int contadorPalabras;

    public void visitar(Documento documento) {
        // No se realiza ninguna acción específica en el documento
    }

    public void visitar(Parrafo parrafo) {
        String[] palabras = parrafo.contenido.split("\\s+");
        contadorPalabras += palabras.length;
    }

    public void visitar(Imagen imagen) {
        // No se realiza ninguna acción específica en la imagen
    }

    public int obtenerConteoPalabras() {
        return contadorPalabras;
    }
    
}
