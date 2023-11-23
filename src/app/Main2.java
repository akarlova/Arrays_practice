package app;

import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    // На підприємстві визначено дві групи менеджерів по три особи.
    // Робочий тиждень – шестиденний, крім неділі.
    // Одна група працює по непарних днях тижня(Mon,Wed,Fri),
    // а друга - по парних.(Tue,Thu,Sat)
    // Залежно від дня тижня, необхідно вивести, у стовпчик, перелік
    // імен співробітників, які чергують у певний день тижня.
    // Врахуйте варіанти виведення даних, коли немає відповідності
    //якомусь із робочих днів.
    public static void main(String[] args) {

        String[] teamOddDays = new String[]{"Harry", "Ron", "Hermione"};
        String[] teamEvenDays = new String[]{"Draco", "Penny", "Severus"};
        String[] workDays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int day = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, choose day from the list " +
                Arrays.toString(workDays) + ":  ");
        String pattern = sc.nextLine();

        for (int i = 0; i < workDays.length; i++) {
            if (workDays[i].equals(pattern)) {
                day = i;
            }
        }
        if (day % 2 == 0) {
            System.out.printf("%n%s %n%s %n%s", teamOddDays[0], teamOddDays[1],
                    teamOddDays[2]);
        } else {
            System.out.printf("%n%s %n%s %n%s", teamEvenDays[0], teamEvenDays[1],
                    teamEvenDays[2]);
        }
        sc.close();
    }

}


