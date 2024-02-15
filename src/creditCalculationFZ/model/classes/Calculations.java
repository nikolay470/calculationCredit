package creditCalculationFZ.model.classes;

import creditCalculationFZ.model.interfaces.ICalculations;

import java.util.HashMap;

public class Calculations implements ICalculations {
    @Override
    public float monthPaymentDef(int sum, HashMap<String, Integer> timeframe, float percentBet) {
        float res = 0;

    }

    @Override
    public float monthPaymentAn(int sum, HashMap<String, Integer> timeframe, float percentBet) {
        return 0;
    }

    @Override
    public float overPayment() {
        return 0;
    }

    @Override
    public int debtLoad() {
        return 0;
    }

    @Override
    public HashMap<String, String> firstPaymentLastPayment() {
        return null;
    }

    @Override
    public int[] dinamicsMonthPayment() {
        return new int[0];
    }
}
