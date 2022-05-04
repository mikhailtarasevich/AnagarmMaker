package com.mikhail.tarasevich.anagrammaker;

public class AnagramMaker {

	private static final String WORDS_SPLITTER = " ";

	public String makeAnagram(String sentence) {

		validate(sentence);

		final String[] words = sentence.split(WORDS_SPLITTER);
		final String[] reversedWords = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			reversedWords[i] = reverseWord(words[i]);
		}
		return concat(reversedWords);
	}

	private void validate(String sentence) throws EmptyOrNullStringException {
		if (sentence == null) {
			throw new EmptyOrNullStringException("Sentence is null");
		}
		if (sentence.trim().isEmpty()) {
			throw new EmptyOrNullStringException("Sentence is empty");
		}
	}

	private String reverseWord(String word) {
		int lastPositionJ = 0;
		char[] strToArray = word.toCharArray();
		for (int i = 0; i + lastPositionJ < strToArray.length; i++) {
			Character thisLetter = strToArray[i];
			if (Character.isLetter(thisLetter)) {
				for (int j = (strToArray.length - 1 - lastPositionJ); j >= 0; j = j - 1) {
					if (Character.isLetter(strToArray[j])) {
						strToArray[i] = strToArray[j];
						strToArray[j] = thisLetter;
						lastPositionJ = strToArray.length - j;
						break;
					}
				}
			}
		}
		return String.valueOf(strToArray);
	}

	private String concat(String[] words) {
		return String.join(WORDS_SPLITTER, words);
	}
}
