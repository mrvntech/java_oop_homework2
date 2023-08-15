package homework3.controller;

import homework3.model.Candidate;
import homework3.model.CombinationSubject;
import homework3.view.CandidateView;
import homework3.view.CombinationSubjectView;

import java.util.*;
import java.util.stream.Collectors;

public class CandidateController {
    private final CandidateView candidateView;
    private final CombinationSubjectView combinationSubjectView;
    private final HashMap<Integer, Candidate> candidates = new HashMap<>();

    public CandidateController(CandidateView candidateView, CombinationSubjectView combinationSubjectView) {
        this.candidateView = candidateView;
        this.combinationSubjectView = combinationSubjectView;
    }

    public void createCandidate() {
        int id = candidateView.getId();
        String fullName = candidateView.getFullName();
        String address = candidateView.getAddress();
        int priority = candidateView.getPriority();
        ArrayList<Integer> combinationSubjects = combinationSubjectView.getSubject();
        Candidate candidate = new Candidate(id, fullName, address, priority, new ArrayList<>(combinationSubjects.stream().map(CombinationSubject::getCombinationSubject
        ).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList())));
        candidates.put(candidate.hashCode(), candidate);
    }

    public void getCandidateById() {
        int id = candidateView.getId();
        Candidate candidate = candidates.get(id);
        System.out.println(candidate.toString());
    }

    public void getCandidateInformation() {
        candidates.forEach((key, candidate) -> {
            System.out.println(candidate.toString());
        });
    }

    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController(new CandidateView(), new CombinationSubjectView());
        candidateController.createCandidate();
        candidateController.getCandidateInformation();
    }
}
