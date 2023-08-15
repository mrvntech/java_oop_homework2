package homework3.view;

public class CandidateView extends InputView {
    public CandidateView() {
        super();
    }

    public int getId() {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String getFullName() {
        System.out.print("Enter full name: ");
        return scanner.nextLine();
    }

    public String getAddress() {
        System.out.print("Enter address: ");
        return scanner.nextLine();
    }

    public int getPriority() {
        System.out.print("Enter priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        return priority;
    }
};
