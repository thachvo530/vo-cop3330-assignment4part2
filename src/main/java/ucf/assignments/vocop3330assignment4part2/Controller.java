package ucf.assignments.vocop3330assignment4part2;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Item> table;

    @FXML
    private TableColumn<Item, String> name;

    @FXML
    private TableColumn<Item, String> description;

    @FXML
    private TableColumn<Item, String> date;

    @FXML
    private TableColumn<Item, String> status;

    @FXML
    private TextField nameInput;

    @FXML
    private TextField descriptionInput;

    @FXML
    private TextField dateInput;

    @FXML
    private TextField statusInput;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        name.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        description.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        date.setCellValueFactory(new PropertyValueFactory<Item, String>("date"));
        status.setCellValueFactory(new PropertyValueFactory<Item, String>("status"));
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
    void addItem(ActionEvent event) {

        Item item = new Item(nameInput.getText(), descriptionInput.getText(), dateInput.getText(), statusInput.getText());
        ObservableList<Item> items = table.getItems();
        items.add(item);
        table.setItems(items);

    }

}

