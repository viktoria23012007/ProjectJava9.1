module com.example.main7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main7 to javafx.fxml;
    exports com.example.main7;
}