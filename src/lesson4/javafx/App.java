package lesson4.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("borman.fxml")); //загрузить сцену
        primaryStage.setTitle("Java FX");
        primaryStage.setScene(new Scene(root, 450, 400));
        primaryStage.show();
    }

    public static void main(String... arg){
        launch(arg);
    }
}


