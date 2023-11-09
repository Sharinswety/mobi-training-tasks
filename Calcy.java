package mobitaining.day1;

import java.util.Scanner;

class Calcy {
        public static void main(String[] args) {

            char operator;
            int num1=70, num2=6, result;

          Scanner input = new Scanner(System.in);


            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);


            System.out.println("Enter first number");
          //  number1 = input.nextInt();

            System.out.println("Enter second number");
          //  number2 = input.nextInt();

            switch (operator) {


                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

           // input.close();
        }
   }
