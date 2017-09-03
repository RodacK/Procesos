package app;

import java.io.IOException;

import app.model.Estado;
import app.model.Proceso;
import app.view.PrincipalController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Principal extends Application {
	 private Stage primaryStage;
	 private Pane  panel;
	@Override
	public void start(Stage primaryStage) {

		 this.primaryStage = primaryStage;
	     this.primaryStage.setTitle("Procesos");
	     initLayout();
	     primaryStage.setFullScreen(true);
	}
	public void initLayout() {
        try {

        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Principal.class.getResource("view/Principal.fxml"));
            panel = (Pane) loader.load();
            PrincipalController controller = loader.getController();
            controller.setPrincipal(this);
            Scene scene = new Scene(panel);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public Principal(){

	 }
	public static void main(String[] args) {
		launch(args);
	}
}
