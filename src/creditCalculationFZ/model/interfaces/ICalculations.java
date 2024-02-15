package creditCalculationFZ.model.interfaces;

import java.util.HashMap;

public interface ICalculations {
    float monthPaymentDef(int sum, HashMap<String, Integer> timeframe, float percentBet);
    float monthPaymentAn(int sum, HashMap<String, Integer> timeframe, float percentBet);
    float overPayment();
    int debtLoad();
    HashMap<String, String> firstPaymentLastPayment();
    int[] dinamicsMonthPayment();
}
