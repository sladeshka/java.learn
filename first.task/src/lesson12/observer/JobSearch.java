package lesson12.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancies("Junior Java Developer");
        site.addVacancies("Intern Java Developer");

        Observer subscriber1 = new Subscriber("Ivanov Ivan");
        Observer subscriber2 = new Subscriber("Petrov Petr");

        site.addObserver(subscriber1);
        site.addObserver(subscriber2);

        site.addVacancies("Trainee Java Developer");
        // As soon as we have added a new vacancy, all subscribers are notified

        site.removeVacancies("Junior Java Developer");
        // the same with deletion, subscribers are also notified
    }
}
