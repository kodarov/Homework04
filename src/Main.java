public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) System.out.println("Если возраст человека равен "+age+" он совершеннолетний");
        else System.out.println("Если возраст человека равен "+age+" он не достиг совершеннолетия, нужно немного подождать");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temp=7;
        if (temp>=5) System.out.println("Сегодня на улице " + temp + " градусов, можно идти без шапки");
        else System.out.println("Сегодня на улице " + temp + " градусов, нужно надеть шапку");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed=70;
        if (speed>60) System.out.println("Если скорость " + speed + " придется заплатить штраф");
        else System.out.println("Если скорость " + speed + " можно ездить спокойно");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 24;
        String need;
        if (age>2 && age<=6) need = "нужно ходить в детский сад";
        else if (age > 6 && age <= 18) need = "нужно ходить в школу";
        else if (age > 18 && age <= 24) need = "нужно ходить в университет";
        else if (age > 24) need = "нужно ходить на работу";
        else need = "подрастай малыш";
        System.out.println("Если возраст человека " + age + " то " + need);
        }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 4;
        String permit;
        if (age < 5) permit = "не может кататься на аттракционе";
        else if (age >= 5 && age < 14) permit = "может кататься только в сопровождении взрослого";
        else permit = "может кататься без сопровождения взрослого";
        System.out.println("Если ребенку " + age + " лет то он " + permit);
        }
    public static void task6() {
        System.out.println("Задача 6");
        //вводные
        int seatPassenger = 55;
        int standingPassenger = 30;
        //параметры вагона
        int fullPlaces = 102;
        int seatPlaces = 60;
        int standingPlaces = fullPlaces - seatPlaces;
        // решение
        int freeSeatPlaces =  seatPlaces - seatPassenger;
        int freeStandingPlases = standingPlaces - standingPassenger;
        if (freeSeatPlaces > 0 && freeStandingPlases > 0) System.out.println("Места есть сидящие: " + freeSeatPlaces + ", стоячие: " + freeStandingPlases);
        else if (freeSeatPlaces > 0 && freeStandingPlases == 0) System.out.println("Места есть сидячие: " + freeSeatPlaces);
        else if (freeSeatPlaces == 0 && freeStandingPlases > 0) System.out.println("Места есть стоячие: " + freeStandingPlases);
        else System.out.println("Мест нет!");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 6;
        int two = 30;
        int three = -50;
        if (one > two && one > three) System.out.println("Самое большее " + one);
        else if (two > three) System.out.println("Самое большее " + two);
        else System.out.println("Самое большее " + three);
    }
}