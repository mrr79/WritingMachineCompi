module org.example.compilador {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.antlr.antlr4.runtime;

    opens org.example.compilador to javafx.fxml;
    exports org.example.compilador;
}