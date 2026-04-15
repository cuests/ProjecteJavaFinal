package com.mycompany.cercaevent.login;

import java.io.IOException;

import com.mycompany.cercaevent.App;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }
}