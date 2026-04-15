module com.mycompany.cercaevent {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cercaevent to javafx.fxml;
    opens com.mycompany.cercaevent.login to javafx.fxml;
    
    exports com.mycompany.cercaevent;
    exports com.mycompany.cercaevent.login;
    exports com.mycompany.cercaevent.serveis;
}
