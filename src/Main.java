public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор миль");

        System.out.print("Введите стоимость билета в рублях: ");
        int price = 19000;

        int miles = price / 20;
        System.out.println("За покупку билета на " + price + " рублей начислено " + miles + " миль");
    }
}
