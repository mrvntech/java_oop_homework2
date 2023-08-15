package homework2.view;

import homework2.model.Document;

import java.util.Optional;
import java.util.Scanner;

public interface CreateDocument {
    String getId(Scanner scanner);

    String getPublisher(Scanner scanner);

    int getPublishNumber(Scanner scanner);
}
