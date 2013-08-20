package hello;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloViewController implements Initializable {
    @FXML
    private VBox root;
    @FXML
    private TextField textField;
    @FXML
    private Label label;
    
    @FXML
    private void handle(ActionEvent event) {
        label.setText("Hello, " + textField.getText() + "!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textField.maxWidthProperty().bind(Bindings.multiply(0.8, root.widthProperty()));
    }    
    
}
