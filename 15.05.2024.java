// Easy: Create a copy of all primitive types (STRINGS INCLUDED)
// Primitive data types - includes byte , short , int , long , float , double , boolean and char.

public class Main {
  public static void main(String[] args) { 
  
    byte originalByte = 1;
    byte newByte = originalByte;
    
    short originalShort = 2;
    short newShort = originalShort;
  
    String originalWord = "Sun";
    String newWord = originalWord;

    boolean isHuman = false;
    boolean isHuman2 = isHuman;
    isHuman2 = true;
    System.out.println(isHuman);

  }
}



// Hard: Create a copy of an array

public class Main {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = {5, 4, 3, 2, 1};
        System.out.println("The original version of the new array is:");

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        System.out.println("The new and changed array is:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        System.out.println("The original array is:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println(originalArray[i]);
        }
    }
}



