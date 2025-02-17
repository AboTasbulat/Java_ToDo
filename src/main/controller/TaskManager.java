package main.controller;

import main.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description, String priority) {

        Task newTask = new Task(title, description, priority );
        newTask.setStatus("TODO");
        tasks.add(newTask);
        System.out.println("Задача " + title + " добавлена успешно");

    }

    public void listTasks() {

        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void updateTask(int id, String title, String description, String status, String priority) {

        Task task = getTask(id);
        if (task == null) {
            System.out.println("Такого id нету");
            return;
        }
        task.setTitlle(title);
        task.setDescription(description);
        task.setStatus(status);
        task.setPriority(priority);

        System.out.println("Задача " + id + " обновлена! ");
    }

    public void deleteTask(int id) {

        Task task = getTask(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Задача с ID " + id + " успешно удалена.");
            return;
        }
        System.out.println("Задача " + id + " не найдено!");


    }

    public void findTask(String titlle) {
        ArrayList<Task> find = new ArrayList<>();
        for (Task task : tasks) {

            if (task.getTitlle().equalsIgnoreCase(titlle)) {
                find.add(task);
            }
        }
        if (find.isEmpty()) {

            System.out.println("Задача " + titlle + " не существует!");
        } else {
            for (Task task : find) {
                System.out.println(task);
            }
        }


    }

    public Task getTask(int id) {

        Task foundTask = null;
        for (Task task : tasks) {
            if (task.getId() == id) {
                foundTask = task;
                break;
            }


        }
        return foundTask;
    }

}
