module com.example.chatclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatclient to javafx.fxml;
    exports com.example.chatclient;
}