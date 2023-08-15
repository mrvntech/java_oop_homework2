package homework10;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Document {
    private String document;

    public Document(String document) {
        this.document = document;
    }

    public Document() {
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int countWord() {
        String[] words = document.split("\\s+");
        return words.length;
    }

    public String standardizeDocument() {
        String[] words = document.split("\\s+");
        AtomicReference<String> standardizeDocument = new AtomicReference<>("");
        Arrays.stream(words).forEach(word -> {
            standardizeDocument.set(standardizeDocument + word + " ");
        });
        return standardizeDocument.get();
    }

}
