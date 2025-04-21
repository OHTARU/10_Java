package Day250317;

// 2. 외부 클래스 정의
// - OuterClass1라는 이름의 외부 클래스를 생성합니다.
class OuterClass1 {
    // 2-1. 외부 클래스의 변수 선언
    // - int형 변수 x를 선언하고 10으로 초기화합니다.
    int x = 10;
    
    // 2-2. 정적 내부 클래스 정의
    // - static 키워드를 사용하여 InnerClass1를 정적 내부 클래스로 정의합니다.
    // - 정적 내부 클래스는 외부 클래스 객체 없이 독립적으로 생성 가능합니다.
    static class InnerClass1 {
        // 2-2-1. 내부 클래스의 변수 선언
        // - int형 변수 y를 선언하고 5로 초기화합니다.
        int y = 5;
    }
}

// 3. 메인 클래스 정의
// - 프로그램 실행을 위한 메인 클래스를 정의합니다.
public class Day250317 {
    // 3-1. main 메서드 작성
    // - 프로그램의 진입점(entry point)으로, 실행 시작 지점입니다.
    public static void main(String[] args) {
        // 3-2. 정적 내부 클래스 객체 생성
        // - OuterClass1의 객체 없이 InnerClass1 객체를 직접 생성합니다.
        // - static 내부 클래스는 외부 클래스 인스턴스 없이 접근 가능합니다.
        OuterClass1.InnerClass1 myInner = new OuterClass1.InnerClass1();
        
        // 3-3. 결과 출력
        // - myInner.y 값을 출력합니다. 결과는 5입니다.
        System.out.println(myInner.y);
    }
}