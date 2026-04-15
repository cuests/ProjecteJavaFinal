package com.mycompany.cercaevent.login;

import java.io.IOException;

import com.mycompany.cercaevent.App;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private TextField usuariField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField msg;

    @FXML
    private void validarUsuari () throws IOException{
        try {
            //ServeiUsuari.existeixUsuari(usuariField.getText(), passwordField.getText());
            App.setRoot("secondary");
            msg.setText("Usuari validat");
        } catch (Exception e) {
            msg.setText("Error: " + e.getMessage());
        }

    }
    
}
