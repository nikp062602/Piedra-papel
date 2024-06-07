module com.example.piedra_papel_tijera {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piedra_papel_tijera to javafx.fxml;
    exports com.example.piedra_papel_tijera;
}