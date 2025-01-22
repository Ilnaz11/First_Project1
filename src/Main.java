import ProjectCommands.Project;

import java.util.Scanner;


public class Main {

    public Main() {
        System.out.println("[PROJECT-CREATE] ");
    }

    public void addUsers(String name, int age, String surname, String lastName) {
        Project per = new Project(name, age, surname, lastName);
        per.getId();
    }

    public static void main(String[] args) {

        Main main = new Main();
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
                main.addUsers(name, age, surname, lastName);
                System.out.println("[ПОЛЬЗОВАТЕЛЬ СОХРАНЕН]");
            } catch (NumberFormatException e) {
                System.out.println("Возраст должен быть числом.\nВводите данные по новой");
            }
            break;
        }
    }
}
