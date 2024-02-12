package creditCalculation.client.classes;

import creditCalculation.client.exceptions.*;
import creditCalculation.client.interfaces.IParamCredit;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class ParamCredit implements IParamCredit {
    private Scanner scanner;
    private CheckParamCredit check;

    public ParamCredit(InputStream stream, CheckParamCredit check) {
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
        return check.checkTypeCredit(number);
    }

    @Override
    public int sumCredit() throws InvalidSumException {
        System.out.println("Сумма кридита.");
        System.out.println("Ввод: ");
        String sum = scanner.nextLine();
        return check.checkSumCredit(sum);
    }

    @Override
    public float percentBet() throws InvalidBetException {
        System.out.println("Ставка по кредиту (без знака %)");
        System.out.print("Ввод: ");
        String bet = scanner.nextLine();
        return check.checkPercentBet(bet);
    }

    @Override
    public int firstPayment() throws InvalidSumException {
        System.out.println("Сумма первоначального взноса.");
        System.out.println("Ввод: ");
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
    public float creditLoad() throws InvalidFormatCreditLoad{
        System.out.println("Сумма всех платежей по кредитам в месяц");
        System.out.println("Ввод: ");
        String load = scanner.nextLine();
        return check.checkCreditLoad(load);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParamCredit that = (ParamCredit) o;
        return Objects.equals(scanner, that.scanner) && Objects.equals(check, that.check);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner, check);
    }
}
