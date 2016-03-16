package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtInput;

    @FXML
    private Button btnSpellCheck;

    @FXML
    private TextArea txtResult;

    @FXML
    private Label lblResult;
    
    @FXML
    private ComboBox<String> cmbLanguage;

    @FXML
    private Button btnClearText;

    @FXML
    private Label lblTimeResult;

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	assert cmbLanguage != null : "fx:id=\"cmbLanguage\" was not injected: check your FXML file 'SpellChecker.fxml'.";
    	assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert lblResult != null : "fx:id=\"lblResult\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert lblTimeResult != null : "fx:id=\"lblTimeResult\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        
        List<String> dizionari = new LinkedList<String>();
        dizionari.add("italiano");
        dizionari.add("inglese");
        cmbLanguage.getItems().addAll(dizionari);
        
    }
}