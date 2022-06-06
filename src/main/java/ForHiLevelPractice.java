public class ForHiLevelPractice {
    public static void main(String[] args) {
        //단수를 나타내는 변수
        int level = 5;
        for (int i = 0; i < level; i++) {
            for (int j = 1; j < level-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
