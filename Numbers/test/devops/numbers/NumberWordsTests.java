package devops.numbers;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	
	NumberWords numberwords = new NumberWords();
	@Test
	public void ONEtoNinteen() {
	assertEquals ( "one ",numberwords.oneToninteen(1));
	}

}
