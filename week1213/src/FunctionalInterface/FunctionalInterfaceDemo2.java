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

public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(7));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(7, -11));


        Consumer<String> pokemon = (name) -> {
            System.out.println(name + "!");
        };
        pokemon.accept("피카츄");
    }
}
