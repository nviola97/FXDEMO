package bsu.comp152.firstguituesthurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.time.format.TextStyle;

public class calcwindow {
    @FXML
    private TextField numberDisplay;

    @FXML
    public void numberButtonPushed(ActionEvent event){
        var currentText = numberDisplay.getText();
        var currentNumberText = event.getSource().toString();
        var newText = currentText+currentNumberText;
    }
}
