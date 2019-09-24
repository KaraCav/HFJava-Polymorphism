public class ChapterEight {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    Cat myCat = new Cat();
    Wolf myWolf = new Wolf();

    myCat.speak();

    myDog.numberOfLegs();

    Animal myAnimal = new Dog(); 
    Animal myAnimalTwo = new Cat();
    myAnimalTwo.whoAmI();
    
 // myAnimalTwo.catsOnly(); //this won't work
    Cat myCatTwo = (Cat) myAnimalTwo;
        myCatTwo.catsOnly();
        
    LegCounter counter = new LegCounter();
    counter.countLegs(myCatTwo);
    System.out.println(counter.getLegCount());
    counter.countLegs(myDog);
    System.out.println(counter.getLegCount());
  }
}
// abstract- you can have undefined without concrete concepts- these can have definitions
// concrete is like a dog class- everything is defined
// interface is a template saying "anything implementing this interface must have these". can have no definitions, no method body.
// interfaces are abstract classes but can't have bodies
