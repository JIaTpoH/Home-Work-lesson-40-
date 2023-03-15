package Human;

class Woman extends Human {
  public Woman(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Женщина по имени " + super.toString().substring(16);
  }

  @Override
  public void greeting() {
    System.out.println("Я родилась!");
  }
}
