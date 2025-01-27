package ProjectCommands;

public class ProjectUsers {

    protected static void addUsers(String name, int age, String surname, String lastName) {
        Project per = new Project(name, age, surname, lastName);
        per.getId();
    }
}
