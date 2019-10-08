import java.util.*;
public abstract class Animal {
  
  public void whoAmI() {
    System.out.println("Animal");
  }

  public abstract Integer numberOfLegs();

}
//"abstract" lets you write undefined methods

//can skip Chapter 9, skim 10, and will pick up 11 next time
//make abstract Feline, then two concrete classes: cat and lion, which extend Feline
