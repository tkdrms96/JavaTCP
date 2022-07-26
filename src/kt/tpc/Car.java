package kt.tpc;

/*자식 클래스*/
public class Car extends Vehicle {

    public String handle = "";


    public void run()
    {
        System.out.println("달립니다.");
    }

    public void sound()
    {
        System.out.println("오버라이딩 부앙~");
    }
}
