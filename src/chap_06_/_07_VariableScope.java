package chap_06_;

public class _07_VariableScope {
    public static void methodA() {
        System.out.println(
                number);  //number 사용불가
        System.out.println(result); //result 사용불가

    }
    public static void methodB() {
       int result = 1; //지역 변수

    }

    public static void main(String[] args) {
        int number = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
        System.out.println(i);  //for문에 i 는 괄호안에서만 사용가능
        {
            int j = 0;
            System.out.println(j);
        }
        System.out.println(j); //지역 변수

    }
}
