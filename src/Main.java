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
        byte totalStudents = (byte) (studentLuda + studentAnna + studentKatya);
        byte paperStudent = (byte) (totalPaper / totalStudents);
        System.out.println("На каждого ученика расчитанно " + paperStudent);
    }
    private static void task4() {
        System.out.println("задача 4");
        byte machinePerformance = 16;
        byte mints = 2;
        byte bottlesOneMints = (byte) (machinePerformance / mints);
        short bottles20Mints = (short) (bottlesOneMints * 20);
        short bottlesDay = (short) (bottlesOneMints * 1440);
        int bottlesThreeDays = bottlesDay * 3;
        int bottlesMonth = bottlesDay * 30;
        System.out.println("За 20 минут машина произвела " +bottles20Mints + " штук бутылок");
        System.out.println("За день машина произвела " +bottlesDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " +bottlesThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " +bottlesMonth + " штук бутылок");
    }
    private static void task5() {
        System.out.println("задача 5");
        byte totalCanPaint = 120;
        byte whitPaintOnClassroom = 2;
        byte brownPaintOnClassroom = 4;
        byte totalPaintOnClassroom = (byte) (whitPaintOnClassroom + brownPaintOnClassroom);
        byte totalClassroom = (byte) (totalCanPaint / totalPaintOnClassroom);
        byte totalWhitePaint = (byte) (totalClassroom * whitPaintOnClassroom);
        byte totalBrownPaint = (byte) (totalClassroom * brownPaintOnClassroom);
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    private static void task6() {
        System.out.println("задача 6");
        byte bananasWight = 80;
        byte milkWight = 105;
        byte iceCreamWight = 100;
        byte rawEggWight = 70;
        int totalBananasWight = bananasWight * 5;
        int totalMilkWight = milkWight * 2;
        int totalIceCreamWight = iceCreamWight * 2;
        int totalRawEggWight = rawEggWight * 4;
        float totalWightGram = totalBananasWight + totalMilkWight + totalIceCreamWight + totalRawEggWight;
        float totalWightKilogram = totalWightGram / 1000;
        System.out.println("вес завтрака спортсмена составил " + totalWightGram + " грамм или " + totalWightKilogram+" кг");
    }
    private static void task7() {
        System.out.println("задача 7");
        byte needLoseWightKg = 7;
        short minWeightInDay = 250;
        short maxWeightInDay = 500;
        int needLoseWightGram =needLoseWightKg * 1000;
        int totalMaxDay = needLoseWightGram / minWeightInDay;
        int totalMinDay = needLoseWightGram/maxWeightInDay;
        int averageTotalDay = (totalMaxDay+totalMinDay)/2;
        System.out.println("на похудение, если спортсмен будет терять каждый день по 250 грамм потребуеться "+totalMaxDay+" дней, а если по 500 грама " +totalMinDay+" дней, среднее количество дней "+averageTotalDay);
    }
    private static void task8() {
        System.out.println("задача 8");
        int payMarry = 67760;
        int payDen = 83690;
        int payKris = 76230;
        int payMarryYearOld = payMarry * 12;
        int payDenYearOld = payDen * 12;
        int payKrisYearOld = payKris * 12;
        float indecsProcent = 1.1F;
        float newPayMarry = payMarry*indecsProcent;
        float newPayDen = payDen*indecsProcent;
        float newPayKris = payKris*indecsProcent;
        float newPayMarryYear =newPayMarry*12;
        float newPayDenYear = newPayDen*12;
        float newPayKrisYear =newPayKris*12;
        float differencePayMarryYear = newPayMarryYear%payMarryYearOld;
        float differencePayDenYear =newPayDenYear%payDenYearOld;
        float differencePayKrisYear =newPayKrisYear%payKrisYearOld;

        System.out.println("Маша теперь получает "+newPayMarry+" рублей. Годовой доход вырос на "+differencePayMarryYear+ " рублей");
        System.out.println("Денис теперь получает "+newPayDen+" рублей. Годовой доход вырос на "+differencePayDenYear+ " рублей");
        System.out.println("Кристина теперь получает "+newPayKris+" рублей. Годовой доход вырос на "+differencePayKrisYear+ " рублей");
    }
}