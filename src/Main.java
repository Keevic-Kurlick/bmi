public class Main {
    public static void main(String[] args) {
        BMICounter counter = new BMICounter();
        double weight = 65;
        double height = 1.65;
        double BMI = counter.calculate(weight, height);
        System.out.println("Ваш ИМТ: " + BMI);
    }
}
