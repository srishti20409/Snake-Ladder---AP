module com.example.approjectkritarthversion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.approjectkritarthversion to javafx.fxml;
    exports com.example.approjectkritarthversion;
}