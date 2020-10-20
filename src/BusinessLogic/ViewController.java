package BusinessLogic;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Rodney
 */
public class ViewController implements Initializable {

    @FXML
    private Button saveButton;
    @FXML
    private Button loadButton;
    @FXML
    private Button removeButton;
    @FXML
    private Button showTotalButton;

    public ViewController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
