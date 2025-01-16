package ru.netology.javaqa.javaqamvn.services;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = service.calcBonus(500,true);

        System.out.println(bonus);
    }
}
