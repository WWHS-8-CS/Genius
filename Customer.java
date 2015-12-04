
public class Customer{
	private String name;
	private String problem;
	
	public Customer(String name, String problem)
	{
		this.name = name;
		this.problem = problem;
	}
	
	public String returnName() 
	{
		return name;
	}
	public void changeName(String name) 
	{
		this.name = name;
	}
	public String returnProblem() 
	{
		return problem;
	}
	public void changeProblem(String problem) 
	{
		this.problem = problem;
	}
	public String toString()
	{
		return "Name: " + this.name + " and Problem: " + this.problem;
	}
}
