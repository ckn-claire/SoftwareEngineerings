package Controller;

import NetBeans.User;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileInfo implements Initializable {



    @FXML
    private Label userNameHolder;

    public void initData(User user) {
        userNameHolder.setText(user.getId()+"-11111");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
