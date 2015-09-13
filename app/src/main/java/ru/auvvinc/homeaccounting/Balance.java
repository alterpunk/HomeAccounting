package ru.auvvinc.homeaccounting;

/**
 * Created by alterpunk on 12.09.2015.
 */
public class Balance {

    private int value;

    private static Balance instance;

    public static void initInstance() {
        if (instance == null) {
            instance = new Balance();
        }
    }

    public static Balance getInstance() {
        return instance;
    }

    private Balance() {

    }

    //В данном методе параметр short operation играет роль определителя типа операции
    //(приход или расход) в зависимости от этого плюсуем или минусуем баланс.
    //Необходимо зарезервировать значение 0 и 1 для прихода и расхода соответственно.
    public void setBalanceValue(int valueOfOperation, short operation) {
        if (operation == 0) {
            value += valueOfOperation;
        } else {
            value -= valueOfOperation;
        }
    }

    public int getBalanceValue() {
        return value;
    }

}
