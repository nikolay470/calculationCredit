package creditCalculation.client.classes;

import creditCalculation.client.exceptions.InvalidBetException;
import creditCalculation.client.exceptions.TypeCreditException;
import creditCalculation.client.interfaces.IChekParamCredit;

import java.text.DecimalFormat;

public class CheckParamCredit implements IChekParamCredit {

    @Override
    public int checkTypeCredit(String number) throws TypeCreditException {
        try {
            int num = Integer.parseInt(number);
            if (num > 0 && num < 4) {
                return num;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new TypeCreditException();
        }
    }

    @Override
    public int checkSumCredit(String sum) {
        try {
            int res = Integer.parseInt(sum);
            if (res >= 30_000 && res <= 6_000_000) {

            }
        }
    }

    @Override
    public float checkPercentBet(String bet) throws InvalidBetException {
        try {
            DecimalFormat formatter = new DecimalFormat("#.##");
            float res = Float.parseFloat(bet);
            res = Float.parseFloat(formatter.format(res));
            if (res > 0 && res < 50) {
                return res;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new InvalidBetException();
        }
    }

    @Override
    public int checkFirstPayment(String firstPayment) {
        try {
            int res = Integer.parseInt(firstPayment);

        }
    }

    @Override
    public String checkTypePayment(String typePayment) {
        return null;
    }

    @Override
    public int checkIncom(String incom) {
        return 0;
    }

    @Override
    public float checkCreditLoad(String load) {
        return 0;
    }
}
