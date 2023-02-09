module com.example.task08 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.task08 to javafx.fxml;
    exports com.example.task08;
    exports Model;
    opens Model to javafx.fxml;
}