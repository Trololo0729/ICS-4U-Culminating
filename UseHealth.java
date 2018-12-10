import java.awt.*;
import java.io.*;
public class UseHealth
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader fr = new BufferedReader (new FileReader ("Records.txt"));
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	String check = fr.readLine ();

	if (check == null)
	{
	    System.out.println ("How many people do you want to record?");
	    int population = Integer.parseInt (br.readLine ());
	    Health rec[] = new Health [population];

	    for (int x = 0 ; x < rec.length ; x++)
	    {
		System.out.println ("What is your name?");
		String name = br.readLine ();
		System.out.println ("Type the gender.(m/f)");
		String gender = br.readLine ();
		System.out.println ("How old are you?");
		int age = Integer.parseInt (br.readLine ());
		System.out.println ("How much do you weigh in kilograms?(with decimal)");
		double weight = Double.parseDouble (br.readLine ());
		System.out.println ("How tall are you in metres?(with decimal)");
		double height = Double.parseDouble (br.readLine ());

		rec [x] = new Health (name, weight, height, gender, age);
	    }
	}
	else
	{
	System.out.println ("Data found in the text file.");
	}


    }
}


