package com.empresa.javafx_jdbc_sp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    protected void onVerClientesButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("clientes-view.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.setTitle("Clientes");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
