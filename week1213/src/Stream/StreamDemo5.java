package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo4 {
    private static int result;
    // 숫자 범위로부터 stream객체 생성
    public static void main(String[] args) {
        IntStream st = IntStream.rangeClosed(1, 10);

//        st.forEach(n -> System.out.println(n));
//        st.forEach(System.out::println);
        st.forEach(n -> result += n);
        System.out.println(result);
    }
}
