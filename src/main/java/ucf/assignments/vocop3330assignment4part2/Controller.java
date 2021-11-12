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

    private Stage stage;
    private Scene scene;
    private Parent root;

    // switches scene to view items of current list
    public void switchToListView(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("todoListview.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // brings user back to home menu
    public void switchToHomeMenu(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("homeMenu.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private TextField listName;

    @FXML
    private ListView<String> listOfToDo;

    @FXML
    void addListName(MouseEvent event) {

        /* on mouse click of add button
            add user input for listName
         */
    }

    @FXML
    void viewToDo(MouseEvent event) {

        /* on mouse click
            views currently selected to do list
         */


    }

    @FXML
    void editToDo(MouseEvent event) {

        /*
            on mouse click of edit to do list button
                prompts user for edit
                changes current list name to user input
         */
    }

    @FXML
    void deleteToDo(MouseEvent event) {

        /*
            on mouse click of delete to do list button
                deletes selected to do list
         */
    }

    @FXML
    void saveToDo(MouseEvent event) {

        /*
            on mouse click of save to do list button
                saves current selected to do list
                outputs csv containing items of list
         */
    }

    @FXML
    void saveAll(MouseEvent event) {

        /*
             on mouse click of save all button
                saves all current to do lists
                outputs lists to csv file
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
    void loadMulti(MouseEvent event) {

        /*
            on mouse click of load multiple
                prompts user for multiple files
                parses
                loads files into list view
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

