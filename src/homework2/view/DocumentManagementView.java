package homework2.view;

import homework2.model.action.Action;
import homework2.model.document.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;


public class DocumentManagementView {
    public static Scanner scanner = new Scanner(System.in);

    public static DocumentType getDocumentType() {
        Optional<DocumentType> documentType = Optional.empty();
        while (true) {
            System.out.println("Please input a number to choose document type,\n" +
                    "1 to create book,\n" +
                    "2 to create a magazine,\n" +
                    "3 to create a report");
            if (scanner.hasNextInt()) {
                documentType = DocumentType.getDocumentType(scanner.nextInt());
                if (documentType.isPresent()) {
                    break;
                }
            }
            scanner.nextLine();
        }
        return documentType.get();
    }

    public static Action getAction() {
        Optional<Action> action = Optional.empty();
        while (true) {
            System.out.println("Please input a number to choose action type,\n" +
                    "1 to add document,\n" +
                    "2 to remove document,\n" +
                    "3 to get document information,\n" +
                    "4 to get documents by type,\n" +
                    "5 to exit program");
            if (scanner.hasNextInt()) {
                action = Action.getActionType(scanner.nextInt());
                if (action.isPresent()) {
                    break;
                }
            }
            scanner.nextLine();
        }
        return action.get();
    }

    public static int getId() {
        int id;
        while (true) {
            System.out.print("Enter document id: ");
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            }
        }
        return id;
    }

    public static String getPublisherName() {
        while (true) {
            String publisherName;
            System.out.print("Enter document publisher name: ");
            if (scanner.hasNextLine()) {
                publisherName = scanner.nextLine();
                if (!Objects.equals(publisherName, "")) return publisherName;
            }
        }
    }

    public static int getPublishNumber() {
        int publishNumber;
        while (true) {
            System.out.print("Enter publish number: ");
            if (scanner.hasNextInt()) {
                publishNumber = scanner.nextInt();
                break;
            }
            scanner.nextLine();
        }
        return publishNumber;
    }

    public static String getAuthorName() {
        while (true) {
            String authorName;
            System.out.print("Enter author name: ");
            authorName = scanner.nextLine();
            if (!authorName.equals("")) return authorName;
        }
    }

    public static int getPageNumber() {
        int pageNumber;
        while (true) {
            System.out.println("Enter page number: ");
            if (scanner.hasNextInt()) {
                pageNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            }
        }
        return pageNumber;
    }

    public static String getPublishDate() {
        while (true) {
            String publishDate;
            System.out.println("Enter publish date: ");
            publishDate = scanner.nextLine();
            if (!publishDate.equals("")) return publishDate;
        }
    }

    public static int getNumber() {
        int number;
        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.nextLine();
                break;
            }
        }
        return number;
    }

    public static String getPublishMonth() {
        while (true) {
            String publishMonth;
            System.out.print("Enter publish month: ");
            publishMonth = scanner.nextLine();
            if (!publishMonth.equals("")) return publishMonth;
        }
    }

    public static Optional<Document> getDocument() {
        DocumentType documentType = getDocumentType();
        switch (documentType) {
            case BOOK -> {
                int id = getId();
                String publisherName = getPublisherName();
                int publishNumber = getPublishNumber();
                String authorName = getAuthorName();
                int pageNumber = getPageNumber();
                return Optional.of(new Book(id, publisherName, publishNumber, authorName, pageNumber));
            }
            case MAGAZINE -> {
                int id = getId();
                String publisherName = getPublisherName();
                int publishNumber = getPublishNumber();
                String publishMonth = getPublishMonth();
                int number = getNumber();
                return Optional.of(new Magazine(id, publisherName, publishNumber, publishMonth, number));
            }
            case REPORT -> {
                int id = getId();
                String publisherName = getPublisherName();
                int publishNumber = getPublishNumber();
                String publishDate = getPublishDate();
                return Optional.of(new Report(id, publisherName, publishNumber, publishDate));
            }
            default -> {
                return Optional.empty();
            }
        }

    }

    public static void main(String[] args) {
//        System.out.println(getPublisherName());
        System.out.println(getPublishNumber());
    }
}
