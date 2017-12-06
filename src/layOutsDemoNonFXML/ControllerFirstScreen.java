package layOutsDemoNonFXML;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControllerFirstScreen {

    @FXML
    private VBox layOutsTopBox;

    @FXML
    private ToggleButton toggleButtonHBox;

    @FXML
    protected void handleHBox(ActionEvent event) throws IOException {

        toggleButtonHBox.setOnAction(e -> System.out.println(e.getEventType()
                + " occurred on ToggleButton HBox "));

        //Window owner = layOutsTopBox.getScene().getWindow();
        //AlertHelper.showAlert(AlertType.INFORMATION, owner, toggleButtonHBox.getId(), "Toggle ButtonH Box was clicked!!!");
        Stage stage = (Stage) toggleButtonHBox.getScene().getWindow();
        stage.close();
        stage.setTitle("LayOuts Demostration");

        Parent root = FXMLLoader.load(getClass().getResource("hBox.fxml"));

        Scene myScene = new Scene(root, 800, 500);

        stage.setScene(myScene);
        stage.show();

    }

}
