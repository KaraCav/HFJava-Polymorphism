public abstract class Canine extends Animal {
  @Override // a decorator that says "this is overwriting its parent"
  public void whoAmI() {
    System.out.print("Main Doggo"); 
  }
}
