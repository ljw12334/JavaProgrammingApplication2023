package LambdaExpression2;
/*
Lambda Expression (람다식)
- 익명 메서드
- 메서드와 달리 특정 클래스에 종속되지 않지만, 매개변수, 리턴타입, 본체를 가진다
- 예외처리가 가능하다
- 메서드의 인수로 전달될 수도 있고 변수에 대입될 수도 있다
- 익명 구현 객체와 달리 메서드의 핵심 부분만 포함한다
- 실행문이 하나면 중괄호와 세미콜론을 생략할 수 있다
- 실행문이 하나의 리턴 구문이면 return 키워드도 생략 가능하다

인터페이스가 한 개의 추상 메서드로 이루어져야 함

(타입 매개변수...) -> {실행문; 실행문;}
 */

// 함수형 인터페이스
interface Positive {
    int pos(int x);
}
interface Prints {
    void print();
}
public class LambdaTest1 {
    public static void main(String[] args) {
        Positive po;
        Prints pr;

        // 변수에 대입될 수 있다
        po = (int n) -> { return n + 1; };
        po = (n) -> { return n + 1; };
        po = n -> { return n + 1; };

        // 리턴 구문 하나만 있을 때는 중괄호, 리턴 키워드 생략 가능
        po = (int n) -> n + 1;

        po = n -> n + 1;

        // 매개변수가 여러개거나 없을 때에는 괄호 생략 불가능
        pr = () -> {
            System.out.println("Hi~");
        };
        pr = () -> System.out.println("Hi~");
        pr.print();
    }
}
