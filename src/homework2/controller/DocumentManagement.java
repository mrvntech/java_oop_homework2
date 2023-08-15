package homework2.controller;

import homework2.model.Document;
import homework2.model.DocumentType;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class DocumentManagement {
    public static Set<Document> documents = new HashSet<Document>();

    public static enum Action {
        ADD_DOCUMENT(1),
        REMOVE_DOCUMENT(2),
        GET_DOCUMENT_INFORMATION(3),
        GET_DOCUMENT_BY_TYPE(4),
        EXIT(5);

        private final int value;

        Action(int value) {
            this.value = value;
        }

        public static Optional<Action> getAction(int value) {
            Optional<Action> action = Optional.empty();
            for (Action _action : Action.values()) {
                if (_action.value == value) action = Optional.of(_action);
            }
            return action;
        }
    }

    public static void addDocument(Document document) {
        DocumentType documentType = document.getDocumentType();
        documents.add(document);
    }

    public static void removeDocument(String id) {
        documents.forEach(document -> {
            if (document.hashCode() == id.hashCode()) documents.remove(document);
        });
    }

    public static Optional<Document> getDocument(String id) {
        AtomicReference<Optional<Document>> searchedDocument = new AtomicReference<>(Optional.empty());
        documents.forEach(document -> {
            if (document.hashCode() == id.hashCode()) searchedDocument.set(Optional.of(document));
        });
        return searchedDocument.get();
    }

    public static Set<Document> getDocumentByType(DocumentType documentType) {
        Set<Document> searchedDocuments = new HashSet<Document>();
        documents.forEach(document -> {
            if (document.getDocumentType() == documentType) searchedDocuments.add(document);
        });
        return searchedDocuments;
    }

}
