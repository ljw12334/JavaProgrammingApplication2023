package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


// 파일로부터 stream 객체 생성
public class StreamDemo7 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:/java_a/week1213/src/Stream/java.txt");
            Stream<String> st;

            // Files 클래시의 line()
            st = Files.lines(path, Charset.defaultCharset());
            st.forEach(System.out::println);

            // BufferedReader 클래스의 lines() (레거시)
            File file = path.toFile(); // 경로 path로부터 file을 반환
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            st = bufferedReader.lines();
            st.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
