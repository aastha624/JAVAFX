import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class controller2 {

	@FXML
	private Label myLabel;
	@FXML
	private TextField myTextField;
	@FXML
	private Button myButton;
	
	int age;
	
	public void submit(ActionEvent event) {
		
		try {
			age = Integer.parseInt(myTextField.getText());
			
			if(age >= 18) {
				myLabel.setText("You are eligible for voting!");
			}
			else {
				myLabel.setText("You are not eligible for voting!");
			}
		}
		catch (NumberFormatException e){
			myLabel.setText("Enter only numbers plz");
		}
		catch (Exception e) {
			myLabel.setText("Error");
		}
	}
}
