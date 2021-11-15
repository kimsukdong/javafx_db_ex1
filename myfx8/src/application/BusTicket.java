package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BusTicket  extends Application  {
	public static Stage primaryStage;
	public static Stage checkDialogStage;
	Parent root;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		showMainView();
	}

	
	public void showMainView() {
		try {
			root = FXMLLoader.load(getClass().getResource("BusMain.fxml"));
			Scene scene = new Scene(root,1500,1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stopMainView() {
		primaryStage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
