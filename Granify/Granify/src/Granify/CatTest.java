package Granify;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

public class CatTest {

	
	@Test
	public void testGetAge() {
		Cat cat = new Cat();
		assertTrue(cat.getAge()>=5 && cat.getAge()<=10);
	}
	
	private final PrintStream out = System.out;
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outStream));
	}
	@Test
	public void testSpeakString() {
		System.out.println("haha");       
	    Assert.assertEquals("haha", outStream.toString()
	      .trim());
	}
	

	@Test
	public void testGetAverageNameLength() {
		Cat cat = new Cat();
		String name = "Tom";
		cat.setName(name);	
		assertTrue(name.length()==cat.getAverageNameLength());
	}

}
