import ProjectCommands.ProjectCreate;
import ProjectCommands.ProjectUsers;
import ProjectRepository.ProjectRepository;
import ProjectServise.ProjectServise;


public class Main {

    public static void main(String[] args) {
        ProjectRepository repository = new ProjectRepository();

//        ProjectServise servise = new ProjectServise();

        ProjectCreate projectCreate = new ProjectCreate();
        projectCreate.start();
//        consoleApp.start();
    }
}
