package homework4.view;

public class PersonView extends InputView {
    public PersonView() {
        super();
    }

    public int getId() {
        System.out.print("Enter person id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public int getAge() {
        System.out.print("Enter person age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public String getFullName() {
        System.out.print("Enter person full name: ");
        return scanner.nextLine();
    }

    public String getJob() {
        System.out.print("Enter person job: ");
        return scanner.nextLine();
    }
}
