package application;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class SampleController implements Initializable {
    @FXML    private ComboBox<String> comboBox;
    @FXML    private CheckBox ch1;
    @FXML    private CheckBox ch2;
    @FXML    private CheckBox ch3;
    @FXML    private Button b1;
    @FXML    private Button b2;
    @FXML    private Button b3;
    @FXML    private TextArea ta; 
    @FXML    private Label lab;
    
	ObservableList<String> comboBoxList = 
			FXCollections.observableArrayList("페페로니 피자: 12,000원","포테이토 피자: 15,000원","불고기 피자: 18,000원","콤보 피자: 20,000원");

    String sel1 = "";
    String sel2 = "";
    
    int num1=0;
    int num2=0;
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {	
		comboBox.setValue("피자선택");
		comboBox.setItems(comboBoxList);	
	}
    
    @FXML
    void onClickbombo(ActionEvent event) {
    	String sel = comboBox.getValue() ;
    	int a = comboBox.getSelectionModel().getSelectedIndex(); 
       	ta.appendText(sel+"를 선택 \n");
    	
       	if(a==0)
    		num1 += 12000;
    	else 	if(a==1)
    		num1 += 15000;
    	else 	if(a==2)
    		num1 += 18000;
    	else 	if(a==3)
    		num1 += 20000;
       	
    	sel1+=sel +"\n";
    }
    
    @FXML
    void onClickb1(ActionEvent event) {
    	Integer number = num1+num2;
        NumberFormat numberFormatter;
        numberFormatter = NumberFormat.getNumberInstance();
        String quantityOut = numberFormatter.format(number);
    	 	
    	ta.setText("주문 내역");
    	ta.appendText("\n\n"+ sel1 + sel2 +"\n");
    	ta.appendText("\n total = "+ quantityOut +"원 입니다.\n");
    	lab.setText(quantityOut);
    }

    @FXML
    void onClickb2(ActionEvent event) {

    	if(ch1.isSelected())
    		ch1.fire();
    	if(ch2.isSelected())
    		ch2.fire();
    	if(ch3.isSelected())
    		ch3.fire();
    	
    	sel1="";
    	sel2="";
    	num1=0;
    	num2=0;
    	ta.setText(""); 
    }
    @FXML
    
    void onClickb3(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void onClickch1(ActionEvent event) {
    	if(ch1.isSelected()) {
    		ta.appendText(ch1.getText()+" 선택 \n");
    		num2+=2000;
        	sel2+=ch1.getText()+"\n";
    	}
    	if(ch1.isSelected()== false) {
    		ta.appendText(ch1.getText()+" 취소 \n");
    		num2-=2000;
        	sel2+=ch1.getText()+" 취소\n";
    	}
    }

    @FXML
    void onClickch2(ActionEvent event) {
    	if(ch2.isSelected()) {
    		ta.appendText(ch2.getText()+" 선택 \n");
    		num2+=1000;
        	sel2+=ch2.getText()+"\n";
    	}
    	if(ch2.isSelected()== false) {
    		ta.appendText(ch2.getText()+" 취소 \n");
    		num2-=1000;
        	sel2+=ch2.getText()+" 취소\n";
    	}
    }

    @FXML
    void onClickch3(ActionEvent event) {
    	if(ch3.isSelected()) {
    		ta.appendText(ch3.getText()+" 선택 \n");
    		num2+=500;
        	sel2+=ch3.getText()+"\n";
    	}
    	if(ch3.isSelected()== false) {
    		ta.appendText(ch3.getText()+" 취소 \n");
    		num2-=500;
        	sel2+=ch3.getText()+" 취소\n";
    	}

    }
	
}
