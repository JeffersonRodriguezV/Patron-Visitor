package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        // Crear un documento
        Documento documento = new Documento();
        documento.agregarElemento(new Parrafo("Este es un párrafo de ejemplo."));
        documento.agregarElemento(new Imagen("imagen1.png"));
        documento.agregarElemento(new Parrafo("Otro párrafo con más contenido."));

        // Crear e inicializar el visitante para contar palabras
        ContadorPalabrasVisitor contadorPalabrasVisitor = new ContadorPalabrasVisitor();

        // Realizar el análisis del documento
        documento.aceptar(contadorPalabrasVisitor);

        // Obtener el resultado del análisis
        int conteoPalabras = contadorPalabrasVisitor.obtenerConteoPalabras();
        System.out.println("Número total de palabras en el documento: " + conteoPalabras);
    }
    
}
