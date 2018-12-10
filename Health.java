public class Health
{
    private String name;
    private String gender;
    private int age;
    private double weight;
    private double height;

    public Health (String name, double weight, double height, String gender, int age)
    {
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.weight = weight;
	this.height = height;
    }


    public void setName (String newName)
    {
	name = newName;
    }


    public String getName ()
    {
	return name;
    }


    public void setGender (String newGender)
    {
	gender = newGender;
    }


    public String getGender ()
    {
	return gender;
    }


    public void setage (int newAge)
    {
	age = newAge;
    }


    public int getAge ()
    {
	return age;
    }


    public void setWeight (double newWeight)
    {
	weight = newWeight;
    }


    public double getWeight ()
    {
	return weight;
    }


    public void setHeight (double newHeight)
    {
	height = newHeight;
    }


    public double getHeight ()
    {
	return height;
    }


    public String toString ()
    {
	return "Name: " + name + " Gender: " + gender + " Age: " + age + " Weight: " + weight + " Height: " + height;
    }

}

