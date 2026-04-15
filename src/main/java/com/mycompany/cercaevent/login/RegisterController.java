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
    private void crearUsuari () throws IOException{
        try {
            ServeisUsuari.crearUsuari(usuariField.getText(), passwordField.getText());
            App.setRoot("secondary");
            msg.setText("Usuari creat");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            msg.setText("Error: " + e.getMessage());
            msg.setVisible(true);
        }


    }

}
