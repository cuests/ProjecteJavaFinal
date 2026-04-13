module com.mycompany.cercaevent {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cercaevent to javafx.fxml;
    exports com.mycompany.cercaevent;
}
