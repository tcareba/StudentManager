module me.serbob.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.serbob.studentmanager to javafx.fxml;
    exports me.serbob.studentmanager;
}