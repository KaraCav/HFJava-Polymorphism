public class LegCounter {
  
  private Integer legCount = 0;
  
  public void countLegs(Animal animal) {
    if (animal instanceof Feline) {
      System.out.println("Feline");
    }
    else if(animal instanceof Dog) {
     System.out.println("My class is " + animal.getClass().getName());
    }

    legCount += animal.numberOfLegs();
  }
  public Integer getLegCount() {
   return legCount; 
  }
}
