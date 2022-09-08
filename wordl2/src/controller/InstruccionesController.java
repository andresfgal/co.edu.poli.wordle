package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InstruccionesController {
	
	private MatrizController controllermatriz;
	private Stage stage;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane2;

    @FXML
    private TextArea instrucciones; 
   
    @FXML
    private Button botonregresar;

    @FXML
    void regresar(ActionEvent event) /*throws IOException */{
    	
    	controllermatriz.show();
    	stage.close();

    }

	public void init(Stage stage, MatrizController matrizController) {
		this.controllermatriz = matrizController;
		this.stage = stage;
		
		
	}

}
