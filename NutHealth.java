public class NutHealth extends Health
{

    private int fats;
    private int cho;
    private int protein;

    public NutHealth (int fats, int cho, int protein, String name, double weight, double height, String gender, int age)
    {
	super (name, weight, height, gender, age);

	this.fats = fats;
	this.cho = cho;
	this.protein = protein;

    }


    public int getFats ()
    {
	return fats;
    }


    public int getCHO ()
    {
	return cho;
    }


    public int getProtein ()
    {
	return protein;
    }


    public void setFats (int newFats)
    {
	fats = newFats;
    }


    public void setCho (int newCho)
    {
	cho = newCho;
    }


    public void setProtein (int newProtein)
    {
	protein = newProtein;
    }


    public double getBMI (int weight, int height)
    {
	double BMI;

	BMI = weight / (height * height);

	return BMI;

    }


    public double getRMR (double weight, String gender, double RMR)
    {
	double lbs;

	lbs = weight * 2.2;

	if (gender.equals ("m"))
	{
	    RMR = lbs * 11;
	}

	else if (gender.equals ("f"))
	{
	    RMR = lbs * 10;
	}

	return RMR;

    }


    public int getDailyCal (double RMR, String activityLevel, int cal)
    {

	if (activityLevel.equals ("a"))
	{
	    cal = (int) Math.round (RMR * 1.4);
	}

	else if (activityLevel.equals ("b"))
	{
	    cal = (int) Math.round (RMR * 1.6);
	}
	else if (activityLevel.equals ("c"))
	{
	    cal = (int) Math.round (RMR * 1.8);
	}
	return cal;
    }


    public int getFatInfo (int fats)
    {
	return (int) fats * 9;
    }



    public int getChoInfo (int cho)
    {
	return (int) cho * 4;
    }


    public int getProteinInfo (int protein)
    {
	return (int) protein * 4;

    }
}
