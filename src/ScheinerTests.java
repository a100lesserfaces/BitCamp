import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;


public class ScheinerTests {

	@Test
	public void testSimple() {
		ATM one = new ATM("first", "77.09", "38.09");
		Crime cOne = new Crime(38.09, 77.09, "burglary", "test");
		ATM two = new ATM("second", "87.54", "112.01");
		Crime cTwo = new Crime(112.01, 87.54, "arson", "test");
		ArrayList<ATM> atms = new ArrayList<ATM>();
		atms.add(one);
		atms.add(two);
		LinkedList<Crime> crimes = new LinkedList<Crime>();
		crimes.add(cOne);
		crimes.add(cTwo);
		Class.crimeCalc(atms, crimes);
		System.out.println(atms.get(0).getCrimeNum() + " " + atms.get(1).getCrimeNum());
	}

}
