package homework3.controller;

import homework3.model.action.ActionType;
import homework3.model.candidate.Candidate;
import homework3.model.candidate.CombinationSubject;
import homework3.view.CandidateManagementView;

import java.util.*;

public class CandidateController {
    private static final ArrayList<Candidate> candidates = new ArrayList<Candidate>();

    public static void createCandidate() {
        int id = CandidateManagementView.getId();
        String fullName = CandidateManagementView.getFullName();
        String address = CandidateManagementView.getAddress();
        int priority = CandidateManagementView.getPriority();
        CombinationSubject combinationSubject = CandidateManagementView.getCombination();
        Candidate candidate = new Candidate(id, fullName, address, priority, combinationSubject);
        candidates.add(candidate);
    }

    public static void getCandidateById() {
        int id = CandidateManagementView.getId();
        Optional<Candidate> searchCandidate = candidates.stream().filter(candidate -> candidate.getId() == id).findFirst();
        searchCandidate.ifPresent(candidate -> System.out.println(candidate.toString()));
    }

    public static void getCandidatesInformation() {
        candidates.forEach(candidate -> {
            System.out.println(candidate.toString());
        });
    }

    public static ActionType getAction() {
        return CandidateManagementView.chooseAction();
    }

    public static void run() {
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            ActionType actionType = getAction();
            switch (actionType) {
                case EXIT -> {
                    isProgramRunning = false;
                }
                case GET_CANDIDATE_INFORMATION -> {
                    getCandidatesInformation();
                }
                case GET_CANDIDATE_BY_ID -> {
                    getCandidateById();
                }
                case CREATE_CANDIDATE -> {
                    createCandidate();
                }
            }
        }
    }
}
