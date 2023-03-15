package Human;

//Создайте класс "Человек", конструктор которого принимает имя.

//При попытке вывести объект этого класса на экран должна выводиться строка "Человек по имени ...".

//Добавьте в класс "Человек" метод "приветствие", который будет выводить строку: "Я родился!"

//Создайте классы "Мужчина" и "Женщина", которые будут наследниками класса "Человек".

//Попытка вывести их на экран должна приводить к выводу строки "Мужчина по имени ..." или "Женщина по имени ..."

//Метод "приветствие" класса "Женщина" должен выводить строку: "Я родилась!"
public class Human {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Человек по имени" + getName();
  }

    public  void sayHallo () {
    System.out.println("Я родился!");
  }
}

