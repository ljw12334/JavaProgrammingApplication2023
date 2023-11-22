package FunctionalInterface;
/*
함수식 인터페이스 (java8 이상)
Type        parameter   returnValue   method
Predicate   O           boolean       test()
Supplier    X           O             get()
Consumer    O           void          accept()
Function    O           O             apply()
Operator    O           O             apply()

 */


import java.util.function.*;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        IntPredicate odd = x -> x % 2 == 1;
//        System.out.println(odd.test(11) ? "홀수" : "짝수");

        Supplier<Double> s1 = () -> 2.71;
        System.out.println(s1.get());

////        IntSupplier s2 = () -> (int) (Math.random() * 6 + 1);
//        IntSupplier s2 = () -> {
//            System.out.println("주사위를 굴립니다");
//            return (int) (Math.random() * 6 + 1);
//        };
//        System.out.println(s2.getAsInt());

////        Consumer<String> c1 = n -> System.out.println(n.toUpperCase());
//        Consumer<String> c1 = n -> {
//            System.out.println(n.toUpperCase());
//            System.out.println(n.toLowerCase());
//        };
//        c1.accept("Hello Java");
//
//        BiConsumer<Integer, Integer> c2 = (n1, n2) -> System.out.println(n1 + n2);
//        c2.accept(7, 8);
//
//        Function<Integer, Integer> f1 = n -> n + 8;
//        System.out.println(f1.apply(7));

        ToDoubleBiFunction<String, Integer> f2 = (pi, radius) -> Double.parseDouble(pi) * radius * radius;
        double area = f2.applyAsDouble("3.141592", 10);
        System.out.println(area);

    }
}
