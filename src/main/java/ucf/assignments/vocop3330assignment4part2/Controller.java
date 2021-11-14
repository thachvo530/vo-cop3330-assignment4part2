package ucf.assignments.vocop3330assignment4part2;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.concurrent.Task;
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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.Locale;
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

    public static ObservableList<Item> items = FXCollections.observableArrayList();




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        name.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        description.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        date.setCellValueFactory(new PropertyValueFactory<Item, String>("date"));
        status.setCellValueFactory(new PropertyValueFactory<Item, String>("status"));

        table.setEditable(true);
        description.setCellFactory(TextFieldTableCell.forTableColumn());
        date.setCellFactory(TextFieldTableCell.forTableColumn());



    }


    @FXML
    void saveToDo(ActionEvent event) {

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
    void markCompleted(ActionEvent event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setStatus("Completed");
        table.getItems().add(table.getSelectionModel().getSelectedIndex(), item);
        table.getItems().remove(table.getSelectionModel().getSelectedIndex() - 1);
        table.refresh();


    }

    @FXML
    void deleteItem(MouseEvent event) {

        int selectedID = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(selectedID);
    }

    @FXML
    void deleteAll(ActionEvent event) {

        table.getItems().clear();

    }

    @FXML
    void showCompleted(MouseEvent event) {

        ObservableList<Item> completeItems = FXCollections.observableArrayList();

        for (int i = 0; i < table.getItems().size(); i++) {

            if (status.getCellData(i).equals("Completed")) {

                Item item = new Item(name.getCellData(i), description.getCellData(i), date.getCellData(i), status.getCellData(i));
                completeItems.add(item);
            }

        }
        table.setItems(completeItems);
    }

    @FXML
    void showIncomplete(MouseEvent event) {

        ObservableList<Item> incompleteItems = FXCollections.observableArrayList();

        for (int i = 0; i < table.getItems().size(); i++) {

            if (status.getCellData(i).equals("Incomplete")) {

                Item item = new Item(name.getCellData(i), description.getCellData(i), date.getCellData(i), status.getCellData(i));
                incompleteItems.add(item);
            }

        }
        table.setItems(incompleteItems);
    }

    @FXML
    void showAll(MouseEvent event) {

            table.setItems(items);
        }


    @FXML
    void addItem(ActionEvent event) {

        Item item = new Item(nameInput.getText(), descriptionInput.getText(), dateInput.getText(), "Incomplete");
        items = table.getItems();
        items.add(item);
        table.setItems(items);

    }

    @FXML
    void editDescription(TableColumn.CellEditEvent<Item, String> event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setDescription(event.getNewValue());

    }

    @FXML
    void editDate(TableColumn.CellEditEvent<Item, String> event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setDate(event.getNewValue());

    }


}