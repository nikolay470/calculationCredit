package creditCalculationFZ.client.interfaces;

import creditCalculationFZ.client.exceptions.*;

import java.util.HashMap;

public interface IParamCredit {
    int typeCredit() throws TypeCreditException;
    int sumCredit() throws InvalidSumException;
    float percentBet() throws InvalidBetException;
    public HashMap<String, Integer> timeframeCredit() throws InvalidTimeframeCreditException;
    int firstPayment() throws InvalidSumException;
    String typePayment() throws InvalidTypePaymentException;
    int incom() throws InvalidSumException;
    float creditLoad() throws InvalidCreditLoad, BigPrecentLoadException;
}
