package com.suchiit.Junit6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaclTest {

	@Test
	void testDivide() {
		Cacl cacl=new Cacl();
		assertEquals(6, cacl.divide(10, 5));
	}

}
