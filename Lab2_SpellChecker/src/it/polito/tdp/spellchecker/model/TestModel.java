package it.polito.tdp.spellchecker.model;

import java.util.*;

public class TestModel {

	public static void main(String[] args) {
		ItalianDictionary diz= new ItalianDictionary();
		EnglishDictionary End = new EnglishDictionary();
		
		List<String> parole = new LinkedList<String>();
		parole.add("casacca");
		parole.add("casaccio");
		parole.add("carucci");
		parole.add("antagonism");
		parole.add("antagonist");
		parole.add("antagonize");
		
		diz.loadDictionary();
		End.loadDictionary();
		List<RichWord> errori = diz.spellCheckText(parole);
		List<RichWord> errors = End.spellCheckText(parole);
		System.out.println(errori.toString());
		System.out.println(errors.toString());
	}
}
