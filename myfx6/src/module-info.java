module myfx6 {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
