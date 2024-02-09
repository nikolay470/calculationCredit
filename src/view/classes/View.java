package view.classes;

import view.classes.exceptions.*;
import view.interfaces.CurrentLocal;
import view.interfaces.IView;

import java.util.Scanner;

public class View implements IView {
    private static View view;
    private Scanner scanner;
    private CurrentLocal local;
    private Check checkData;

    private View() {
        scanner = new Scanner(System.in);
        local = RU_local.getLocal();
        checkData = new Check();
    }

    public static View getView() {
        if (view == null) {
            view = new View();
            return view;
        } else {
            return view;
        }
    }
    public void invitation() {
        System.out.println("Введите следующие данные: ");
    }
    @Override
    public String getSurname() throws FIOInvalidFormatException {
        System.out.println("Фамилия: ");
        return checkData.checkFIO(scanner.nextLine(), local);
    }
    @Override
    public String getName() throws FIOInvalidFormatException {
        System.out.println("Имя: ");
        return checkData.checkFIO(scanner.nextLine(), local);
    }
    @Override
    public String getPatronymic() throws FIOInvalidFormatException {
        System.out.println("Отчество: ");
        return checkData.checkFIO(scanner.nextLine(), local);
    }
    @Override
    public String getBirthData() throws InvalidDataFormatException {
        System.out.println("Дата рождения (дд.мм.гггг): ");
        return checkData.checkBirthData(scanner.nextLine());
    }
    @Override
    public long getNumberPhone() throws InvalidNumberPhoneFormat {
        System.out.println("Номер телефона: ");
        return checkData.checkNumberPhone(scanner.nextLine());
    }
    @Override
    public String getFloor() throws InvalidFloorException {
        System.out.println("Ваш пол: ");
        return checkData.checkFloor(scanner.nextLine());
    }

    @Override
    public void printResult(boolean res) {
        if (res) {
            System.out.println("Внесение данных пршло успешно");
        } else {
            System.out.println("Извините, что пошло не так. Ваша регистрация была прервана" +
                    "Пожалуйста попробуйте еще раз.");
        }
    }

    @Override
    public void printError(String mess) {
        System.out.println(mess);
    }

    public boolean isAddRecord() {
        boolean flag = true;
        while (flag) {
            System.out.println("Добавить ещё запись? [да / нет]");
            String res = scanner.nextLine();
            if (res.equalsIgnoreCase("нет")) {
                flag = false;
                return flag;
            } else if (res.equalsIgnoreCase("да")) {
                return flag;
            } else {
                System.out.println("Пожалуйста введите \"да\" или \"нет\"");
            }
        }
        return flag;
    }
}
