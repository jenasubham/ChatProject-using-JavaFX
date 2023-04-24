module com.example.chatserver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatserver to javafx.fxml;
    exports com.example.chatserver;
}