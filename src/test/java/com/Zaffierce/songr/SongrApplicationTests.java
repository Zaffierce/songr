package com.Zaffierce.songr;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongrApplicationTests {

	Album album = new Album("Jazz", "Queen", 12, 2679, "https://upload.wikimedia.org/wikipedia/en/4/43/Queen_Bicycle_Race1.png");

	@Test
	public void testToString() {
		assertEquals("The artist Queen released an album called Jazz which contained 12 songs spanning a total of 2679 seconds long.",
				album.toString());
	}

	//test constructor?



}
