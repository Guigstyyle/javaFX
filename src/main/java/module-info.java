module com.example.partie1.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.partie1.javafx to javafx.fxml;
    exports com.example.partie1.javafx;
}