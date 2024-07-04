/*
Open a restaurant

Food -> Sell / Eat / something else

Pizza -> override function from food
Burger -> override function from food
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    var foodList = new ArrayList<Food>();

    var pizza = new Pizza();
    foodList.add(pizza);

    var burger = new Burger();
    foodList.add(burger);

    for (var foodItem : foodList) {
      foodItem.order();
      foodItem.sell();
      foodItem.eat();
      System.out.println("-------------------------");
    }
  }
}

//----------------------------------------------------------------------------------


public class Food {
  public void order() {
    System.out.println("Ordering food.");
  }
  
  public void sell() {
    System.out.println("Selling food.");
  }

  public void eat() {
    System.out.println("Eating food.");
  }


}


//----------------------------------------------------------------------------------


public class Pizza extends Food {

  @Override
  public void order() {
    System.out.println("Ordering a pizza.");
  }
  
  @Override
  public void sell() {
    System.out.println("Selling a pizza.");
  }

  @Override
  public void eat() {
    System.out.println("Eating a pizza.");
  }

}


//----------------------------------------------------------------------------------

public class Burger extends Food {

    @Override
    public void order(){
        System.out.println("Ordering a burger.");
    }
    
    @Override
    public void sell(){
        System.out.println("Selling a burger.");
    }

    @Override
    public void eat(){
        System.out.println("Eating a burger.");
    }
}
