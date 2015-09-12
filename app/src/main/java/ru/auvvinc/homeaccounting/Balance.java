package ru.auvvinc.homeaccounting;

/**
 * Created by alterpunk on 12.09.2015.
 */
public class Balance {

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

}
