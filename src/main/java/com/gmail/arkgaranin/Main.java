package com.gmail.arkgaranin;

public class Main {

  public static void main(String[] args) {

    Phone phone1 = new Phone(false);
    Phone phone2 = new Phone(true);
    Phone phone3 = new Phone(true);

    phone1.setType('b');
    phone1.setColor("grey");
    phone1.setPrice(1000);
    System.out.println("Состояние телефона: " + phone1.getPhoneCondition());
    phone1.phoneIdentification();

    phone2.setType('s');
    phone2.setColor("yellow");
    phone2.setPrice(54000);
    System.out.println("Состояние телефона: " + phone2.getPhoneCondition());
    phone2.phoneIdentification();

    phone3.setType('a');
    phone3.setPrice(900);
    System.out.println("Состояние телефона: " + phone3.getPhoneCondition());
    phone3.phoneIdentification();
  }

}