package creditCalculationFZ.client.classes;

import creditCalculationFZ.client.exceptions.*;
import creditCalculationFZ.client.interfaces.IParamCredit;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class ParamCreditFZ implements IParamCredit {
    private Scanner scanner;
    private CheckParamCreditFZ check;
    private int creditType;

    public ParamCreditFZ(InputStream stream, CheckParamCreditFZ check) {
        scanner = new Scanner(stream);
        this.check = check;
    }

    @Override
    public int typeCredit() throws TypeCreditException {
        System.out.println("Выберите тип кредита (введите номер)");
        System.out.println(
                "1) Потребитльский кредит\n2) Автокредит\n3) Ипотечный кредит (введите номер)"
        );
        System.out.print("Ввод: ");
        String number = scanner.nextLine();
        creditType = check.checkTypeCredit(number);
        return creditType;
    }

    @Override
    public int sumCredit() throws InvalidSumException {
        System.out.println("Сумма кридита.");
        System.out.println("Ввод: ");
        String sum = scanner.nextLine();
        return check.checkSumCredit(sum, creditType);
    }

    @Override
    public float percentBet() throws InvalidBetException {
        System.out.println("Ставка по кредиту (без знака %)");
        System.out.print("Ввод: ");
        String bet = scanner.nextLine();
        return check.checkPercentBet(bet);
    }

    @Override
    public HashMap<String, Integer> timeframeCredit() throws InvalidTimeframeCreditException {
        System.out.println("Срок кредита.");
        System.out.print("Сколько лет: ");
        String year = scanner.nextLine();
        System.out.print("Сколько месяцев: ");
        String months = scanner.nextLine();
        return check.checkTimeframeCredit(year, months, creditType);
    }

    @Override
    public int firstPayment() throws InvalidSumException {
        System.out.println("Сумма первоначального взноса.");
        System.out.print("Ввод: ");
        String firstPayment = scanner.nextLine();
        return check.checkFirstPayment(firstPayment);
    }

    @Override
    public String typePayment() throws InvalidTypePaymentException {
        System.out.println("Тип платежа.");
        System.out.println("1) Аннуитетный\n2) Дифференциированный (введите номер)");
        System.out.println("Ввод: ");
        String number = scanner.nextLine();
        return check.checkTypePayment(number);
    }

    @Override
    public int incom() throws InvalidSumException {
        System.out.println("Месячный доход.");
        System.out.println("Ввод: ");
        String incom = scanner.nextLine();
        return check.checkIncom(incom);
    }

    @Override
    public float creditLoad() throws InvalidCreditLoad, BigPrecentLoadException {
        System.out.println("Сумма всех платежей по кредитам в месяц");
        System.out.println("Ввод: ");
        String load = scanner.nextLine();
        return check.checkCreditLoad(load);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParamCreditFZ that = (ParamCreditFZ) o;
        return Objects.equals(scanner, that.scanner) && Objects.equals(check, that.check);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner, check);
    }
}
