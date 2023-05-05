package com.example.loginfrom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Label text;

    @FXML
    private ImageView imageView;

    @FXML
    private ImageView sideImage;

    @FXML
    protected void doLogin(ActionEvent event) {
        String userName = username.getText();
        String Password = password.getText();

        if (userName.equalsIgnoreCase("admin") && Password.equalsIgnoreCase("admin")) {
            text.setText("Successfully login!");
            text.setTextFill(Color.rgb(20, 108, 148));
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dash-board.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                // Hide the current (login) stage
                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                currentStage.hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            text.setText("Wrong password");
            text.setTextFill(Color.RED);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image("file:./login.png");
        imageView.setImage(image);
        Image side = new Image("file:./home.png");
        sideImage.setImage(side);
    }
}