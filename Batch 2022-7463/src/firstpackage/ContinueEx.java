package firstpackage;

public class ContinueEx {

	public static void main(String[] args) {

				String[] students = {"Mark", "Bill", "Lucy", "Chloe"};
				int grades[] = {16, 25, 0, 19};

				for (int i = 0; i < students.length; ++i) {
					if (students[i].equals("Lucy")) {
						continue;
					}
					if (grades[i] > 17) {
						System.out.println(students[i] + " has passed their test with the grade " + grades[i] + ".");
					} else {
						System.out.println(students[i] + " has failed their test with the grade " + grades[i] + ".");
					}
				}
			}

}
