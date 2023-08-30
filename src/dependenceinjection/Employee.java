package dependenceinjection;

public class Employee {
    private OnboardingTask onboardingTask;

    public Employee(OnboardingTask onboardingTask) {
        this.onboardingTask = onboardingTask;
    }

    public String getOnboardingInformation() {
        return "Documents: " + onboardingTask.getOnBoardingDocuments() + ", Actions: "
                + onboardingTask.getOnboardingActions();
    }

    public void setOnboardingTask(OnboardingTask onboardingTask) {
        this.onboardingTask = onboardingTask;
    }
}
