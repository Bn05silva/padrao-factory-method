package app;

import fabricas.DocumentoCreator;
import fabricas.PdfCreator;
import fabricas.WordCreator;
import produtos.Documento;


public class App {
    public static void main(String[] args) {
        DocumentoCreator creator = new PdfCreator();
        Documento doc = creator.criarDocumento();
        doc.abrir();

        creator = new WordCreator();
        doc = creator.criarDocumento();
        doc.abrir();
    }
}
