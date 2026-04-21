package fabricas;

import produtos.Documento;
import produtos.WordDocumento;

public class WordCreator extends DocumentoCreator {
    @Override
    public Documento criarDocumento(){
        return new WordDocumento();
    }
}
