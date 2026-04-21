package fabricas;

import produtos.Documento;
import produtos.PdfDocumento;

public class PdfCreator extends DocumentoCreator {
    @Override
    public Documento criarDocumento() {
        return new PdfDocumento();
    }
}
