/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textplatformer;

import gameworld.World;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import sun.font.FontFamily;

/**
 *
 * @author lucas.burdell
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    public TextFlow textView;
    
    public World world = new World();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Text text = new Text(world.render());
        text.setFont(Font.font("Consolas"));
        textView.getChildren().add(text);
    }
}
