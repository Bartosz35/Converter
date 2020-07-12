package CurrencyConverter;

import com.xignite.services.Currencies;
import com.xignite.services.XigniteCurrencies;
import com.xignite.services.XigniteCurrenciesSoap;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConverterFXController implements Initializable {

    @FXML
    private Label theLabel;
    
    @FXML
    private ComboBox<Currencies> box1;
    
    @FXML
    private ComboBox<Currencies> box2;
    
    @FXML
    private TextField number;
    
    private Double res;
            
    private double value;
    
    XigniteCurrencies object = new XigniteCurrencies();
    XigniteCurrenciesSoap getCurrencies = object.getXigniteCurrenciesSoap();
  
    @FXML
    public void initialize(ActionEvent event) {
        String val1 = box1.getValue().toString().toUpperCase();
        String val2 = box2.getValue().toString().toUpperCase();
    
    /**         NEED HELP
    
    ??? res = getCurrencies. ???
               
    ??? theLabel.setText(String.valueOf(res)); ???
    */
    
    if(number.getText().isEmpty()) { 
    theLabel.setText("to be added");
    } else {
        value = Double.parseDouble(number.getText());
        double convert = value * res;
        convert = Double.parseDouble(new DecimalFormat(".##").format(convert));
    }
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        box1.setItems(FXCollection.observableArrayList(Currencies.values()));
        box2.setItems(FXCollection.observableArrayList(Currencies.values()));
        
    }    
    
}
