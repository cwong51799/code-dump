/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Date;
public class Person {
	public String name;
	private String email, address;
	private long phoneNum;
	public Person(String n) {
		name = n;
	}
	public Person(String n, String e, String a, long p) {
		name = n;
		email = e;
		address = a;
		phoneNum = p;
	}
	public String toString() {
		System.out.println("Person");
		System.out.println (name);
		return (name);
	}
	public static void main(String[] args) {
		Person p1 = new Person ("Joe the Person", "hello@gmail.com", "some road", 917584);
		Student p2 = new Student ("Josh the Student", "freshman");
		Employee p3 = new Employee ("Jacob the Employee","Office B", 90000);
		Faculty p4 = new Faculty("John the Faculty","8 to 5 PM", 3);
		Staff p5 = new Staff ("Jimbo the Staff","Principle");
		p1.toString();
		p2.toString();
		p3.toString();
		p4.toString();
		p5.toString();
	}
}
class Student extends Person{
	private String year;
	public Student(String n, String y) {
		super(n);
		year = y;
	}
	public String toString() {
		System.out.println("Student");
		System.out.println(name);
		return (name);
	}
}
class Employee extends Person{
	private String office;
	private double salary;
	private Date dateHired;
	public Employee(String n, String newO, double newS) {
		super(n);
		office = newO;
		salary = newS;
		dateHired = new Date();
	}
	public Employee(String n) {
		super(n);
	}
	public String toString() {
		System.out.println("Employee");
		System.out.println(name);
		return (name);
	}
	}
class Faculty extends Employee{
	private String officeHours;
	private int rank;
	public Faculty(String n, String OH, int r) {
		super (n);
		officeHours = OH;
		rank = r;
	}
	public String toString() {
		System.out.println("Faculty");
		System.out.println(name);
		return (name);
	}
}
class Staff extends Employee{
	private String title;
	public Staff(String n, String t) {
		super (n);
		title = t;
	}
	public String toString() {
		System.out.println("Staff");
		System.out.print(name);
		return (name);
	}
}
