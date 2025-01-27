package TaskCommands;

import ProjectCommands.ProjectUsers;

import java.util.Scanner;

public class TaskCreate {

    public void projectComannds() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
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
                TaskUsers.addUsers(name, age, surname, lastName);
                System.out.println("[ПОЛЬЗОВАТЕЛЬ СОХРАНЕН]");
            } catch (NumberFormatException e) {
                System.out.println("Возраст должен быть числом.\nВводите данные по новой");
            }
            break;
        }
    }
}
