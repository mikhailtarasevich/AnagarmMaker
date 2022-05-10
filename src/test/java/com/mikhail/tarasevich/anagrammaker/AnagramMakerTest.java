package com.mikhail.tarasevich.anagrammaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class AnagramMakerTest {

	AnagramMaker anagrammaker = new AnagramMaker();
	
	@Test
	void AnagramMakerShouldReturnTheSameWordIfArgumentIsWordFromSymblosithOnlyOneLetter() {
		assertThat("21#$2G*$62", equalTo(anagrammaker.makeAnagram("21#$2G*$62")));
	}
	
	@Test
	void AnagramMakerShouldReturnWordsInSentenceWithReversedLettersIfArgumentIsSentence() {
		assertThat("em22 on dda", equalTo(anagrammaker.makeAnagram("me22 no add")));
	}
	
	@Test
	void AnagramMakerShouldReturnTheSameSentenceIfArgumenIsSentenceFromSymbols() {
		assertThat("4$! %% #", equalTo(anagrammaker.makeAnagram("4$! %% #")));
	}
	
	@Test
	void AnagramMakerTrowsExceptionIfrgumentIsNull() {

		Assertions.assertThrows(EmptyOrNullStringException.class, () -> {
			anagrammaker.makeAnagram(null);
		});
	}
	
	@Test
	void AnagramMakerTrowsExceptionIfrgumentIsSentensFromWhiteSpeces() {
		Assertions.assertThrows(EmptyOrNullStringException.class, () -> {
			anagrammaker.makeAnagram("         ");
		});
	}
}
