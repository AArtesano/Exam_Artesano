public class Student {
	private int studID;
	int credits;
	int points;
	double gpa;
	
	public void setID(double ID) {
		ID = studID;
	}
	
	public int getID() {
		return studID;
	}
	
	public void setcredits(int credit) {
		credit = credits;
	}
	
	public int getcredits() {
		return credits;
	}
	
	public void setpoints(int point) {
		point = points;
	}
	
	public int getpoints() {
		return points;
	}
	
	public double calcuGPA(double grade) {
		grade = points/credits;
		return grade;
	}
	
	public void printMessage() {
		
		System.out.println("The Student is: " + studID);
			System.out.println("Number of Credits: " + credits);
			System.out.println("Points: " + points);
			System.out.println("GPA: " + gpa);
	}
}