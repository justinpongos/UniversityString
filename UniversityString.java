
public class UniversityString {
	public static void main(String[]args) {
	String[] schools = { "USC", "UCI", "CSUN", "CSULB"};
	String shortest = schools[0];
	
	for (int index = 0; index < schools.length; index++) {
			System.out.println("The College is "+ schools[index] + " and is " + schools[index].length() + " letters long");
		if (schools[index].length() <= shortest.length()) {	
			shortest = schools[index];
		}//end if
	}//end for
	
	System.out.println("The College with the shortest name length is " + shortest + "\n");
	
	schools[3] = " ";
	for (int index = 0; index <schools.length; index++) {
		System.out.println(schools[index]);
		}//end for
	}//end class
}//end class
	
