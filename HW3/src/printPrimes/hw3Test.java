package printPrimes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import printPrimes.hw3;;

public class hw3Test {
	hw3 t;

	@Before
	public void setUp() throws Exception {
		t = new hw3();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void test() {
		int a[] = new int[] { 2, 3, 5 };
		assertArrayEquals(a, t.printPrimes(3));
	}

}