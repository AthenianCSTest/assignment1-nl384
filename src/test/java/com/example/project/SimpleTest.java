public class SimpleTest {
	
	package com.example.project;

	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.params.ParameterizedTest;
	import org.junit.jupiter.params.provider.CsvSource;

	import java.io.*;
	
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
