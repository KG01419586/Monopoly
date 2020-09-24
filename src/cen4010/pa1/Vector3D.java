package cen4010.pa1;

public final class Vector3D {

	private final double x;
	private final double y;
	private final double z;

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	

	public double dot(Vector3D v) {
		return (this.x * v.x) + (this.y * v.y) + (this.z * v.z);
	}

	public double magnitude() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}


}