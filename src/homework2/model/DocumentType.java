package homework2.model;


import java.util.Optional;

public enum DocumentType {
    BOOK(1),
    MAGAZINE(2),
    REPORT(3);
    private int value;

    DocumentType(int value) {
        this.value = value;
    }

    public static Optional<DocumentType> getDocumentType(int documentTypeValue) {
        Optional<DocumentType> documentType = Optional.empty();
        for (DocumentType _documentType : DocumentType.values()) {
            if (documentTypeValue == _documentType.value) documentType = Optional.of(_documentType);
        }
        return documentType;
    }
}
