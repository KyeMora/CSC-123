import java.text.DecimalFormat;
public class Sphere 
{
	//instance data diameter
	double diameter;
	DecimalFormat df = new DecimalFormat("##.###");
	
	//constructor
	public Sphere (double x)
	{
		diameter = x;
	}
	
	//setter
	public void setDiameter(double diameter)
	{
		diameter = diameter;
	}
	
	//getter
	public double getDiameter()
	{
		return diameter;
	}
	
	public double calcVolume()
	{
		double radius = diameter/2;
		double sphere = 4.0 / 3.0;
		double volume = sphere * Math.PI * (Math.pow(radius, 3));
		return volume;
	}

	public double calcSurfaceArea()
	{
		double radius = diameter/2;
		double area = 4 * Math.PI * (Math.pow(radius, 2));
		return area;
	}

	public String toString()
	{
		return "Sphere with diameter: " + diameter + "\nThe volume of the sphere is: " + df.format(calcVolume())+ "\nThe surface area of the sphere is:  " + df.format(calcSurfaceArea());
	}
	
	public static void main (String [] args)
	{
		Sphere s1 = new Sphere(10);
		System.out.println(s1);
	}
}

