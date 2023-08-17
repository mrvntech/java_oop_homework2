package homework13;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    static enum Action {
        ;
        private int value;

        Action(int value) {
            this.value = value;
        }

        public static Optional<Action> getAction(int value) {
            for (Action action : Action.values()) {
                if (action.value == value) return Optional.of(action);
            }
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
//        boolean isProgramRunning = true;
//        while (isProgramRunning) {
//
//        }

//        throw new RuntimeException("abc");
        try {

            throw new Exception("abc");
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}
