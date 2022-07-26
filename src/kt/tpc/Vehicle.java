package kt.tpc;

/*부모 클래스*/
public class Vehicle {

    protected String model = "honggildong"; // 하위에서만 사용 할 수 있는 protected

    public void sound()
    {
        System.out.println("정적을 울렸습니다.");
    }
}
