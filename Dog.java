public class Dog extends Canine implements Pet {
 
  @Override
  public Integer numberOfLegs() {
    System.out.println("4 doggo legs"); 
    return 4;
  }
  
  @Override
  public void whoAmI() {
   System.out.println("Small Doggo"); 
   super.whoAmI();
  }

  @Override
  public void play() {
   System.out.println("Dog is playing"); 
  }
  
  @Override
  public void beFriendly() {
   System.out.println("Dog is friendly"); 
  }

}
