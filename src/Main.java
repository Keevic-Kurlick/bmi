public class Main {
    public static void main(String[] args) {
        BmiCounter counter = new BmiCounter();
        double weight = 65;
        double height = 1.65;
        double bmi = counter.calculate(weight, height);
        System.out.println("Ваш ИМТ: " + bmi);
    }
}
