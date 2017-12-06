package layOutsDemoNonFXML;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author webadministrator
 */
public class MainLayOutsDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("firstScreen.fxml"));

        Scene myScene = new Scene(root, 800, 500);
        primaryStage.setTitle("LayOuts Demostration");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
