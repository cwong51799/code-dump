/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public abstract class CollegeApplicantSuperClass {
	String applicant, college;
	public static void main(String[] args) {
	undergradApp UG = new undergradApp("Christopher Wong", "Stony Brook University", 1300, 94.6);
	graduateApp G = new graduateApp("Christopher Wong", "Stony Brook University", 1300, 94.6, "Stony Brook University");
	graduateApp G2 = new graduateApp("Christopher Wong", "Stony Brook University", 1300, 94.6, "not Stony Brook University");
	System.out.println(G.check());
	System.out.println(G2.check());
	}
}
	class undergradApp extends CollegeApplicantSuperClass{
		int SAT;
		double GPA;
		public undergradApp(String applicant, String college, int SAT, double GPA) {
			this.applicant = applicant;
			this.college = college;
			this.SAT = SAT;
			this.GPA = GPA;
		}
	}
	class graduateApp extends undergradApp{
		String origin;
		public graduateApp(String applicant, String college, int SAT, double GPA, String origin) {
			super(applicant,college,SAT, GPA);
			this.origin = origin;
		}
		public String check() {
			if (origin == college)
				return ("from inside");
			else
				return ("from outside");
		}
}
	
