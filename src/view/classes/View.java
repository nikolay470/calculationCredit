package view.classes;

import view.interfaces.IDataUser;
import view.interfaces.IView;

import java.io.InputStream;
import java.util.Scanner;

public class View implements IView {
    private static View view;
    private Scanner scanner;
    public IDataUser dataUser;

    private View(InputStream stream) {
        scanner = new Scanner(stream);
        dataUser = new DataUser(stream, ControllerLocal.getRuLocal(), new Check());
    }

    public static View getView() {
        if (view == null) {
            view = new View(System.in);
            return view;
        } else {
            return view;
        }
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
