package bg.tu_varna.sit.group30.courseprojecttest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {
    @FXML private Label title;

    @FXML private Button signInButton;

    @FXML private Label username;

    @FXML private Label password;

    @FXML private TextField usernameTextField;

    @FXML private TextField passwordTextField;

    @FXML private CheckBox showPassword;

    public void initialize(URL url, ResourceBundle resourceBundle) {
//        button_logOut.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                DBUtils.changeScene(actionEvent, "login.fxml", "Log In", null);
//            }
//        });
    }
}