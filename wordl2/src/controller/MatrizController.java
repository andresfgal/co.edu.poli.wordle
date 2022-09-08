package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class MatrizController {
	
	private Stage stage;
	@FXML
	private Label Titulo;
	@FXML
	private Button Botondeayuda;
	@FXML
	private TextField b1;
	@FXML
	private TextField c1;
	@FXML
	private TextField d1;
	@FXML
	private TextField e1;
	@FXML
	private TextField a2;
	@FXML
	private TextField b2;
	@FXML
	private TextField c2;
	@FXML
	private TextField d2;
	@FXML
	private TextField e2;
	@FXML
	private TextField a5;
	@FXML
	private TextField b5;
	@FXML
	private TextField c5;
	@FXML
	private TextField d5;
	@FXML
	private TextField e5;
	@FXML
	private TextField a4;
	@FXML
	private TextField b4;
	@FXML
	private TextField c4;
	@FXML
	private TextField d4;
	@FXML
	private TextField e4;
	@FXML
	private TextField a3;
	@FXML
	private TextField b3;
	@FXML
	private TextField c3;
	@FXML
	private TextField d3;
	@FXML
	private TextField e3;
	@FXML
	private TextField a6;
	@FXML
	private TextField b6;
	@FXML
	private TextField c6;
	@FXML
	private TextField d6;
	@FXML
	private TextField e6;
	@FXML
	private TextField a1;

	
	@FXML
	public void ayuda(ActionEvent event) throws IOException  {
		
		FXMLLoader loader= new FXMLLoader(getClass().getResource("/view/Instrucciones.fxml"));
		Parent root= loader.load();
		InstruccionesController controller = loader.getController();	
		Scene scene = new Scene (root);
		Stage stage = new Stage ();
		stage.setScene (scene);
		controller.init (stage, this);
		stage.show();
		this.stage.close();
	}


	public void setStage(Stage primaryStage) {
		stage = primaryStage;
		
	}


	public void show() {
		stage.show();
		
	}

}
