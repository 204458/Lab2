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
	
	public boolean ricercaDicotomica(List<String> l, String s){
		int i = l.size()/2;
		boolean risultato = false;
		if(l.get(i)!=s){
			while(risultato == false){
				if(l.get(i/2)== s)
					return true;
			}
		}
		return true;
	}
	public List<RichWord> spellCheckText1(List<String> inputTextList){
		List<RichWord> errate = new LinkedList<RichWord>();
		for(String s: inputTextList){
			if(ricercaDicotomica(dizionario, s)){
				RichWord rw = new RichWord(s,false);
				errate.add(rw);	
			}
		}
		return errate;	
	}
	
}
	

