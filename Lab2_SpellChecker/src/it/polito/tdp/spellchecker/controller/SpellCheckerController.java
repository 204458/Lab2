package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import it.polito.tdp.spellchecker.model.Dictionary;
import it.polito.tdp.spellchecker.model.EnglishDictionary;
import it.polito.tdp.spellchecker.model.ItalianDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class SpellCheckerController {
	
	private Dictionary model;
	private String lettura;
	private List<String> parole;
	private long time1;
	private long time2;
	private long time3;
	private long time4;
	private String result;
	private String result1;
	private long finale;
	private long finale1;
	
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
    	txtInput.clear();
    	txtResult.clear();
    	parole.clear();
    }

    @FXML
    void doSpellCheck(ActionEvent event) {
    if(cmbLanguage.getSelectionModel().getSelectedItem()=="italiano"){
    	model = new ItalianDictionary();
    	model.loadDictionary();
    	
    }
    else{
    	model= new EnglishDictionary();
    	model.loadDictionary();
    }
    lettura=txtInput.getText();
    StringTokenizer st = new StringTokenizer(lettura," ");
    while (st.hasMoreTokens()){
    	parole.add(st.nextToken());
    }
    time1=System.nanoTime();
    result = model.spellCheckText(parole).toString();
    time2=System.nanoTime();
    finale= time2-time1;
    /*time3=System.nanoTime();
    result1= model.spellCheckText1(parole).toString();
    time4=System.nanoTime();
    finale1=time4-time3;*/
    lblTimeResult.setText("Spell checks completed in"+" "+finale);
    txtResult.setText(result);
    }
    
    public void setModel( Dictionary model ) {
    	this.model = model ;
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
        parole= new LinkedList<String>();
        time1=0;
        time2=0;
        time3=0;
        time4=0;
    }
}