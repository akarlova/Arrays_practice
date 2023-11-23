package app;

import java.util.Scanner;

public class Main4 {
    //Купівля містить 6 різних найменувань товарів.
    //Використовуючи Scanner, реалізуйте пошук товару за назвою.
    //Вивести результат пошуку.
    static String[] items;
    static String pattern;


    public static void main(String[] args) {

        items = new String[]{"laptop", "smartphone", "earphones", "tablet", "e-book",
                "headphones"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Input item: ");
        int count=0;
        pattern = sc.nextLine();
        for (String item : items) {
            if (item.equals(pattern)) {
                count++;
            }
        }
              if(count>0)  {System.out.println("Success! We have " + pattern + "!");
            } else {
                System.out.println("We don't have such item, sorry");
            }
              sc.close();
        }
    }


