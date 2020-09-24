package cen4010.a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cen4010.pa1.Vector3D;

class Vector3DTest {

	
	
	@Test
	void testMagnitude() {
		Vector3D vector = new Vector3D(1,2,2);
		double result=vector.magnitude();
		assertEquals(result, 3.0);
		
	}
	

	
	@Test
	void testDot() {
		Vector3D vector = new Vector3D(2,3,6);
		Vector3D vector2 = new Vector3D(1,4,7);
		double result = vector.dot(vector2);
		assertEquals(result,56);
	}
}
