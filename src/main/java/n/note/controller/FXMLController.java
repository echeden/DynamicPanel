package n.note.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class FXMLController implements Initializable {

    @FXML
    private ListView<String> list;
    @FXML
    private TextField text;
    @FXML
    private Button button;

    ObservableList<String> strings = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        list.setItems(strings);

        button.setOnAction((event) -> {
            if (text.getText().length() > 0)
                strings.add(text.getText());
        });
    }
}