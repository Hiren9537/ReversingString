import java.util.Scanner;

public class Reverse 
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentences : ");
		String sentences = sc.nextLine();
		
		//sentences = "This is a coding test. I like java so much. This is my day";
		
		String[] paragraph = sentences.split("\\.");
		
		for (int i = 0 ; i <= paragraph.length -1; i++)
		{
			String result = "";
			result = paragraph[i];
			
			String[] w = result.split(" ");
			String ans1 = "";
			for (int j = w.length - 3; j >= 0; j--)
			{
				ans1 += (w[j] + " ");
			}
			System.out.print(ans1.trim());
			String ans2 = "";
			for (int k = w.length - 2; k <= w.length - 1 ; k++)
			{
				ans2 +=	(" " + w[k]);
			}
			System.out.print(ans2 + ". ");
			
		}

	}
}