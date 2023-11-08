module com.ppr.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.ppr.biblioteca to javafx.fxml;
    exports com.ppr.biblioteca;
}