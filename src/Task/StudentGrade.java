package Task;

import java.util.Iterator;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of subjects");
		int number= scanner.nextInt();
		
		int scores[] = new int[number];
		int totalScore = 0;
		
		System.out.println("Enter score each subject out of 100");
		for (int i = 0; i < scores.length; i++) {
			
			System.out.println("Enter score for subject "+(i+1)+": ");
			scores[i] = scanner.nextInt();
			totalScore=totalScore+scores[i];
		}
		
		int average = totalScore/number;
		
		String gradeString;
		
		if(average >= 90) {
			gradeString = "A";
		}
		else if (average >= 80) {
			gradeString = "B";
		}
		else if(average >= 70){
			gradeString = "C";
		}
		else if (average >= 60) {
			gradeString = "D";
		}
		else {
			gradeString = "F";
		}
		
		System.out.println("Total Score: "+totalScore);
		System.out.println("Average Score: "+average);
		System.out.println("Grade: "+gradeString);
		
		System.out.println("Totak average is "+average);
		
	}
}
