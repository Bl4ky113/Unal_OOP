
package objects.polymorphism;

public class Polymorphism {
  static public void main (String[] args) {
    Polymorphism obj = new Polymorphism();
  
    System.out.printf("Resta de 5 y 3: %d\n", obj.restar(5, 3));
    System.out.printf("Resta de 5, 3, y 2: %d\n", obj.restar(5, 3, 2));
    System.out.printf("Resta de 4.5 y 2.7: %f\n", obj.restar(4.5, 2.7));
    return;
  }

  int restar (int num1, int num2) {
    return num1 - num2;
  }

  int restar (int num1, int num2, int num3) {
    return num1 - num2 - num3;
  }

  double restar (double num1, double num2) {
    return num1 - num2;
  }
}
