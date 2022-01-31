import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] qAnda = new String[5][5]; // массив вопросов и вариантов отетов
        int[] rightAns = new int[qAnda.length]; //массив правильных ответов
        int goals=0; //подсчёт правильных ответов
        int choice;  // вариант, выбранный пользователем
        int count; // счётчик колличества вариантов отета в текущем вопросе
        // создание масиивов ответов и вопросов, правильных ответов
        qAnda[0][0] = "Сколько лап у собаки?";
        qAnda[0][1] = "Одна";
        qAnda[0][2] = "Две";
        qAnda[0][3] = "Три";
        qAnda[0][4] = "Четыре";
        rightAns[0] = 4;

        qAnda[1][0] = "Какаой сейчас год?";
        qAnda[1][1] = "1914";
        qAnda[1][2] = "2022";
        qAnda[1][3] = "1147";
        qAnda[1][4] = "2021";
        rightAns[1] = 2;

        qAnda[2][0] = "Сколько всего океанов на нашей планете Земля?";
        qAnda[2][1] = "4";
        qAnda[2][2] = "6";
        qAnda[2][3] = "5";
        qAnda[2][4] = "3";
        rightAns[2] = 3;

        qAnda[3][0] = "Раньше этот город назывался Кенигсберг, а теперь?";
        qAnda[3][1] = "Калининград";
        qAnda[3][2] = "Норильск";
        qAnda[3][3] = "Тула";
        rightAns[3] = 1;

        qAnda[4][0] = "Сколько цифр используется в двоичной системе счисления ?";
        qAnda[4][1] = "Одна";
        qAnda[4][2] = "Две";
        rightAns[4] = 2;

        System.out.println("Вам будет предложено " + qAnda.length + " вопросов.");
        System.out.println("Введите на клавиатуре номер правитльного ответа.");

        for (int i = 0; i < qAnda.length; i++) {
            count =0;// подсчёт количесва вариантов ответов в вопросе
            choice=0; // вариант ответа, выбранный пользователем
            System.out.print("Вопрос № :" + (i + 1) + " ");
            System.out.println(qAnda[i][0]); // вывод в консоль вопроса
            System.out.println("Варианты ответов:");
            // далее вывод вариантов отвктов и подсчёт колличества вариантов ответов
            for (int j = 1; j < qAnda[0].length; j++) {
                if (qAnda[i][j] != null) {
                    count++;
                    System.out.println(j + ". " + qAnda[i][j]);
                }
            }
            System.out.println("Введите порядковый номер правильного ответа и нажмите клавишу Enter");
            Scanner scan = new Scanner(System.in);
            // ввод варианта ответа, проверка что введено целое число
            while ( (choice<=0) || (choice > count) ) {
                while (scan.hasNextInt() == false) {
                    System.out.println("Такого варианта не существует");
                    scan = new Scanner(System.in);
                }
                choice = scan.nextInt();
                if (choice == rightAns[i]) {
                    goals++ ;// подсчёт колличества правильных ответов
                }
                  if ( (choice<=0) || (choice > count) ) {
                      System.out.println("Такого варианта не существует");
                  }
        }
        }
        System.out.println("Ваш результат: правильных ответов " + goals + " из " + qAnda.length );// вывод результата
    }
}
