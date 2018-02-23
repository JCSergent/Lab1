package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			
			if((d.getDieValue() > 0) && (d.getDieValue() <= 6)) {
				System.out.println("Valid Dice Value");
			}
			else {
				System.out.println("Invalid Dice Value");
				break;
			}
		}

	}

}
