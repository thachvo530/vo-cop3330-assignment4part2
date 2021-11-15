/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Vo Thach
 */


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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

import java.io.*;
import java.lang.invoke.VarHandle;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Scanner;

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

    public FileChooser fileChooser = new FileChooser();

    @FXML


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        name.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
        description.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        date.setCellValueFactory(new PropertyValueFactory<Item, String>("date"));
        status.setCellValueFactory(new PropertyValueFactory<Item, String>("status"));

        table.setEditable(true);
        description.setCellFactory(TextFieldTableCell.forTableColumn());
        date.setCellFactory(TextFieldTableCell.forTableColumn());

        fileChooser.setInitialDirectory(new File("src\\main\\java\\ucf\\assignments\\vocop3330assignment4part2"));



    }


    @FXML
    public void saveToDo(ActionEvent event) throws FileNotFoundException {

        File file = fileChooser.showSaveDialog(new Stage());
        if(file != null){
            saveFile(file);

        }
    }

    public void saveFile(File file) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < table.getItems().size(); i++)
        {
            printWriter.write(""+name.getCellData(i)+","+description.getCellData(i)+","+date.getCellData(i)+","+status.getCellData(i)+"\n");
        }
        printWriter.close();

    }


    @FXML
    public void loadToDo(ActionEvent event) throws IOException {

        File file = fileChooser.showOpenDialog(new Stage());
        Scanner inputStream = new Scanner(file);

        while (inputStream.hasNext()) {
            String data = inputStream.next();
            String[] values = data.split(",");
            Item item = new Item(values[0], values[1], values[2], values[3]);
            items.add(item);
        }

        table.setItems(items);
    }


    @FXML
    public void markCompleted(ActionEvent event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setStatus("Completed");
        table.getItems().add(table.getSelectionModel().getSelectedIndex(), item);
        table.getItems().remove(table.getSelectionModel().getSelectedIndex() - 1);
        table.refresh();

    }

    @FXML
    public void markIncomplete(ActionEvent event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setStatus("Incomplete");
        table.getItems().add(table.getSelectionModel().getSelectedIndex(), item);
        table.getItems().remove(table.getSelectionModel().getSelectedIndex() - 1);
        table.refresh();
    }

    @FXML
    public void deleteItem(MouseEvent event) {

        int selectedID = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(selectedID);
    }

    @FXML
    public void deleteAll(ActionEvent event) {

        table.getItems().clear();

    }

    @FXML
    public void showCompleted(MouseEvent event) {

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
    public void showIncomplete(MouseEvent event) {

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
    public void showAll(MouseEvent event) {

            table = helperShowAll();
        }


        public TableView<Item> helperShowAll(){

            table.setItems(items);

            return table;
        }


    @FXML
    public void addItem(ActionEvent event) {

        Item item = helperAddItem();
        items = table.getItems();
        items.add(item);
        table.setItems(items);

    }

    public Item helperAddItem(){

        return new Item(nameInput.getText(), descriptionInput.getText(), dateInput.getText(), "Incomplete");

    }

    @FXML
    public void editDescription(TableColumn.CellEditEvent<Item, String> event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setDescription(event.getNewValue());

    }

    @FXML
    public void editDate(TableColumn.CellEditEvent<Item, String> event) {

        Item item = table.getSelectionModel().getSelectedItem();
        item.setDate(event.getNewValue());

    }


}