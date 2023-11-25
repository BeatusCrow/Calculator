package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {

    public String old_text = "";

    @FXML
    public TextField text_field;

    @FXML
    public void onClickMethod(ActionEvent event){
        Button button = (Button) event.getSource();
        checkID(button);
    }

    private void checkID(Button button){
        boolean count_id = false;
        for(int i = 0; i <= 9; i++){
            if(button.getId().equals("button_" + i)){
                text_field.setText(old_text + i);
                old_text = old_text + i;
                count_id = true;
            }
        }
        if(!count_id) {
            if (button.getId().equals("button_plus")) {
                text_field.setText(old_text + "+");
                old_text = old_text + " + ";
            } else if (button.getId().equals("button_minus")) {
                text_field.setText(old_text + "-");
                old_text = old_text + " - ";
            } else if (button.getId().equals("button_multiply")) {
                text_field.setText(old_text + "•");
                old_text = old_text + " • ";
            } else if (button.getId().equals("button_divide")) {
                text_field.setText(old_text + "/");
                old_text = old_text + " / ";
            } else if (button.getId().equals("button_dote")) {
                text_field.setText(old_text + ".");
                old_text = old_text + ".";
            }
        }
    }

    @FXML
    public void onMouseInto(MouseEvent event){
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: #4b7e80; -fx-border-color: #000000;");
    }

    @FXML
    public void onMouseOut(MouseEvent event){
        Button button = (Button) event.getSource();
        button.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
    }

    @FXML
    public void onClickEquals(){
        text_field.setText(old_text + " ");
        old_text = old_text + " ";

        double answer = Mathematics.Convert(old_text);
        text_field.setText(String.valueOf(answer));
    }
}
