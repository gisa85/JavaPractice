package org.dimigo.Sangsok;

public class IPhone extends SmartPhone {
    public IPhone() {
    }

    public IPhone(String model, String company, int price) {
        super(model, company, price);
    }
    public void pay() {
        System.out.println("애플페이로 결제합니다.");
    }
    public void useAirDrop() {
        System.out.println("AirDrop기능을 사용합니다.");
    }
}
