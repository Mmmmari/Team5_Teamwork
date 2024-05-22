/*Easy: Create an arrayList for integers
Add 5 numbers.
Filter the arrayList and print out only numbers that divide by 2 
(number % 2 == 0)
*/

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

	var numbers = new ArrayList<Integer>();
	numbers.add(1);
	numbers.add(2);
  numbers.add(3);
  numbers.add(4);
  numbers.add(5);
  System.out.println(numbers);
  
  
  
  
	var filteredNumbers = new ArrayList <Integer>();
  for (int item : numbers){
  	if(item % 2 == 0){
    	filteredNumbers.add(item);
  	}
    }
    
    printArrayList(filteredNumbers);
  }
  

  
  public static void printArrayList(ArrayList<Integer> numbers) {
    System.out.println("Your numbers are: ");
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}


/*
We did not do this task: 
Medium: Put 100 random numbers in arrayList

Filter the arrayList and print out only numbers that divide by 2 
(number % 2 == 0)
*/
