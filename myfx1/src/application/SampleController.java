package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    void onClickB1(ActionEvent event) {
    	int i = Integer.parseInt(tf1.getText());
    	double d1 = i*1.6;
    	tf2.setText("변환 결과 = "+d1);
    }

    @FXML
    void onClickB2(ActionEvent event) {
    	System.exit(0);
    }

}
