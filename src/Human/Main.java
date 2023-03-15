package Human;

public class Main {
  public static void main(String[] args) {

    Man man = new Man("Dima");
    System.out.println(man);
    man.sayHallo();

    Woman woman = new Woman("Alina");
    System.out.println(woman);
    woman.sayHallo();
  }
}
