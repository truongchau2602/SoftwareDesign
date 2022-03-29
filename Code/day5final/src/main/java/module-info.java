module com.example.day5final {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.day5final to javafx.fxml;
    exports com.example.day5final;
}