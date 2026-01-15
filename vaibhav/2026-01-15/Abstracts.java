public class Abstracts {
  public static void main(String args[]) {
    // Animal ab = new Animal(); <-- here error will occer 
    // error will occur beacuse we can not make instance or object of abstract class
    // and also do not make implementation in abstract class we can give only the idea

    dog a = new dog();
    a.eats();
    a.walk();

    cat c = new cat();
    c.eats();
    c.walk();
  }
}

abstract class Animal {
  void eats() {
    System.out.println("eats very well ");
  }

  abstract void walk();  // <-- here we given only idea doen'st give an implementation
}

class dog extends Animal {
  void walk() {   // here we can make implemeantation on that idea given by absteact class
    System.out.println("walk because he has legs");
  }
}

class cat extends Animal {
  void walk() {
    System.out.println("yes cat can do catwalk also");
  }
}