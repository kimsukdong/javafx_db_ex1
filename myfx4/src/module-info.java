module myfx4 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	
	opens searchapp to javafx.graphics, javafx.fxml;
}
