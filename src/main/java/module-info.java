module dev.abdulrahmanalblooshi {
    requires javafx.controls;
    requires javafx.fxml;

    opens dev.abdulrahmanalblooshi to javafx.fxml;
    exports dev.abdulrahmanalblooshi;
}
