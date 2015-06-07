package intro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class IntoTddClass {
	
	@Test
	public void createFirstClass(){
		IntroClass introClass = new IntroClass();
		assertNotNull(introClass);
	}
	
	@Test
	public void testHelloWorld(){
		IntroClass introClass = new IntroClass();
		assertEquals("Hello World", introClass.greeting("Hello World"));
		assertEquals("Lets go shopping!!!", introClass.greeting("Lets go shopping!!!"));
	}

}
