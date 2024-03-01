import java.util.Scanner;

class Calculator{
  public static void main(String[] args) {

    char operator;
    int n1, n2, r;

    Scanner input = new Scanner(System.in);

    
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

 
    System.out.println("Enter first number");
    n1 = input.nextInt();

    System.out.println("Enter second number");
    n2 = input.nextInt();

    switch (operator) {

      
      case '+':
        r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + r);
        break;

      
      case '-':
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        break;

      case '*':
        r = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        break;

      
      case '/':
        r = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + r);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}