module com.example.latihann {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihann to javafx.fxml;
    exports com.example.latihann;
}