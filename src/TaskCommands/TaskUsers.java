package TaskCommands;

import ProjectCommands.Project;

public class TaskUsers {
    protected static void addUsers(String name, int age, String surname, String lastName) {
        Project per = new Project(surname, name, lastName, age);
        per.getId();
    }
}
