package com.example.tarea5;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tarea5ApplicationTests {

	private tarea5 Test = new tarea5();

	@Test
	void contextLoads() {
		Test.setString(
				new String[]{"Lorem","ipsum","dolor","sit","amet","consectetur","adipiscing","elit","Donec","rutrum","pretium","lorem","in","ullamcorper","lectus","lacinia","vel","In","hac","habitasse"}
		);
		assertEquals("<br>e : 12 ************<br>i : 12 ************<br>l : 9  *********<br>r : 9  *********<br>t : 9  *********<br>a : 8  ********<br>c : 8  ********<br>m : 7  *******<br>o : 7  *******<br>s : 7  *******", Test.countChars());
	}

}
