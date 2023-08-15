package homework5.view;

import java.util.Scanner;

public abstract class InputView {
    protected Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }
}
