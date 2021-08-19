//Assignment 9
/*write and test a regular expression that checks
 a sentence to see that it begins with a capital letter
 and ends with a period. */
 import java.util.regex.Pattern;
 import java.util.Scanner;
 class PatternCheck
 {
	public static void main(String[] a)
	{
		Scanner sc = new Scanner(System.in);
		String sentence;
		String pattern;
		System.out.println("Enter the sentence");
		sentence = sc.nextLine();
		pattern = "[A-Z].*\\.";
		if(Pattern.matches(pattern, sentence))
		{
			System.out.println("Senetence starts with Capital letter and ends with period"+"\n"+sentence);
		}
		else
			System.out.println("Sentence doesn't obey the rule");
	}
 }