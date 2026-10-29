class Student {
	String firstName;
	String lastName;
	int classYear;
	String major;

	public Student(String firstName, String lastName, int classYear, String major) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.classYear = classYear;
		this.major = major;
	}

	public void displayInfo() {
		System.out.println("Student: " + firstName + " " + lastName);
		System.out.println("Year: " + classYear);
		System.out.println("Major: " + major);
		System.out.println();
	}
}

public class ExamObjectsA {
	public static void main(String[] args) {

	Student student1 = new Student("Shairezz", "Deculawan", 1, "Computer Science");
	Student student2 = new Student("Aiah", "Arceta", 3, "Civil Engineering");

	student1.displayInfo();
	student2.displayInfo();
	}
}