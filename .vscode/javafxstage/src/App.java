// import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args)  {
        // launch method static method that belongs application class and since our main class
       launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        // throw new UnsupportedOperationException("Unimplemented method 'start'");

// Stage stage=new Stage();
   Group root=new Group();
    Scene scene =new Scene(root);
stage.setTitle("Stage Demo Program w00t w00t");
 stage.setScene(scene);
   
        stage.setWidth(420);
  stage.setHeight(420);
  stage.setResizable(false);
//   stage.setX(50);
//   stage.setY(50);
  stage.setFullScreen(true);
  stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
  stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
  stage.show();
    }
}
