package org.dimigo.Sangsok;

public class Galaxy extends SmartPhone {
    public Galaxy() {
    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }
    public void pay() {
        System.out.println("삼성페이로 결제합니다.");
    }
    public void useWirelessCharging(){
        System.out.println("무선충전기능을 사용합니다.");
    }
}
