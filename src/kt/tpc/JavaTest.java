package kt.tpc;

public class JavaTest {

    public static void main(String[] args) {
        Car car = new Car(); // 자식클래스

        System.out.println("상위클래스요소" + car.model);

        System.out.println("car" + car.handle);

        car.sound();

        //상속 = 코드 재사용할때, 이미 존재하고 검증된 클래스의 멤버변수와 매소드를 재사용해서 새로운 클래스 만들 때 사용
    }


}
