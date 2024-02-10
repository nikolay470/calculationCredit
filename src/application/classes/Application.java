package application.classes;

import application.interfaces.IApp;
import model.classes.Model;
import model.classes.exceptions.RecordInFileException;
import view.classes.View;
import view.classes.exceptions.FIOInvalidFormatException;
import view.classes.exceptions.InvalidDataFormatException;
import view.classes.exceptions.InvalidFloorException;
import view.classes.exceptions.InvalidNumberPhoneFormat;

import java.util.HashMap;

public class Application implements IApp {
    private Model model;
    private View view;
    private HashMap<String, Object> data;

    public Application() {
        model = Model.getModel();
        view = View.getView();
        data = new HashMap<>();
    }

    @Override
    public void start() {
        boolean flag = true;
        while (flag) {
            System.out.println("Введите следующие данные: ");
            while (flag) {
                try {
                    data.put("surname", view.dataUser.getSurname());
                    flag = false;
                } catch (FIOInvalidFormatException exception) {
                    view.printError("Вы ввели фамилию некоректно.\n" +
                            "Пожалуйста попробуйте ещё раз.");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("name", view.dataUser.getName());
                    flag = false;
                } catch (FIOInvalidFormatException ex) {
                    view.printError("Вы ввели имя некоректно.\n" +
                            "Пожалуйста попробуйте ещё раз.");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("patronymic", view.dataUser.getPatronymic());
                    flag = false;
                } catch (FIOInvalidFormatException ex) {
                    view.printError("Вы ввели отчество некоректно.\n" +
                            "Пожалуйста попробуйте ещё раз.");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("birthData", view.dataUser.getBirthData());
                    flag = false;
                } catch (
                        InvalidDataFormatException ex) {
                    view.printError("Вы ввели дату в некоректной форме\n" +
                            "Пожалуйста введите дату в формате дд.мм.гггг");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("numberPhone", view.dataUser.getNumberPhone());
                    flag = false;
                } catch (InvalidNumberPhoneFormat ex) {
                    view.printError("Вы ввели номер в некоректной формате\n" +
                            "Пожалуйста введите номер в формате 88007512324");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("floor", view.dataUser.getFloor());
                    flag = false;
                } catch (InvalidFloorException ex) {
                    view.printError("Вы ввели пол в некоректной форме\n" +
                            "Пожалуйста введите пол буквой \"м\" (мужской) или \"ж\" (женский)");
                }
            }
            flag = true;
            try {
                model.createRecordUser(data);
                view.printResult(true);
            } catch (RecordInFileException ex) {
                view.printResult(false);
            }
            flag = view.isAddRecord();
        }
    }
}






















