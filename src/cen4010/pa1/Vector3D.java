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
	
	public String toString() {
		return "x: " + this.x + "\ny: " + this.y + "\nz: " + this.z + "\n";
	}

	public boolean equals(Vector3D v) {
		final double EPSILON = 0.0001;
		if (Math.abs(this.x - v.x) > EPSILON)
			return false;
		if (Math.abs(this.y - v.y) > EPSILON)
			return false;
		if (Math.abs(this.z - v.z) > EPSILON)
			return false;
		return true;
	}
	
	public Vector3D scale(double f) {
		return new Vector3D(x * f, y * f, z * f);
	}
	
	public Vector3D add(Vector3D v) {
		return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
	}

	public Vector3D subtract(Vector3D v) {
		return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
	}

	public Vector3D negate() {
		return new Vector3D(-this.x, -this.y, -this.z);
	}
	
}