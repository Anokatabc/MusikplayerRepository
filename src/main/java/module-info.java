module com.example.doit_musikplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.doit_musikplayer to javafx.fxml;
    exports com.example.doit_musikplayer;
    exports com.example.doit_musikplayer.model;
    opens com.example.doit_musikplayer.model to javafx.fxml;
    exports com.example.doit_musikplayer.controller;
    opens com.example.doit_musikplayer.controller to javafx.fxml;
}