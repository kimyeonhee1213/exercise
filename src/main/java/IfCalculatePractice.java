public class IfCalculatePractice {
    public static void main(String[] args) {
        double height = 170.0;
        double weight = 55.0;
        double bmi = weight / Math.pow((height * 0.01),2);
        System.out.println("신장: " + height + "(cm)");
        System.out.println("체중: " + weight + "(kg)");
        System.out.println("당신의 BMI 값은 " + bmi + "입니다");
        if(bmi >= 26.5) {
            System.out.println("비만입니다.");
        } else if (bmi < 25.5 && bmi >= 24) {
            System.out.println("과체중입니다.");
        } else if(bmi > 24 && bmi >= 20) {
            System.out.println("정상입니다.");
        } else if (bmi < 20 && bmi >= 0) {
            System.out.println("저체중입니다.");
        }
    }
}
