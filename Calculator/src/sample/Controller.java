package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.util.Objects;


public class Controller {

    public String old_text = "";
    public String themes = "light";

    @FXML
    public AnchorPane anchor_pane;

    @FXML
    public TextField text_field;

    @FXML
    public Button button_1;
    @FXML
    public Button button_2;
    @FXML
    public Button button_3;
    @FXML
    public Button button_4;
    @FXML
    public Button button_5;
    @FXML
    public Button button_6;
    @FXML
    public Button button_7;
    @FXML
    public Button button_8;
    @FXML
    public Button button_9;
    @FXML
    public Button button_0;
    @FXML
    public Button button_plus;
    @FXML
    public Button button_divide;
    @FXML
    public Button button_minus;
    @FXML
    public Button button_multiply;
    @FXML
    public Button button_equals;
    @FXML
    public Button button_dote;
    @FXML
    public Button button_themes;
    @FXML
    public Button button_delete;
    @FXML
    public Button button_bracket_start;
    @FXML
    public Button button_bracket_end;
    @FXML
    public Button button_sqrt;

    @FXML
    public Text text_calculator;

    @FXML
    public void onClickMethod(ActionEvent event){
        Button button = (Button) event.getSource();
        checkID(button);
    }

    @FXML
    public void onClickThemes(ActionEvent event) {
        if(Objects.equals(this.themes, "light")){
            this.themes = "dark";
            Change_themes();
            System.out.println("night");
        }
        else if(Objects.equals(this.themes, "dark")){
            this.themes = "light";
            Change_themes();
            System.out.println("day");
        }
    }


    public void Change_themes(){
        if(Objects.equals(this.themes, "light")){
            button_1.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_2.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_3.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_4.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_5.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_6.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_7.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_8.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_9.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_0.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_plus.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_minus.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_divide.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_multiply.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_equals.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_dote.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_bracket_start.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_bracket_end.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_sqrt.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            button_delete.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            text_field.setStyle("-fx-background-color: #f4f4f4; -fx-text-fill: #000000");
            anchor_pane.setStyle("-fx-background-color: #f4f4f4;");
            button_themes.setStyle("-fx-background-color: #f4f4f4; -fx-border-color: #f4f4f4;");
            button_themes.setTextFill(Paint.valueOf("#000000"));
            button_themes.setText("☾");
            text_calculator.setFill(Paint.valueOf("#000000"));
        }
        else if(Objects.equals(this.themes, "dark")){
            button_1.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_2.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_3.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_4.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_5.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_6.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_7.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_8.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_9.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_0.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_plus.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_minus.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_divide.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_multiply.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_equals.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_dote.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_bracket_start.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_bracket_end.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_sqrt.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            button_delete.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            text_field.setStyle("-fx-background-color: #2b2a2f; -fx-text-fill: #f4f4f4;");
            anchor_pane.setStyle("-fx-background-color: #2b2a2f;");
            button_themes.setStyle("-fx-background-color: #2b2a2f; -fx-border-color: #2b2a2f;");
            button_themes.setTextFill(Paint.valueOf("#f5f5f5"));
            button_themes.setText("⛅");
            text_calculator.setFill(Paint.valueOf("#f5f5f5"));

        }
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
                old_text = old_text + "+";
            } else if (button.getId().equals("button_minus")) {
                text_field.setText(old_text + "-");
                old_text = old_text + "-";
            } else if (button.getId().equals("button_multiply")) {
                text_field.setText(old_text + "•");
                old_text = old_text + "•";
            } else if (button.getId().equals("button_divide")) {
                text_field.setText(old_text + "/");
                old_text = old_text + "/";
            } else if (button.getId().equals("button_dote")) {
                text_field.setText(old_text + ".");
                old_text = old_text + ".";
            } else if (button.getId().equals("button_bracket_start")) {
                text_field.setText(old_text + "(");
                old_text = old_text + "(";
            } else if (button.getId().equals("button_bracket_end")) {
                text_field.setText(old_text + ")");
                old_text = old_text + ")";
            } else if (button.getId().equals("button_sqrt")) {
                text_field.setText(old_text + "sqrt(");
                old_text = old_text + "sqrt(";
            }
        }
    }

    @FXML
    public void onMouseInto(MouseEvent event){
        Button button = (Button) event.getSource();
        if(Objects.equals(this.themes, "light")){
            if(Objects.equals(button.getStyle(), "-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;")){
                button.setStyle("-fx-background-color: #4b7e80; -fx-border-color: #000000;");
            }
            else if(Objects.equals(button.getStyle(), "-fx-background-color: #f4f4f4; -fx-border-color: #f4f4f4;")){
                button.setStyle("-fx-background-color: #dbdbdb; -fx-border-color: #000000;");
            }
        }
        else if(Objects.equals(this.themes, "dark")){
            if(Objects.equals(button.getStyle(), "-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;")){
                button.setStyle("-fx-background-color: #df6737d9; -fx-border-color: #2b2a2f;");
            }
            else if(Objects.equals(button.getStyle(), "-fx-background-color: #2b2a2f; -fx-border-color: #2b2a2f;")){
                button.setStyle("-fx-background-color: #222125; -fx-border-color: #f4f4f4;");
            }
        }
    }

    @FXML
    public void onMouseOut(MouseEvent event){
        Button button = (Button) event.getSource();
        if(Objects.equals(this.themes, "light")){
            if(Objects.equals(button.getStyle(), "-fx-background-color: #4b7e80; -fx-border-color: #000000;")){
                button.setStyle("-fx-background-color: #5F9EA0; -fx-border-color: #f4f4f4;");
            }
            else if(Objects.equals(button.getStyle(), "-fx-background-color: #dbdbdb; -fx-border-color: #000000;")){
                button.setStyle("-fx-background-color: #f4f4f4; -fx-border-color: #f4f4f4;");
            }
        }
        else if(Objects.equals(this.themes, "dark")){
            if(Objects.equals(button.getStyle(), "-fx-background-color: #df6737d9; -fx-border-color: #2b2a2f;")){
                button.setStyle("-fx-background-color: #f97038e0; -fx-border-color: #2b2a2f;");
            }
            else if(Objects.equals(button.getStyle(), "-fx-background-color: #222125; -fx-border-color: #f4f4f4;")){
                button.setStyle("-fx-background-color: #2b2a2f; -fx-border-color: #2b2a2f;");
            }
        }
    }

    @FXML
    public void onClickDelete(){
        old_text = old_text.substring(0, old_text.length() - 1);
        text_field.setText(old_text);
    }

    @FXML
    public void onClickEquals(){
        text_field.setText(old_text + " ");
        old_text = old_text + " ";

        double answer = Mathematics.Convert(old_text);
        text_field.setText(String.valueOf(answer));
    }
}
