package LambdaExpression;

import java.util.Arrays;

class Circle implements Comparable<Circle> { // generic 으로 Circle만 받아옴
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return String.format("원의 반지름은 %s입니다.", radius);
    }

    @Override
//    public int compareTo(Object o) { // 비교 기준
//        Circle c = (Circle) o; // 비교할 다른 객체
//        return (int) (getArea() - c.getArea()); // 크다, 작다, 같다를 반환 (1, 0, -1)
//    }
    public int compareTo(Circle c) { // 비교 기준// 비교할 다른 객체
        return (int) (getArea() - c.getArea()); // 크다, 작다, 같다를 반환 (1, 0, -1)
    }
}
public class CircleDemoTest1 {
    public static void main(String[] args) {
        Circle[] circles = { new Circle(5.0), new Circle(2.5), new Circle(10.0)};

        Arrays.sort(circles); // Circle은 사용자가 생성한 클래스로 sort의 기준이 무엇인지 알 수 없어 오류 발생

        for (Circle c : circles)
            System.out.println(c);
    }
}
