package Human;

public class Man extends Human {
  public Man(String name) {
    super(name);


  }

  @Override
  public String toString() {
    return "Женщина по имени " + getName();
  }

  public void sayHallo() {
    System.out.println("Я родился!");
  }
}