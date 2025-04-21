package Day250317;

// 1. 추상 클래스 Animal1 정의
abstract class Animal1 {
    // 1-1. 추상 메서드 선언: 하위 클래스에서 반드시 구현해야 함
    public abstract void animalSound();
    
    // 1-2. 일반 메서드: 구현이 포함되어 있으며 하위 클래스에서 사용 가능
    public void sleep() {
        System.out.println("Zzz"); // 동물이 잠을 자는 소리 출력
    }
}

// 2. Animal1을 상속받는 Pig1 클래스
class Pig1 extends Animal1 {
    // 2-1. 추상 메서드 animalSound() 구현
    public void animalSound() {
        System.out.println("The pig says : wee wee"); // 돼지의 소리 출력
    }
    // sleep() 메서드는 Animal1에서 상속받아 별도 구현 불필요
}

// 3. 메인 클래스
public class Day250317_Abstraction {
    public static void main(String[] args) {
        // 3-1. Pig1 객체 생성
        Pig1 myPig = new Pig1();
        
        // 3-2. 메서드 호출
        myPig.animalSound(); // "The pig says : wee wee" 출력
        myPig.sleep();      // "Zzz" 출력
    }
}