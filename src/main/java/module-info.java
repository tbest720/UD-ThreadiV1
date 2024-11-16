module edu.miracosta.cs112.threadiv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.threadiv1 to javafx.fxml;
    exports edu.miracosta.cs112.threadiv1;
}