package ProjectRepository;

import ProjectCommands.Project;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectRepository {

    private static Scanner scanner = new Scanner(System.in);
    public static List<Project> users = new ArrayList<>();

    public void addUser(Project user) {
        users.add(user);

    }
    public static void deleteUser() {
        System.out.println("[ВВЕДИТЕ ID ПОЛЬЗОВАТЕЛЯ КОТОРОГО ВЫ ХОТИТЕ УДАЛИТЬ]");
        int id = 0;
        while (true) {
            try {
                id = scanner.nextInt();
                if (Project.getId() == id) {
                    System.out.println("[ПОЛЬЗОВАТЕЛЬ НАЙДЕН]");
                    int finalId = id;
                    boolean removed = users.removeIf(person -> person.getId() == finalId);
                    if (removed) {
                        System.out.println("[ПОЛЬЗОВАТЕЛЬ С ID: " + id + " - БЫЛ УДАЛЕН.]");
                        break;
                    } else {
                        System.out.println("[ПОЛЬЗОВАТЕЛЬ С ID: " + id + " - НЕ НАЙДЕН.]");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("[ОШИБКА - НУЖНО ВВЕСТИ ЧИСЛО]");
            }
        }
    }

    public static void displayUser() {
        if (users.isEmpty()) {
            System.out.println("[СПИСОК ПУСТ]");
        } else {
            Project project = users.get(0);
            System.out.println(project);
        }
    }

    public void getUser() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));

        }
    }

    public static Project findById() {
        System.out.println("[ВВЕДИТЕ ID ПОЛЬЗОВАТЕЛЯ КОТОРОГО ХОТИТЕ НАЙТИ]");
        int id = 0;
        try {
            id = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("[ОШИБКА - НУЖНО ВВЕСТИ ЧИСЛО]");
        }
        for (int i = 0; i < users.size(); i++) {
            Project project = users.get(i);
            if (project.getId() == id) {
                System.out.println("[ПОЛЬЗОВАТЕЛЬ С ID:  " + id + " ЕСТЬ В БАЗЕ]");
                displayUser();
                return project;
            }
        }
        System.out.println("[С ТАКИМ ИДЕНТИФИКАТОРОМ ПОЛЬЗОВАТЕЛЯ НЕ СУЩЕСТВУЕТ]");
        return null;
    }
}