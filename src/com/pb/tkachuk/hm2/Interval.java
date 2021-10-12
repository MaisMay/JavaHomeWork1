package com.pb.tkachuk.hm2;
import java.util.Scanner;


public class Interval {

  public static void main(String args[]){
    System.out.print("Введите любое целое число от 1 до 100: ");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
      if (number>=0 && number<=14)
    System.out.println ("Вы ввели число в промежутке  [0 -14], а именно: " + number);
      else if ((number>=15 && number<=35))
        System.out.println ("Вы ввели число в промежутке  [15 -35], а именно: " + number);
      else if ((number>=36 && number<=50))
        System.out.println ("Вы ввели число в промежутке  [36 -50], а именно: " + number);
      else if ((number >= 51 && number <= 100))
        System.out.println("Вы ввели число в промежутке  [51 -100], а именно: " + number);
      else {
        System.out.println("Введеное число не входит в диапазон. Попробуйте еще раз");
      }
  }
}
