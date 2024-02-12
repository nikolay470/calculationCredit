package creditCalculation.client.interfaces;

import creditCalculation.client.exceptions.InvalidBetException;
import creditCalculation.client.exceptions.InvalidSumException;
import creditCalculation.client.exceptions.TypeCreditException;

public interface IChekParamCredit {
    int checkTypeCredit(String number) throws TypeCreditException;
    int checkSumCredit(String sum) throws InvalidSumException;
    float checkPercentBet(String bet) throws InvalidBetException;
    int checkFirstPayment(String firstPayment);
    String checkTypePayment(String typePayment);
    int checkIncom(String incom);
    float checkCreditLoad(String load);
}
