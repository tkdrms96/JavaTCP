package animal;

public class test {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        Animal owl    = new Owl();
        Animal dog    = new Dog();

        animal.animalBark();
        owl.animalBark();
        dog.animalBark();*/

        /*쉬운 교체로 기존 코드 재사용*/

        Animal animal = new Animal(); // new 생성자로 무엇을 생성하냐에 따라 코드를 재사용할 수 있음

        animal.animalBark();

        //코드의확장
        if(animal instanceof Owl){
            System.out.println("ㅋㅋ");

           // instanceof 특정 클래스를 확인하는것 true or false 반환
        }


    }
}
