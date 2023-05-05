module com.example.loginfrom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginfrom to javafx.fxml;
    exports com.example.loginfrom;
}