
package cse360assign3;

/** Calculator: Class that contains seven methods, to create Calculator, get the total, add a
 * value to the total, subtract a value from the total, multiply a value by the total, divide
 * a value by the total, and a method to return the history of the actions.
 * @author Aaron
 * @version:	Assignment 3.1
 */
public class Calculator {

	private int total;
	private String history;
	
	
	/** Calculator () : create calculator object	
	 * */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	
	/** getTotal () : return the total
	 * @return int total	
	 * */
	public int getTotal ()
	{
		return total;
	}
	
	
	/** add () : adds the value to the total
	 * 
	 * @param value to be added
	 * */
	public void add (int value)
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	
	/** subtract () : subtracts the value to the total
	 * 
	 * @param value to be subtracted
	 * */
	public void subtract (int value)
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	
	/** multiply () : multiplies the value by the total
	 * 
	 * @param value to be multiplied
	 * */
	public void multiply (int value)
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	
	/** divide () : divides the total by the value
	 * 
	 * @param value to be divided
	 * */
	public void divide (int value)
	{
		if (value == 0)
			total = 0;
		else
			total = total / value;
		
		history = history + " / " + value;
		
	}
	
	
	/** getHistory () : subtracts the value to the total
	 * 
	 * @return string value of history of actions
	 * */
	public String getHistory ()
	{
		return history;
	}
}
