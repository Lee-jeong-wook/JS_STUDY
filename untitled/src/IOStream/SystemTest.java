package IOStream;

//압출력 스트림
//자바의 다ㅏ양한 입출렭 장치에 독립적으로 일관성 있는 입출력 스트림을 제공
//입출력이 구현되는 곳: 파일 디스크, 키보드, 마우스, 네트워크, 메모리 등 모든 자료가 입출력 되는 곳들이 있다

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//입출력 스ㅡㅌ립의 구현(각각을 따로 구현해야 함)
//대상 기준: 입력 스트립, 출력 스트림
//자료의 종류: 바이트 스트림, 문자 스트림(한글)
public class SystemTest {
    public static void main(String[] args) {
        System.out.println("알파벳 하나 누르고 엔터");
        int i;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            while ((char)(i = isr.read()) != '\n'){
                System.out.println(i);
                System.out.println((char)i);
            }
        }catch (Exception e){

        }
    }
}
