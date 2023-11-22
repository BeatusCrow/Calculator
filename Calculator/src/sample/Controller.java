package sample;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controller {

    @FXML
    private Button button;

    @FXML
    public void onClickMethod() throws IOException {
        Main.button_help();
    }
}
