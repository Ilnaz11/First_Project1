package ProjectRepository;

import ProjectCommands.Project;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {
    private static List<Project> users = new ArrayList<>();

    public void addUser(Project user) {
        users.add(user);

    }
    public void getUser() {
        for (int i = 0; i <users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
    public Project findById(int id) {
        for (int i = 0; i < users.size(); i++) {
            Project project = users.get(i);
            if(project.getId() == id) {
                return project;
            }
        }
        return null;
    }
    public static void deleteUser(Project user) {
        users.remove(user);
    }
    public static void displayUser() {
        Project project = users.get(0);
        System.out.println(project);
    }
}
