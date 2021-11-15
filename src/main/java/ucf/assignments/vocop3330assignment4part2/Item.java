/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Vo Thach
 */


package ucf.assignments.vocop3330assignment4part2;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Item {

    private String name;
    private String description;
    private String date;
    private String status;

    public Item(String name, String description, String date, String status) {

        LocalDate localDate = LocalDate.parse(date);
        date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

