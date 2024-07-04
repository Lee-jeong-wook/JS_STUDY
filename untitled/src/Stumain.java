import java.util.Arrays;

public class Stumain {
    public static void main(String[] args){
        Student kim = new Student();
        kim.setSno(20401);
        kim.setName("김영호");
        kim.setTel("120231");
        kim.setAdd("김영호 김영호");

        Student yoon = new Student(20402, "윤지상", "324987", "윤상지 윤상지");
        //학생 배열 만들기
        Student[] student = new Student[10];
        //학생 데이터 넣기
        for(int i = 0; i < student.length; i++){
            student[i] = new Student(2013, "윤", "ㄴㅇ", "ㄴㅇ");
        }
        Student[] stu1 = new Student[5];
        //작은 배열에 큰 배열을 복사하면 주소값만 복시, 크기가 큰 배열 그대로 복사되고 인덱스만큼만 사용
        stu1 = student;

        Student[] stu2 = Arrays.copyOf(student, 1);
    }
}
