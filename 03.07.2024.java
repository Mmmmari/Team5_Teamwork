import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    
    var mammal = new Mammal();
    animals.add(mammal);
    mammal.name = "dog";
    mammal.voice = "bark";
    mammal.legCount = 4;
    mammal.region = "World";
    
    var mammal1 = new Mammal();
    animals.add(mammal1);
    mammal1.name = "cow";
    mammal1.voice = "moo";
    mammal1.legCount = 4;
    mammal1.region = "World";
    
    
    var bird = new Bird();
    animals.add(bird);
    bird.name = "eagle";
    bird.voice = "kakaaw";
    bird.isPrey = true;
    bird.isMigrating = false;
    
    var fish = new Fish();
    animals.add(fish);
    fish.name = "herring";
    fish.voice = "blob";
    fish.isPrey = false;
    fish.isSaltWater = true;
    
    System.out.println("These are all the animals (and their attributes) in our zoo:");
    for (var animal : animals) {
      System.out.println(animal.name);
      System.out.println(animal.voice);
      if (animal instanceof Mammal) {
        Mammal mammalInstance = (Mammal)animal;
        System.out.println(mammalInstance.legCount);
        System.out.println(mammalInstance.region);
      } else if(animal instanceof Bird) {
        Bird birdInstance = (Bird)animal;
        System.out.println(birdInstance.isMigrating);
        System.out.println(birdInstance.isPrey);
      } else if(animal instanceof Fish) {     
      	Fish fishInstance = (Fish)animal;
        System.out.println(fishInstance.isPrey);
        System.out.println(fishInstance.isSaltWater);
      }
    }
    }
    
    }
    
    public class Animal {
    public String name;
    public String voice;
    
    }
    
    public class Mammal extends Animal {
    public int legCount;
    public String region;
    
    }
    
    public class Bird extends Animal {
    public boolean isMigrating;
    public boolean isPrey;
    
    }
    
    public class Fish extends Animal {
    public boolean isPrey;
    public boolean isSaltWater;
    }
