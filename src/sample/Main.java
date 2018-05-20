package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override //riscrivo il metodo start della classe Application
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("HelloMe.fxml")); //carico form fxml
        primaryStage.setTitle("Hello World HI JAVA FX  nice to meet you "); // imposto titolo
        primaryStage.setScene(new Scene(root)); // imposto scena con form
        primaryStage.show(); // attivo scena
    }


    public static void main(String[] args) {
        launch(args);
    }
}
