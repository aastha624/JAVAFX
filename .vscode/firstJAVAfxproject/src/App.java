import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
import java.util.Random;
 
public class App extends Application {
 
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
 
        // Create a random number generator
        Random random = new Random();
 
        // Create and display text
        for (int i = 0; i < 5; i++) {
            // Create a Text node
            Text text = new Text("Java");
 
            // Set random color
            Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            text.setFill(color);
 
            // Set random opacity
            text.setOpacity(random.nextDouble());
 
            // Set font
            Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
            text.setFont(font);
 
            // Rotate text 90 degrees left
            text.setRotate(-90);
 
            // Set vertical position
            text.setTranslateX(i * 40); // Adjust this value as needed for spacing
 
            // Add text to the root pane
            root.getChildren().add(text);
        }
 
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vertical Text Display");
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}