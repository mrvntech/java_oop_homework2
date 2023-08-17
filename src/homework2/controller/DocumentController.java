package homework2.controller;

//import homework2.view.CreateBook;
import homework2.model.action.Action;
import homework2.model.document.Document;
import homework2.model.document.DocumentType;
import homework2.view.DocumentManagementView;

import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class DocumentController {
//    public void createDocument(Scanner scanner) {
//        int documentTypeInput = DocumentManagementView.getDocumentType(scanner);
//        Optional<DocumentType> documentType = DocumentType.getDocumentType(documentTypeInput);
//        if (documentType.isPresent()) {
//            switch (documentType.get()) {
//                case BOOK -> {
//                    CreateBook createBook = new CreateBook();
//                    String id = createBook.getId(scanner);
//                    String publisher = createBook.getPublisher(scanner);
//                    String author = createBook.getAuthor(scanner);
//                    int pageNumber = createBook.getPageNumber(scanner);
//                    int publishNumber = createBook.getPublishNumber(scanner);
//                    DocumentManagement.addDocument(new Book(id, publisher, publishNumber, author, pageNumber));
//                }
//                case MAGAZINE -> {
//                    CreateMagazine createMagazine = new CreateMagazine();
//                    String id = createMagazine.getId(scanner);
//                    String publisher = createMagazine.getPublisher(scanner);
//                    int publishNumber = createMagazine.getPublishNumber(scanner);
//                    int month = createMagazine.getMonth(scanner);
//                    int number = createMagazine.getNumber(scanner);
//                    DocumentManagement.addDocument(new Magazine(id, publisher, publishNumber, month, number));
//                }
//                case REPORT -> {
//                    CreateReport createReport = new CreateReport();
//                    String id = createReport.getId(scanner);
//                    String publisher = createReport.getPublisher(scanner);
//                    int publishNumber = createReport.getPublishNumber(scanner);
//                    int date = createReport.getDate(scanner);
//                    DocumentManagement.addDocument(new Report(id, publisher, publishNumber, date));
//                }
//            }
//        } else {
//            System.out.println("Document type do not exited.");
//        }
//    }

    public void getDocumentInformation(Scanner scanner) {
//        String id = DocumentManagementView.getDocumentId(scanner);
//        Optional<Document> document = DocumentManagement.getDocument(id);
//        if (document.isPresent()) {
//            System.out.println(document.toString());
//        } else {
//            System.out.println("Document is not exited");
//        }
    }

    public void getDocumentsByType(Scanner scanner) {
//        int documentTypeInput = DocumentManagementView.getDocumentType(scanner);
//        Optional<DocumentType> documentType = DocumentType.getDocumentType(documentTypeInput);
//        if (documentType.isPresent()) {
//            Set<Document> documents = DocumentManagement.getDocumentByType(documentType.get());
//            documents.forEach(document -> {
//                System.out.println(document.toString());
//            });
//        } else {
//            System.out.println("Document type is not existed");
//        }
    }

//    public void removeDocumentById(Scanner scanner) {
//        String id = DocumentManagementView.getDocumentId(scanner);
//        DocumentManagement.removeDocument(id);
//        System.out.println("Remove document success");
//    }
}
