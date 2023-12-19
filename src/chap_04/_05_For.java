package chap_04;

public class _05_For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("환영합니다 나코입니다."+i);
        }
        // 짝수만 출력 (fori만 치고 엔터)
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);

        }
        System.out.println();

        //홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);

        }
        //거꾸로 숫자
        //5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        //1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;

        }
        System.out.println(sum);
    }



}
