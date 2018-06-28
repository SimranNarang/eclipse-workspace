package com.stackroute.utility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingText {
	public String sortWordsOfText(String userInput) {
		    String[] words = userInput.split(" ");
		    for(int i = 0;i<words.length;i++) {
		        String word= words[i];
		        String sortedWord= sortGivenWord(word);
		        words[i] = sortedWord;
		    }
		    String sortedText = Arrays.stream(words).collect(Collectors.joining(" "));
		    return sortedText;
		}
	public String sortGivenWord(String word) {
		    char[] wordArray = word.toCharArray();
		    Arrays.sort(wordArray);
		    return new String(wordArray);
		}
		
}
