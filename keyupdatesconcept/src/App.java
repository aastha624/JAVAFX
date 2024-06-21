

	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class App extends Application {
	
	@Override
	public void start(Stage stage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scenekey.fxml"));
		Parent root = loader.load();	
		controller15 controller = loader.getController();
		Scene scene = new Scene(root);		
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				switch(event.getCode()) {
				
				case W:
					controller.moveUp();
					break;
				case S:
					controller.moveDown();
					break;
				case A:
					controller.moveLeft();
					break;
				case D:
					controller.moveRight();
					break;
				default:
					break;
				}		
			}	
		});

		stage.setScene(scene);
		stage.show();
	}	

	public static void main(String[] args) {
		launch(args);
	}
}

