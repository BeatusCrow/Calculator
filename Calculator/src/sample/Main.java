package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 600, 430));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void button_help() throws IOException {
        Parent root;
        root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("help_text.fxml")));
        Stage stage = new Stage();
        stage.setTitle("My New Stage Title");
        stage.setScene(new Scene(root, 357, 185));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}