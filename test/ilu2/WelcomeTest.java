package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@BeforeEach
	public void initialisation()
	{
		System.out.println("Lancement des tests");

	}

	@Test
	void test1() {
		assertEquals(Welcome.affichage("bob"),"Hello,Bob");
	}

}
