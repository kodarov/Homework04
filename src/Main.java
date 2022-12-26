public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}