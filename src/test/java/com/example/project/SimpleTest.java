public class SimpleTest {
	
	@Test
	public static void main(String[] args)
	{
		try {
			Simple.min(1, 5);
		}
		catch (Exception e) {
			System.out.println("Uh oh");
		}

		try {
			Simple.min(2, 3);
		}
		catch (Exception e) {
			System.out.println("Uh oh 2");
		}
	}
}