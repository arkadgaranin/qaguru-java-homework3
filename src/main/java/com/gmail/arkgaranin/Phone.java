package com.gmail.arkgaranin;

public class Phone {

  char type; // s-смартфон, b-кнопочный мобильный, a-аналоговый стационарный телефон
  String color;
  int price;
  boolean isNew;

  public Phone(boolean isNew) {
    this.isNew = isNew;
  }

  void setType(char type) {
    this.type = type;
  }

  void setColor(String color) {
    this.color = color;
  }

  void setPrice(int price) {
    this.price = price;
  }

  String getPhoneCondition() {

    String PhoneCondition;

    if (!isNew) {
      PhoneCondition = "Поддержанный";
    }
    else {
      PhoneCondition = "Новый";
    }
    return PhoneCondition;
  }

  public void phoneIdentification() {

    String namePhone;

    if (price <= 2000 && type == 'b') {
      namePhone = "nokia6310";
      System.out.println("По выбранным параметрам Ваш телефон соответствует: " + namePhone + "\n");
    }
    else if (price > 2000 && type == 's') {
      namePhone = "iphone11";
      System.out.println("По выбранным параметрам Ваш телефон соответствует: " + namePhone + "\n");
    }
    else {
      System.out.println("К сожалению не получилось определить модель мобильного телефона :(");
    }
  }

}