package homework3;

import homework3.controller.ActionTypeController;
import homework3.controller.CandidateController;
import homework3.view.ActionTypeView;
import homework3.view.CandidateView;
import homework3.view.CombinationSubjectView;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static boolean isProgramRunning = true;

    public static void shutDownProgram() {
        isProgramRunning = false;
    }

    public static void main(String[] args) {
        ActionTypeController actionController = new ActionTypeController(new ActionTypeView());
        CandidateController candidateController = new CandidateController(new CandidateView(), new CombinationSubjectView());
        while (isProgramRunning) {
            Optional<ActionType> actionType = actionController.getActionType();
            if (actionType.isPresent()) {
                switch (actionType.get()) {
                    case CREATE_CANDIDATE -> {
                        candidateController.createCandidate();
                    }
                    case GET_CANDIDATE_BY_ID -> {
                        candidateController.getCandidateById();
                    }
                    case GET_CANDIDATE_INFORMATION -> {
                        candidateController.getCandidateInformation();
                    }
                    case EXIT -> {
                        shutDownProgram();
                    }
                }
            } else {
                System.out.println("Action is not existed");
            }
        }
    }
}
