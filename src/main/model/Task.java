package main.model;

public class Task {

    private static int counter = 1;

    private int id;
    private String titlle;
    private String description;
    private String status;
    private String priority;

    public Task(String titlle, String description, String priority) {
        this.id = counter++;
        this.titlle = titlle;
        this.description = description;
        this.status = "Сделать";
        this.priority = priority;
    }

    public String getTitlle() {
        return titlle;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }


    public int getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public void setTitlle(String titlle) {
        this.titlle = titlle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return
                 id + " | " +
                 titlle + " | " +
                 description + " | " + "Статус: " +
                 status + " | " + "Приоритет: " +
                         priority + "|"
                ;
    }
}
