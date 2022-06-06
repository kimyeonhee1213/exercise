public class SwitchBasicPractice {
    public static void main(String[] args) {
        int month = 7;
        System.out.println(month + "월");

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일까지 있습니다.");
                break;
            case 2:
                System.out.println(month + "월은 28, 또는 29일까지 있습니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일까지 있습니다.");
                break;
            default:
                System.out.println("에러");
                break;
        }
    }
}
