public class Main {
    public static void main(String[] args) {
//  Задание 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        {
            System.out.println();
        }
//  Задание 2
        for (int fri = 3; fri < 31; fri += 7) {
            System.out.println("Сегодня пятница, " + fri + "-е число. Необходимо подготовить отчет.");
        }
//  Задание 3
        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endOfPeriod = currentYear + 100;
        for (int year = startYear; year <= endOfPeriod; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}


