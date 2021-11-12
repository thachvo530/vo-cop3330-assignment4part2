package ucf.assignments.vocop3330assignment4part2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Controller {


    @FXML
    private TextField listName;

    @FXML
    private ListView<String> listOfListName;


    @FXML
    void saveToDo(MouseEvent event) {

        /*
            on mouse click of save to do list button
                saves current selected to do list
                outputs csv containing items of list
         */
    }

    @FXML
    void loadToDo(MouseEvent event) {

        /*
            on mouse click of load to do list
                prompts user for csv file
                parses file
                loads to do list into list view
         */
    }


    @FXML
    void markCompleted(MouseEvent event) {

        /*
            on mouse click of mark Completed button
                sets item status as completed
         */
    }

    @FXML
    void deleteItem(MouseEvent event) {

        /*
            on mouse click of Delete button
                deletes selected item and all of its contents
         */
    }

    @FXML
    void showCompleted(MouseEvent event) {

        /*
            on mouse click of Show only completed button
                filters table and displays completed items
         */
    }

    @FXML
    void showIncomplete(MouseEvent event) {

        /*
            on mouse click of Show only incomplete
                filters table and displays incomplete items
         */
    }

    @FXML
    void addItem(MouseEvent event) {

        /*
            take in user input for item name, description, and due date
            on mouse click of add buttom
                creates a new item in the table
         */
    }

}

