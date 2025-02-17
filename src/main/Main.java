package main;

import main.controller.TaskManager;
import main.model.Task;

import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static TaskManager taskManager = new TaskManager();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        while (true) {
            greeting();
            int option = validateInt();


            switch (option) {
                case 1:
                    add();
                    break;
                case 2:
                    taskManager.listTasks();
                    break;

                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ошибка! Введите число от 1 до 6.\n");

            }

        }

    }
    private static void greeting() {
        System.out.println("-".repeat(50));
        System.out.println("1. Добавить задачу!");
        System.out.println("2. Просмотреть все задачи!");
        System.out.println("3. Обновить задачу!");
        System.out.println("4. Удалить задачу!");
        System.out.println("5. Искать задачу!");
        System.out.println("6. Выйти");
        System.out.print(">>>\t");

    }

    private static void add(){
        System.out.println("Введите навзвание задачи: ");
        String titlle = validate();
        System.out.println("Введите описание задачи: ");
        String description = validate();
        System.out.println("Введите приоритет задачи: (Важное , Среднее , Низкий) ");
        String priority = getInput("Низкий", "Среднее", "Важное");

        taskManager.addTask(titlle, description, priority);
    }
    private static void update() {
        System.out.println("Введите id задачи для расмотрение: ");
        int id = validateInt();
        if (taskManager.getTask(id) == null) {
            System.out.println("Такая задача не найдена");
            return;
        }


        System.out.println("Введите новое название: ");
        String newTitlle = validate();
        System.out.println("Введите новое описание: ");
        String newDescription = validate();
        System.out.println("Введите новый статус:(Сделать , В прогрессе , Сделано) ");
        String status = getInput("Сделать", "В прогрессе", "Сделано");
        System.out.println("Введите новый приоритет задачи: (Важное , Среднее , Низкий) ");
        String priority = getInput("Низкий", "Среднее", "Важное");
        taskManager.updateTask(id , newTitlle, newDescription , status , priority);
    }

    private static void delete() {
        System.out.println("Введите ID задачи для удаление: ");
        int deleteId = validateInt();
        taskManager.deleteTask(deleteId);
    }

    private static void search() {
        System.out.println("Введите название задачи: ");
        String searchTitlle = validate();
        taskManager.findTask(searchTitlle);

    }
    private static String getInput(String min, String mid, String high){
        while(true) {
             String value = scanner.nextLine();
            if (value.equalsIgnoreCase(high) ||
                    value.equalsIgnoreCase(mid) ||
                    value.equalsIgnoreCase(min) ) {
                return value;
            }
            System.out.printf("Ошибка! Введите корректные данные: (%s, %s , %s) \n"  , min , mid , high);
        }
    }
    private static String validate() {

        // Если строка пуста или же тупые пробелы сплошные или же если длина строки меньше 3 спросить ввести данные заново
        // Если Строка данная пользователем удовлетворяет наши требования то ВОЗВРАТ
        while(true) {
            String input = scanner.nextLine();
            if (input.trim().length() >= 3) {
                return input;
            }
            System.out.println("Ошибка! Введите корректное название (не менее 3 символов): ");
        }
    }
    private static int validateInt() {
        while (true){

            String option = scanner.nextLine().trim();
            try {
                return Integer.parseInt(option);
        }
            catch (Exception e) {
                System.out.println("Введите корректное число!");


        }

    }
    }
}
