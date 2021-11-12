/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Thach Vo
 */

package ucf.assignments.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void switchToListView() {

    }

    @Test
    void switchToHomeMenu() {
    }

    @Test
    void addListName() {
        /*
            create listview
            create test name
            check if test name is added to list
         */
    }

    @Test
    void viewToDo() {
        /*
            create listview
            create test name
            run viewToDo function
            test if test name is equal to function result
         */
    }

    @Test
    void editToDo() {
        /*
            create listview
            create test name
            create desired edited name
            run edit function on test name
            compare to see if the edited name is the desired edited name
         */
    }

    @Test
    void deleteToDo() {

        /*
            create listview
            input multiple elements into list view
            run delete function on element
            check if desired element was deleted
         */
    }

    @Test
    void saveToDo() {
        /*
            create a sample output file
            input same contents of sample output file into another
            check if output file is created and the same as the sample
         */
    }

    @Test
    void saveAll() {
        /*
            create multiple sample output files
            input same contents of sample output files into other files
            check if outputs are the same
         */
    }

    @Test
    void loadToDo() {
        /*
            create sample output file
            use load function to put file into list view
            check if listview has same elements as output file
         */
    }

    @Test
    void loadMulti() {
        /*
            create multiple output files
            use load multi function to put files into listview
            check if listview elements are same as the output files
         */
    }

    @Test
    void markCompleted() {
        /*
            create table
            use markcompleted function to set an item as completed
            check if item is completed
         */
    }

    @Test
    void deleteItem() {
        /*
            create table
            run delete function
            check if item is deleted from table
         */
    }

    @Test
    void showCompleted() {
        /*
            create table
            implement elements with complete and incomplete status
            run showCompleted function on table
            create table with only completed elements
            compare two tables for equality
         */
    }

    @Test
    void showIncomplete() {
        /*
            create table
            implement elements with complete and incomplete status
            run showincomplete function on table
            create table with only incomplete elements
            compare two tables for equality
         */
    }

    @Test
    void addItem() {
        /*
            create a sample item with name, descrption, and due date
            use additem function to create same item as sample
            check if the two items are the same
         */
    }
}