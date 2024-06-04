import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class controller1 {

 //ImageView is a Node used for painting images loaded with Images

 // Image = picture 
 // ImageView = picture frame
 
 @FXML
 
 ImageView MyImageview;
 Button MyButton;
 
 Image myImage = new Image(getClass().getResourceAsStream("aa2.jpg"));
 
 public void displayImage() {
    MyImageview.setImage(myImage);
 }
}