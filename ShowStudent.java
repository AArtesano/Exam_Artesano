public class ShowStudent { 

    public static void main(String[] args){


Student student1 = new Student();

student1.setcredits(4);
student1.setID(1);
student1.setpoints(4);

double gradepoint = student1.calcuGPA(student1.getpoints());


System.out.println("Student ID: " + student1.getID());
System.out.println("Number of credits: " + student1.getcredits());
System.out.println("Number of points: " + student1.getpoints());
System.out.println("GPA: " + gradepoint);

    }
}
