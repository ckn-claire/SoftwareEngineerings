package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPage {

    @FXML
    private TextField idInput;

    @FXML
    private PasswordField pwInput;

    @FXML
    private Button loginBtn;

    @FXML
    void onLoginBtnClicked(ActionEvent event) {
        String id = idInput.getText();
        String pw = pwInput.getText();

        System.out.println(id);
        System.out.println(pw);
        //验证逻辑
        //跳转到主页
    }

}

