/**
* Implement a class Balloon that models a spherical balloon
* and calculates the surface area, volume, and radius of the balloon.
*
* @author(Daniel Phan)
* @version(1)
*/
public class Balloon
{
	double airAmount; //amount of air inside balloon
	double radius; //current radius of the balloon
	
	/**
	* constructs an empty balloon
	*/
	public Balloon()
	{
		this.airAmount = 0;
		this.radius = 0;
	}
	
	/**
	* adds the given amount of air to the balloon volume & recalculates the radius
	* @param addedAir the amount of air that will be added
	*/
	public void addAir(double addedAir)
	{
		this.airAmount += addedAir;
		if(this.airAmount < 0) this.airAmount = 0;
		this.radius = Math.pow((3 / (4 * Math.PI)) * this.airAmount, 1 / 3.0);
	}
	
	/**
	* returns the radius of the balloon
	* return the current radius
	*/
	public double getRadius()
	{
		return Math.round(this.radius * 10000.0) / 10000.0;
	}
	
	/**
	* returns the surface area of the balloon
	* @return the current surface area
	*/
	public double getSurfaceArea()
	{
		double surfaceArea = 4 * Math.PI * Math.pow(this.radius, 2);
		return Math.round(surfaceArea * 10000.0) / 10000.0;
	}
	
	/**
	* returns the volume of the balloon
	* @return the current air volume
	*/
	public double getVolume()
	{
		return Math.round(this.airAmount * 10000.0) / 10000.0;
	}
}