package homework5.view;

public class PersonView extends InputView {
    public PersonView() {
        super();
    }

    public int getPersonId() {
        System.out.print("Enter person id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }
}
