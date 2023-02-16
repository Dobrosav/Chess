module com.dobrosav.chess2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dobrosav.chess2 to javafx.fxml;
    exports com.dobrosav.chess2;
}