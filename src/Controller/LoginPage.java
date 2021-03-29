package Controller;

import NetBeans.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPage {
/*
    @FXML
    private PasswordField pwInput;


    @FXML
    private TextField idInput;

    @FXML
    private Button register;

    @FXML

    private TextField weight;

    @FXML
    private TextField pwd;


    @FXML
    private TextField age;

    @FXML
    private TextField username;

    @FXML
    private TextField height;


    @FXML
    void registClickbtn(ActionEvent event) throws IOException {
        Stage stage = (Stage) register.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/register.fxml"));
        Scene scene = new Scene(root, 800, 600);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onLoginBtnClicked(ActionEvent event) {
        String id = idInput.getText();
        String pw = pwInput.getText();

        System.out.println(id);
        System.out.println(pw);
        //验证逻辑
        //跳转到主页


    }
    //todo 看看能不能分开成两个java类来实现跳转，一个太冗余了
    //用来保存信息
    @FXML
    void saveInfo(ActionEvent event) {
        String password = pwd.getText();
        String name = username.getText();
        String Age = age.getText();


        String Height=height.getText();
        String Weight=weight.getText();


        System.out.println(password);
        System.out.println(name);
        System.out.println(Age);
        System.out.println(Height);
        System.out.println(Weight);
      //todo 将输入的信息保存到txt文件当中

    }*/

    @FXML
    private TextField idInput;

    @FXML
    private PasswordField pwInput;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField regUserName;

    @FXML
    private TextField regPw;

    @FXML
    private TextField regPwConfirm;

    @FXML
    private Button loginBtn1;

    @FXML
    void onLoginBtnClicked(ActionEvent event) {
        String id = idInput.getText();
        String pw = pwInput.getText();

        //todo 此处检查id，pw是否合法，不合法则在窗口提示信息，合法则继续

        // Instantiate a new user, set the id and pw for it.
        User user = new User(id, pw);

        //todo 此处将此user对象传递给检查存在函数，看是否存在该用户。不存在则窗口提示，存在则继续

        //todo 存在该用户，跳转到登陆后页面
    }

    @FXML
    void onRegBtnClicked(ActionEvent event) {

    }

}
