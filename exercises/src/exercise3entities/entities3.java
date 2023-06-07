package exercise3entities;

public class entities3 {
	public String name;
	public double t1;
	public double t2;
	public double t3;
	
	public double finalGrade() {
		return t1 + t2 + t3;
	}
	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
			}
			else {
			return 0.0;
			}
	}
}
