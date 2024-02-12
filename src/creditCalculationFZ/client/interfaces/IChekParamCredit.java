package creditCalculationFZ.client.interfaces;

import creditCalculationFZ.client.exceptions.*;

public interface IChekParamCredit {
    int checkTypeCredit(String number) throws TypeCreditException;
    int checkSumCredit(String sum, int typeCredit) throws InvalidSumException;
    float checkPercentBet(String bet) throws InvalidBetException;
    int checkFirstPayment(String firstPayment) throws InvalidSumException;
    String checkTypePayment(String typePayment) throws InvalidTypePaymentException;
    int checkIncom(String incom) throws InvalidSumException;
    float checkCreditLoad(String load) throws InvalidCreditLoad, BigPrecentLoadException;
}
