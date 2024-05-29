public class Main {
  public static void main(String[] args) {

  Phone phone1 = new Phone("iPhone", "black", 600, true);
  Phone phone2 = new Phone("Samsung", "silver", 400, false);
  Phone phone3 = new Phone("Nokia", "blue", 50, true);



  System.out.println("Phone 1 is:");
  System.out.println(phone1.brand);
  System.out.println(phone1.color);
  System.out.println(phone1.price);
  System.out.println("is it used: " + phone1.used);
  System.out.println("----------------------------");

  System.out.println("Phone 2 is:");
  System.out.println(phone2.brand);
  System.out.println(phone2.color);
  System.out.println(phone2.price);
  System.out.println("is it used: " + phone2.used);
  System.out.println("----------------------------");

  System.out.println("Phone 3 is:");
  System.out.println(phone3.brand);
  System.out.println(phone3.color);
  System.out.println(phone3.price);
  System.out.println("is it used: " + phone3.used);
  System.out.println("----------------------------");


  }
}
