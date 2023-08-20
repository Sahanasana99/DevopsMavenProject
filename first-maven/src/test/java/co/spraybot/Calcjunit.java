package co.spraybot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calcjunit {

	@Test
	void addtest() {
	 var Calculater = new mavenclass();
	  assertEquals(4,Calculater.add(2,2));
	}

	@Test
	void subtest() {
	 var Calculater = new mavenclass();
	  assertEquals(0,Calculater.sub(2,2));
	}

	@Test
	void multest() {
	 var Calculater = new mavenclass();
	  assertEquals(4,Calculater.mul(2,2));
	}

	@Test
	void divtest() {
	 var Calculater = new mavenclass();
	  assertEquals(2,Calculater.div(4,2));
	}


}
