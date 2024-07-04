package lambda;

// 람다식은 한개의 인터페이스에 한개의 메소드
// 람다식을 쓰려면 FunctionalInterface 어노테이션 사용
@FunctionalInterface
public interface Add {
    public int add(int a, int b);
}
