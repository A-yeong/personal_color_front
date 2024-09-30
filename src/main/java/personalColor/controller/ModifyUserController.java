package personalColor.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ModifyUserController {
    @FXML private Button sign_btn;
    @FXML public ComboBox<String> personalColorBox;
    @FXML public ComboBox<String> ageBox;
    @FXML public ComboBox<String> genderBox;
    @FXML public TextField nameField;
    @FXML public TextField idField;
    @FXML public PasswordField pwField;
    @FXML public Label information;
    @FXML private Button back_btn;
}
