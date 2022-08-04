module com.example.simcal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simcal to javafx.fxml;
    exports com.example.simcal;
}