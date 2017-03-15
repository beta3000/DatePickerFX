package com.ciro.app.controller;

import com.ciro.app.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class MainController {

    private Main main;
    //Views
    @FXML
    private DatePicker datePicker;

    public void setMain(Main main) {
        this.main = main;
        datePicker.setValue(LocalDate.now());
//        datePicker.setChronology(JapaneseChronology.INSTANCE);
//        datePicker.setShowWeekNumbers(false);
        datePicker.setOnAction(event -> {
            LocalDate date = datePicker.getValue();
            System.out.println("date: "+date);
        });
    }
}
