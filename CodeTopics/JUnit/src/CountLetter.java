import static org.junit.Assert.*;

import org.junit.Test;


public class CountLetter {

	@Test
	public void test() {
		LetterTest count = new LetterTest();
		int result = count.countLetter("Aaron in object oriented is awesome");
		assertEquals(3, result);
	}

}
