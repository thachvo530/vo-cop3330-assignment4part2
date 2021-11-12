package ucf.assignments.vocop3330assignment4part2;


import java.time.LocalDate;

public class Item {

    private String name;
    private String description;
    private LocalDate date;
    private String status;

    public Item(String name, String description, LocalDate date, String status) {

        this.name = name;
        this.description = description;
        this.date = date;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

