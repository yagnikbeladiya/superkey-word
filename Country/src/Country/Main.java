package Country;

import Country.Student;
import Country.TextCalculation;



public class Main {



	    public static void main(String[] args) {
	     
	    	
	    	Student student1 = new Student();
	        Student student2 = new Student("viram");
	        Student student3 = new Student("nensi");



	        System.out.println("Student 1 name: " + student1.getName());
	        System.out.println("Student 2 name: " + student2.getName());
	        System.out.println("Student 3 name: " + student3.getName());

	        TextCalculation textCalc = new TextCalculation();


	        String text = "hello, text calculator";



	        int characterCount = textCalc.countCharacters(text);
	        int wordCount = textCalc.countWords(text);

	        System.out.println("Text: " + text);
	        System.out.println("Number of characters: " + characterCount);
	        System.out.println("Number of words: " + wordCount);
	    }
	

}
