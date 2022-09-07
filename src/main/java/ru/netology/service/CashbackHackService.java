package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;  //кешбек от 1000

    public int remain(int amount) { //докупить в зависимости от потраченной суммы
        return boundary - amount % boundary;
    }
}
