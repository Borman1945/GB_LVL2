package lesson4.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Borman {
    @FXML
    public Label label;
    @FXML
    private Button button;


    @FXML
    public void onClick(ActionEvent actionEvent) {

        label.setText("Мишка все огонь!!!");
    }
    @FXML
    public void mouseEnter(MouseEvent mouseEvent) {
        System.out.println("На нас нажали");
    }
}
