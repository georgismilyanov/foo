package foo;

import org.junit.Test;

public class BarTest {

	@Test
	public void trivialTest()
	{
		new Bar();
	}
	
	@Test
	public void failTestTest()
	{
		assert 1 == 0;
	}
}
