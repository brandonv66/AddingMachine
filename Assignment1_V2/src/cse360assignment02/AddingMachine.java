package cse360assignment02;

/**
 * Defines global variables.
 * @author bvongsachang
 *
 */
public class AddingMachine {
  private int total;
  private String str = "";
  
  /**
   * Global variable instantiation.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    
	str += (total);
  }
  
  
  /**
   * Method to get modified variable.
   * @return
   */
  public int getTotal () {
    return total;
  }
  
  
  /**
   * Method that adds parameter value to total.
   * @param value
   */
  public void add (int value) {
	  
	  total = total + value;
	  str += (" + " + value);
  }
  
  /**
   * Method that subtracts parameter value from total.
   * @param value
   */
  public void subtract (int value) {
	  
	  total = total - value;
	  str += (" - " + value);
  }

  /**
   * Method that converts the values of total to a desired string.
   */
  public String toString () {
	  
	  //print using System.out.print(object.toString());
	  return str;

  }
  
  /**
   * Method that clears the value of total.
   */
  public void clear() {
	  
	  total = 0;
	  
  }
}