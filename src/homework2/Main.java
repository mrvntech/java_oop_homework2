package homework2;

import homework2.controller.DocumentManagement;
import homework2.model.action.Action;
import homework2.view.DocumentManagementView;

public class Main {
    public static boolean isProgramRunning = true;

    public static void sutDownProgram() {
        isProgramRunning = false;
    }

    public static void main(String[] args) {
        DocumentManagement.run();
    }
}
