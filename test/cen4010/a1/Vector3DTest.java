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
	
	@Test
	void testToString() {
		Vector3D vec = new Vector3D(1,2,3);
		assertEquals("x: 1.0\ny: 2.0\nz: 3.0\n", vec.toString());
	}
	
	@Test
	void testEquals() {
		Vector3D vec = new Vector3D(1.01234,2.12345,3.23456);
		assertEquals(true, vec.equals(new Vector3D(1.01234,2.12345,3.23456)));
		
		// test threshold
		assertEquals(true, vec.equals(new Vector3D(1.01233,2.12344,3.23455)));
	}
	
	@Test
	void testScale() {
		Vector3D vector=new Vector3D(2,1,7);
		Vector3D result =vector.scale(1.5);
		assertEquals(true, result.equals(new Vector3D(3,1.5,10.5)));
	}
}
