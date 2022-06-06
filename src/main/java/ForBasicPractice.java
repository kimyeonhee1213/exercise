public class ForBasicPractice {
    public static void main(String[] args) {
        for (int i = 21; i <= 29; i++) {
            for (int j = 3; j < 10; j++) {
                if(i % j == 0){
                    System.out.println(i + "은(는) " + j + "의 배수입니다.");
                }
            }
        }
    }
}
