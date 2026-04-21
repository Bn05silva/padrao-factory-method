package produtos;

public class PdfDocumento implements Documento{
    @Override
    public void abrir() {
        System.out.println("Abrindo documento PDF...");
    }
}
