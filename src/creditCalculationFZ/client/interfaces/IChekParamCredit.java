package creditCalculationFZ.client.interfaces;

import creditCalculationFZ.client.exceptions.*;

import java.util.HashMap;

public interface IChekParamCredit {
    int checkTypeCredit(String number) throws TypeCreditException;
    int checkSumCredit(String sum, int typeCredit) throws InvalidSumException;
    float checkPercentBet(String bet) throws InvalidBetException;
    HashMap<String, Integer> checkTimeframeCredit(String year, String months, int creditType) throws InvalidTimeframeCreditException;
    int checkFirstPayment(String firstPayment) throws InvalidSumException;
    String checkTypePayment(String typePayment) throws InvalidTypePaymentException;
    int checkIncom(String incom) throws InvalidSumException;
    float checkCreditLoad(String load) throws InvalidCreditLoad, BigPrecentLoadException;
}
