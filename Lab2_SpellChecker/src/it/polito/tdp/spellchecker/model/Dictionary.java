package it.polito.tdp.spellchecker.model;

import java.util.*;

public class Dictionary {
	List<String> dizionario = new LinkedList<String>();
	public void loadDictionary(){
	}
	
	public List<RichWord> spellCheckText(List<String> inputTextList){
		List<RichWord> errate = new LinkedList<RichWord>();
		for(String s: inputTextList){
			if(!dizionario.contains(s)){
				RichWord rw = new RichWord(s,false);
				errate.add(rw);	
			}
		}
		return errate;	
	}
}
