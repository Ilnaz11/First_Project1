package ProjectCommands;

public class ProjectUsers {

    protected static void addUser(String name, int age, String surname, String lastName) {
        Project per = new Project(surname, name, lastName, age);
        per.getId();
    }
    private String getUser() {
        return "Str";
    }
}
