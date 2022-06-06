public class MethodBasicPractice {
    public static void main(String[] args) {
        display("테스트",5);
    }

    static void display(String str, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
