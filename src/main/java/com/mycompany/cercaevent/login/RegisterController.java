package com.mycompany.cercaevent.login;

import java.io.IOException;

import com.mycompany.cercaevent.App;
import com.mycompany.cercaevent.serveis.ServeisUsuari;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {
    @FXML
    private TextField usuariField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label msg;

    @FXML
    private void validarUsuari () throws IOException{
        try {
            ServeisUsuari.existeixUsuari(usuariField.getText(), passwordField.getText());
            App.setRoot("secondary");
            msg.setText("Usuari validat");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            msg.setText("Error: " + e.getMessage());
            msg.setVisible(true);
        }

    }

}
