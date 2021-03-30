package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.*;

import java.io.IOException;

public class ErrorPopup {


    volatile boolean isClosed = false;

    // screen size: 450 300.




    @FXML
    private Label prompt;

    @FXML
    private Button OKBtn;

    /*public Stage showErrorPopup (String str) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/ErrorPopup.fxml"));

        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setScene(new Scene(loader.load()));

        ErrorPopup controller = loader.getController();

    }*/

    @FXML
    void onOKBtnClicked(ActionEvent event) {
        isClosed = true;
    }

}
