package test3;

import kt.tpc.Vehicle;

public class gg {
    public static void main(String[] args) {
        Vehicle vh = new Vehicle();

        //vh.model; protected 접근자에 의해 다른 패키지에서 사용이 안됌
    }
}
