package com.appointmentMaker.main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class JFXController {

    @FXML
    private ComboBox<OpenTimes> ddTime;

    @FXML
    private DatePicker dpAptDate;

    @FXML
    private Button butCancel;

    @FXML
    private ComboBox<Services> ddService;

    @FXML
    private Button butConfirm;
    
    

}