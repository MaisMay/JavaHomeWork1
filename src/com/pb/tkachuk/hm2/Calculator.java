package com.pb.tkachuk.hm2;
import java.util.Scanner;


public class Calculator {
  public static void main(String[] args) {
    int operand1, operand2, result;
    char sign;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    operand1 = in.nextInt();
    System.out.println("Введите второе число: ");
    operand2 = in.nextInt();
    System.out.println("Введите операцию +, -, * или /: ");
    sign = in.next().charAt(0);

    try {
      switch (sign) {
        case '+':
          result = operand1 + operand2;
          break;
        case '-':
          result = operand1 - operand2;
          break;
        case '*':
          result = operand1 * operand2;
          break;
        case '/':
          if (operand2 == 0) throw new Exception("Делить на 0 нельзя");
          result = operand1 / operand2;
          break;
        default:
          throw new Exception("Повторите, пожалуйста, операцию сначала");
      }
      System.out.println("Результат операции: " + result);
    }


    catch (Exception mistake) {
      System.out.println(mistake.getMessage());
    }
  }
}