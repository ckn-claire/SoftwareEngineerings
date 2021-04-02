package Controller;

import NetBeans.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginPage {
    @FXML
    private TextField idInput;

    @FXML
    private PasswordField pwInput;


    @FXML
    private TextField regUserName;

    @FXML
    private PasswordField regPw;

    @FXML
    private PasswordField regPwConfirm;

    /**
     * @Description: Login and register check, check if the input string is correct.
     * @Param:
     * @return:
     * @Author: CloudKing
     * @Date: 2021/3/30
     */
    @FXML
    void onLoginBtnClicked(ActionEvent event) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Error");
        alert.setHeaderText("Login failed");


        ValidChecker Checker = new ValidChecker();
        String id = idInput.getText();
        String pw = pwInput.getText();
        if (Checker.isInvalidID(id)) {
            System.out.println("error");
            alert.setContentText("Failed reason : ID is invalid");
            alert.show();
            return;
        } else {

            if (Checker.isInvalidPw(pw)) {
                alert.setContentText("Failed reason : Password is invalid");
                alert.show();
                return;
            }

        }
        //todo 此处是格式通过验证
        System.out.println("OK");

        if(Checker.isValidAccount(id,pw)){
            System.out.println("Login success");
        }





        //todo 此处将此user对象传递给检查存在函数（外部class），看是否存在该用户。不存在则窗口提示，存在则继续

        //todo 存在该用户，跳转到登陆后页面，并且将User对象传递给下一个页面的Controller（外部class，进入下一环节）

    }

    @FXML
    void onRegBtnClicked(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("Error");
        alert.setHeaderText("Register failed");


        ValidChecker Checker = new ValidChecker();
        String id = regUserName.getText();
        String pw1 = regPw.getText();
        String pw2 = regPwConfirm.getText();
        //todo 合法则存储该对象到User中
        if (Checker.isInvalidID(id)) {
            System.out.println("error");
            alert.setContentText("Failed reason : ID is invalid");
            alert.show();
            return;
        } else {
            if (Checker.isInvalidPw(pw1)) {

                alert.setContentText("Failed reason : Password1 is invalid");
                alert.show();
                return;
            } else {
                if (Checker.isInvalidPw(pw2)) {

                    alert.setContentText("Failed reason : Password2 is invalid");
                    alert.show();
                    return;
                } else {
                    if (!Checker.isSameString(pw1, pw2)) {
                        alert.setContentText("Failed reason : Password1 and Password2 is different");
                        alert.show();
                        return;
                    }
                }
            }
        }
        // end if-else
        //todo 字符串格式通过
        System.out.println("OK");




    }
}
