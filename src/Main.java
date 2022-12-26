public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}