package ProjectServise;

import ProjectCommands.Project;
import ProjectCommands.ProjectCreate;
import ProjectRepository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

public class ProjectServise {
    private List<Project> users = new ArrayList<>();
    private ProjectRepository repository;

    public ProjectServise(ProjectRepository repository) {
        this.repository = repository;
    }

    public void addUser(Project user) {
        users.add(user);

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

    public void getUser() {
        for (int i = 0; i <users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
    public void deleteUser(Project user) {
        users.remove(user);
    }

    public void createUser(String surname, String name, String lastName, int age) {
        // Добавить логику на возраст,не может быть отрицательным
        if(age < 0) {
            System.out.println("Возраст не может быть отрицательным");
        } else if(age == 0) {
            System.out.println("Возраст не может быть равен 0");
        }
        Project project = new Project(surname, name, lastName, age);
        repository.addUser(project);
        System.out.println("[ПОЛЬЗОВАТЕЛЬ СОЗДАН]");
    }

}
