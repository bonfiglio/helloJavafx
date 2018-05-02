package sample;

//import java.awt.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label lab;

    public void btnPres (ActionEvent ev) {
        System.out.println("beddu");

    }

    public void handleCiao(ActionEvent actionEvent) {
        lab.setText(" CIAO BELLO");
    }
}
