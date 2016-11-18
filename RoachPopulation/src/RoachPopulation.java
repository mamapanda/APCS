/**
* simulates the growth of a roach population
*
* @author(Daniel Phan)
* @version(1)
*/
public class RoachPopulation
{
	private double population; //number of roaches alive
	
	/**
	* Constructs a roach population with an initial population value
	* @param initialPopulation the initial roach population
	*/
	public RoachPopulation(int initialPopulation)
	{
		this.population = initialPopulation;
	}
	
	/**
	* simulates the breeding period of the roaches, during which the population doubles
	*/
	public void breed()
	{
		this.population *= 2;
	}
	
	/**
	* returns the size of the roach population
	* @return the number of roaches alive
	*/
	public double getRoaches()
	{
		return Math.round(100.0 * this.population) / 100.0;
	}
	
	/**
	* simulates a lab breeding period of the roaches, during which the population is increased according to a given scale
	* @param scale the percentage to increase the roach population by
	*/
	public void labBreed(double scale)
	{
		this.population *= (1 + scale);
	}
	
	/**
	* simulates spraying roaches, during which 10% of the population is killed off
	*/
	public void spray()
	{
		this.population *= 0.9;
	}
	
	/**
	* simulates killing all the roaches, setting the population to 0
	*/
	public void wipeOut()
	{
		this.population = 0;
	}
}