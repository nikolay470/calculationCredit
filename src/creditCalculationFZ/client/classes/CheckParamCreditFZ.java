package creditCalculationFZ.client.classes;

import creditCalculationFZ.client.exceptions.*;
import creditCalculationFZ.client.interfaces.IChekParamCredit;
import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.beans.Introspector;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Objects;

public class CheckParamCreditFZ implements IChekParamCredit {
    private final int MROT = 13_890;
    private int incomeUser;

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
    public int checkSumCredit(String sum, int typeCredit) throws InvalidSumException{
        try {
            int res = Integer.parseInt(sum);
            if (typeCredit == 1) {
                if (res >= 30_000 && res <= 300_000) {
                    return res;
                } else {
                    throw new RuntimeException();
                }
            } else if (typeCredit == 2) {
                if (res >= 30_000 && res <= 700_000) {
                    return res;
                } else {
                    throw new RuntimeException();
                }
            } else {
                if (res >= 30_000 && res <= 6_000_000) {
                    return res;
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException e) {
            throw new InvalidSumException();
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
    public HashMap<String, Integer> checkTimeframeCredit(String year, String months, int creditType)
            throws InvalidTimeframeCreditException
    {
        HashMap<String, Integer> res = new HashMap<>();
        try {
            Integer intYears = Integer.parseInt(year);
            Integer intMonths = Integer.parseInt(months);
            if (creditType == 1 || creditType == 2) {
                if ((intYears >= 1 && intYears <= 7) && (intMonths >= 0 && intMonths <= 11)) {
                    res.put("years", intYears);
                    res.put("months", intMonths);
                    return res;
                } else {
                    throw new RuntimeException();
                }
            } else {
                if ((intYears >=1 && intYears <= 30) && (intMonths >= 0 && intMonths <= 11)) {
                    res.put("years", intYears);
                    res.put("months", intMonths);
                    return res;
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (RuntimeException e) {
            throw new InvalidTimeframeCreditException();
        }
    }

    @Override
    public int checkFirstPayment(String firstPayment) throws InvalidSumException {
        try {
            int res = Integer.parseInt(firstPayment);
            if (res >= 10000 && res <= 6_000_000) {
                return res;
            } else {
                throw new RuntimeException();
            }
        } catch(RuntimeException e) {
            throw new InvalidSumException();
        }
    }

    @Override
    public String checkTypePayment(String typePayment) throws InvalidTypePaymentException {
        try {
            int type = Integer.parseInt(typePayment);
            if (type > 0 && type < 3) {
                if (type == 1) {
                    return "An";
                } else {
                    return "Def";
                }
            } else {
                throw new  RuntimeException();
            }
        } catch (RuntimeException e) {
            throw new InvalidTypePaymentException();
        }
    }

    @Override
    public int checkIncom(String incom) throws InvalidSumException {
        try {
            int res = Integer.parseInt(incom);
            if (res >= MROT && res <= 2_000_000) {
                incomeUser = res;
                return incomeUser;
            } else {
                throw new RuntimeException();
            }
        } catch(RuntimeException e) {
            throw new InvalidSumException();
        }
    }

    @Override
    public float checkCreditLoad(String load) throws BigPrecentLoadException,
            InvalidCreditLoad
    {
        try {
            int res = Integer.parseInt(load);
            int percent = res / (incomeUser / 100);
            if (percent <= 45 && percent >= 0) {
                return res;
            } else {
                throw new BigPrecentLoadException();
            }
        } catch (RuntimeException e) {
            throw new InvalidCreditLoad();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckParamCreditFZ that = (CheckParamCreditFZ) o;
        return MROT == that.MROT && incomeUser == that.incomeUser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(MROT, incomeUser);
    }
}
