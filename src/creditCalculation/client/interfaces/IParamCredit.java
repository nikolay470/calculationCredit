package creditCalculation.client.interfaces;

import creditCalculation.client.exceptions.*;

import java.util.Map;

public interface IParamCredit {
    int typeCredit() throws TypeCreditException;
    int sumCredit() throws InvalidSumException;
    float percentBet() throws InvalidBetException;
    int firstPayment() throws InvalidSumException;
    String typePayment() throws InvalidTypePaymentException;
    int incom() throws InvalidSumException;
    float creditLoad() throws InvalidFormatCreditLoad;
}
