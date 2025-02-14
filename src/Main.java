public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int investment = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + investment;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRatePerYear = 17 * (population / 1000);
        int mortalityPerYear = 8 * (population / 1000);
        int year = 0;
        while (year < 11) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
            population = population + birthRatePerYear - mortalityPerYear;
        }
        System.out.println("Задача 4");
        int deposit = 15000;
        int monthNumber = 0;
        while (deposit < 12_000_000) {
            deposit += (int) (deposit * 0.07);
            monthNumber++;
            System.out.println("За " + monthNumber + " месяц сумма накопления составляет " + deposit);
        }
        System.out.println("Задача 5");
        deposit = 15000;
        monthNumber = 0;
        while (deposit < 12_000_000) {
            deposit += (int) (deposit * 0.07);
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("За " + monthNumber + " месяц сумма накопления составляет " + deposit);
            }
        }
        System.out.println("Задача 6");
        deposit = 15000;
        monthNumber = 0;
        int depositPeriod = 12 * 9;
        while (monthNumber < depositPeriod) {
            deposit += (int) (deposit * 0.07);
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("За " + monthNumber + " месяц сумма накопления составляет " + deposit);
            }
        }
        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("Задача 8");
        int currentYear = 2024;
        int previousYear = currentYear - 200;
        int nextYear = currentYear + 100;
        year = previousYear;
        while (year <= nextYear) {
            year++;
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}