import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class scenecontroller2 {

	@FXML
	Label nameLabel;
	
	public void displayName(String username) {
		nameLabel.setText("Hello: " + username);
	}
	
}