package com.mycompany.cercaevent.login;

import java.io.IOException;

import javafx.fxml.FXML;
import com.mycompany.cercaevent.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }
}