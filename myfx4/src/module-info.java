module myfx4 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens searchapp to javafx.graphics, javafx.fxml;
}
