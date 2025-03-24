package ProjectCommands;

import ProjectRepository.ProjectRepository;
import ProjectServise.ProjectServise;

import java.util.Scanner;

public class ProjectCreate {
    private boolean run = true;
    private ProjectServise servise;
    private Scanner scanner = new Scanner(System.in);

//    public ProjectCreate(ProjectServise servise) {
//        this.servise = servise;
    public void start() {
        while (run) {
            System.out.println(" 1: [СОЗДАТЬ ПОЛЬЗОВАТЕЛЯ]");
            System.out.println(" 2: [УДАЛИТЬ ПОЛЬЗОВАТЕЛЯ]");
            System.out.println(" 3: [ПОКАЗАТЬ ПОЛЬЗОВАТЕЛЯ]");
            System.out.println(" 4: [НАЙТИ ПОЛЬЗОВТАЕЛЯ ПО ИДЕНТИФИКАТОРУ]");
            System.out.println(" 5: [ВЫХОД]");

            int pick = Integer.parseInt(scanner.nextLine());
            switch (pick) {
                case 1:
                    createUser();
                    break;
                case 2:
                    ProjectRepository.deleteUser();
                    break;
                case 3:
                    ProjectRepository.displayUser();
                    break;
                case 4:
                    ProjectRepository.findById();
                    break;
                case 5:
                    run = false;
                    break;
            }
            // Написать switch-case с логикой 1,2,3,4
        }
    }

    public void createUser() {
        while (true) {
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
                start();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Возраст должен быть числом.\nВводите данные по новой");
            }
        }
    }
}