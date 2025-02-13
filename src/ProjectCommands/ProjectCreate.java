package ProjectCommands;

import ProjectRepository.ProjectRepository;
import ProjectServise.ProjectServise;

import java.util.Scanner;

public class ProjectCreate {
    private ProjectServise servise;
    private Scanner scanner = new Scanner(System.in);

    public ProjectCreate(ProjectServise servise) {
        this.servise = servise;
    }
    public void start() {
        while (true) {
            System.out.println(" 1: [СОЗДАТЬ ПОЛЬЗОВАТЕЛЯ]");
            System.out.println(" 2: [УДАЛИТЬ ПОЛЬЗОВАТЕЛЯ]");
            System.out.println(" 3: [ПОКАЗАТЬ ПОЛЬЗОВАТЕЛЯ]");
            System.out.println(" 4: [ВЫХОД]");

            String pick = scanner.nextLine();
            switch (pick) {
                case "1":
                    createUser();
                    break;
                case "2":
                    ProjectRepository.deleteUser();
                    break;
                case "3":
                    ProjectRepository.displayUser();
                    break;
                case "4":
                    break;
            }
            break;
            // Написать switch-case с логикой 1,2,3,4
        }
    }

    private void createUser() {
        System.out.println("[СОЗДАНИЕ ПОЛЬЗОВАТЕЛЯ] ");
        System.out.println("[ВВЕДИТЕ ФАМИЛИЮ]");
        String surname = scanner.nextLine();
        System.out.println("[ВВЕДИТЕ ИМЯ]");
        String name = scanner.nextLine();
        System.out.println("[ВВЕДИТЕ ОТЧЕСТВО]");
        String lastName = scanner.nextLine();
        System.out.println("[ВВЕДИТЕ ВОЗРАСТ]");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
            ProjectUsers.addUser(name, age, surname, lastName);
            System.out.println("[ПОЛЬЗОВАТЕЛЬ СОХРАНЕН]");
        } catch (NumberFormatException e) {
            System.out.println("Возраст должен быть числом.\nВводите данные по новой");
        }
    }
}