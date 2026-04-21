# Padrão Factory Method em Java

Este projeto demonstra a implementação do **padrão de projeto Factory Method** em Java.  
O objetivo é encapsular a lógica de criação de objetos em métodos de fábrica, permitindo que subclasses decidam qual classe concreta instanciar.

## Estrutura do Projeto

- **Documento (interface)** → Define o contrato para os documentos (`abrir()`).
- **PdfDocumento / WordDocumento** → Implementações concretas da interface `Documento`.
- **DocumentoCreator (classe abstrata)** → Declara o método de fábrica `criarDocumento(): Documento`.
- **PdfCreator / WordCreator** → Implementações concretas que sobrescrevem o método de fábrica para criar documentos específicos.
- **App** → Classe cliente que utiliza o `DocumentoCreator` sem conhecer diretamente os documentos concretos.
