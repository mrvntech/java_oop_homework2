package homework3.controller;

import homework3.model.Subject;
import homework3.view.CandidateView;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CandidateController {
    public void createCandidate(Scanner scanner) {
        CandidateView candidateView = new CandidateView();
        SubjectController subjectController = new SubjectController();
        int id = candidateView.getId();
//        String fullName = candidateView.getFullName(scanner);
//        String address = candidateView.getAddress(scanner);
//        int priority = candidateView.getPriority(scanner);
//        ArrayList<Integer> subjectInputs = candidateView.getSubject(scanner);
//        ArrayList<Optional<Subject>> subjects = subjectInputs.stream().filter(subjectInput -> {
//            return subjectController.getSubject(subjectInput).isPresent();
//        }).collect(
//                Collectors.toList()
//        );
    }

    public static void main(String[] args) {
        CandidateView candidateView = new CandidateView();
        SubjectController subjectController = new SubjectController();
        int id = candidateView.getId();
        System.out.println(id);
    }
}
