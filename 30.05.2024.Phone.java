public class Phone {
  public String brand;
  public String color;
  public int price;
  public float discount = 0.1f;
  public boolean used;
  public int batteryCharge = 100;

  public Phone(String brand, String color, int price, boolean used) {
    this.brand = brand;
    this.color = color;
    this.price = price;
    this.used = used;
  }
  
  public float getDiscountedPrice(){
  return price*(1-discount);
  }
  
  public void useBattery(){
  batteryCharge = batteryCharge - 1;
  }

}
