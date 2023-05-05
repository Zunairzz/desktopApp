package com.example.loginfrom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController implements Initializable {


    @FXML
    private TableView<Person> table;

    @FXML
    private TableColumn<Person, Integer> id;

    @FXML
    private TableColumn<Person, String> name;

    @FXML
    private TableColumn<Person, String> about;

    @FXML
    private TableColumn<Person, String> phoneNo;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<Person> people = FXCollections.observableArrayList(
                new Person(1, "Zunair", "I am a developer", "03244165642"),
                new Person(2, "Hamza", "I am a Teacher", "023457844367"),
                new Person(3, "Ali", "I am a Teacher", "023457844367"),
                new Person(4, "Talha", "I am a Teacher", "023457844367"),
                new Person(6, "Usama", "I am a Teacher", "023457844367")
        );
        id.setCellValueFactory(new PropertyValueFactory<Person, Integer>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<Person, String>("Name"));
        about.setCellValueFactory(new PropertyValueFactory<Person, String>("About"));
        phoneNo.setCellValueFactory(new PropertyValueFactory<Person, String>("Phone #"));
        table.setItems(people);
    }
}
