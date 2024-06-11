// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.scene.control.DatePicker;
// import javafx.scene.control.Button;
// import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
// import javafx.scene.control.TextField;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;



public class controller10{

 @FXML
 private Label myLabel;
 @FXML
 private RadioButton rButton1, rButton2, rButton3;

 public void getFood(ActionEvent event) {
  
  if(rButton1.isSelected()) {
   myLabel.setText(rButton1.getText());
  }
  else if(rButton2.isSelected()) {
   myLabel.setText(rButton2.getText());
  }
  else if(rButton3.isSelected()) {
   myLabel.setText(rButton3.getText());
  }
  
 }
//  @FXML
//  private DatePicker myDatePicker;
 
//  public void getDate(ActionEvent event) {
  
//   LocalDate myDate = myDatePicker.getValue();
//   String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
//   myLabel.setText(myFormattedDate);
//  }
}
