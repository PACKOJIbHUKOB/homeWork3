public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}
    private static void task1() {
        System.out.println("задача 1");
        byte one = 127;
        short two = 32767;
        int three = 2147483647;
        long four = 9223372036854775807L;
        float five = 4.21564651F;
        double six =351654.5654661588;
        System.out.println("Значение переменной one с типом byte равно " + one);
        System.out.println("Значение переменной two с типом short равно " + two);
        System.out.println("Значение переменной three с типом int равно " + three);
        System.out.println("Значение переменной four с типом long равно " + four);
        System.out.println("Значение переменной five с типом float равно " + five);
        System.out.println("Значение переменной six с типом double равно " + six);
    }
    private static void task2() {
        System.out.println("задача 2");
        float a = 27.12F;
        long b = 987678965549L;
        float c = 2.768F;
        short d = 569;
        short e = -159;
        short i = 27897;
        byte f = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(i);
        System.out.println(f);
    }
    private static void task3() {
        System.out.println("задача 3");
        short totalPaper = 480;
        byte studentLuda = 23;
        byte studentAnna = 27;
        byte studentKatya = 30;
        byte totalstudents = (byte) (studentLuda + studentAnna + studentKatya);
        byte paperStudent = (byte) (totalPaper / totalstudents);
        System.out.println("На каждого ученика расчитанно " + paperStudent);
    }
    private static void task4() {
        System.out.println("задача 4");
        byte machinePerformance = 16;
        byte bottalsOneMinuts = (byte) (machinePerformance / 2);
        short botals20Minuts = (short) (bottalsOneMinuts * 20);
        short botalsDay = (short) (bottalsOneMinuts * 1440);
        int botalsThreeDays = botalsDay * 3;
        int botalsMonth = botalsDay * 30;
        System.out.println("За 20 минут машина произвела " +botals20Minuts + " штук бутылок");
        System.out.println("За день машина произвела " +botalsDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " +botalsThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " +botalsMonth + " штук бутылок");
    }
    private static void task5() {
        System.out.println("задача 5");
        byte totalCanPaint = 120;
        byte whitPaintOnClassroom = 2;
        byte brownPaintOnClassroom = 4;
        byte totalPaintOnCLassroom = (byte) (whitPaintOnClassroom + brownPaintOnClassroom);
        byte totalClassroom = (byte) (totalCanPaint / totalPaintOnCLassroom);
        byte totalWitePaint = (byte) (totalClassroom * whitPaintOnClassroom);
        byte totalBrownPaint = (byte) (totalClassroom * brownPaintOnClassroom);
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    private static void task6() {
        System.out.println("задача 6");
        byte bananWight = 80;
        byte milkWight = 105;
        byte iceCreamWight = 100;
        byte rawEggWight = 70;
        int totalBanansWight = bananWight * 5;
        int totalMilkWight = milkWight * 2;
        int totalIceCreamWight = iceCreamWight * 2;
        int totalRawEggWight = rawEggWight * 4;
        float totalWightGramm = totalBanansWight + totalMilkWight + totalIceCreamWight + totalRawEggWight;
        float totalWightKilogramm = totalWightGramm / 1000;
        System.out.println("вес завтрака спортсмена составил " + totalWightGramm + " грамм или " + totalWightKilogramm+" кг");
    }
    private static void task7() {
        System.out.println("задача 7");


    }

    private static void task8() {
        System.out.println("задача 8");}
}