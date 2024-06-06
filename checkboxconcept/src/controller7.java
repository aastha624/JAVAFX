import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class controller7 {

 @FXML
 private CheckBox myCheckBox;
 @FXML
 private Label myLabel;
 @FXML
 private ImageView myImageView;
 
 Image myImage1 = new Image(getClass().getResourceAsStream("download.jpeg"));
 Image myImage2 = new Image(getClass().getResourceAsStream("IMG1.jpeg"));
 
 public void change(ActionEvent event) {
  
  if(myCheckBox.isSelected()) {
   myLabel.setText("ON");
   myImageView.setImage(IMG1.jpeg);
  }
  else {
   myLabel.setText("OFF");
   myImageView.setImage(download.jpeg);
  }
 }
}