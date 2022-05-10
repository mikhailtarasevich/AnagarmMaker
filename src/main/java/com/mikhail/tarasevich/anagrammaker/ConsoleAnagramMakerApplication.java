package com.mikhail.tarasevich.anagrammaker;

public class ConsoleAnagramMakerApplication {

	public static void main(String[] args) {
		AnagramMaker lsb = new AnagramMaker();
		String sentence = "I-22$$ ev13ah dab doom$ ";
		System.out.println("App for letters reverse");
		System.out.println("Sentnce: " + sentence);
		System.out.println("Reversed sentence: " + lsb.makeAnagram(sentence));
	}
}
