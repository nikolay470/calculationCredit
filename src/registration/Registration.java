package registration;

import application.interfaces.IModul;
import registration.model.classes.Model;
import registration.model.exceptions.RecordInFileException;
import registration.client.classes.Client;
import registration.client.exceptions.FIOInvalidFormatException;
import registration.client.exceptions.InvalidDataFormatException;
import registration.client.exceptions.InvalidFloorException;
import registration.client.exceptions.InvalidNumberPhoneFormat;

import java.util.HashMap;

public class Registration implements IModul {
    private Model model;
    private Client client;
    private HashMap<String, Object> data;

    public Registration() {
        model = Model.getModel();
        client = Client.getClient();
        data = new HashMap<>();
    }

    @Override
    public void start() {
        boolean flag = true;
        while (flag) {
            System.out.println("Введите следующие данные: ");
            while (flag) {
                try {
                    data.put("surname", client.dataUser.getSurname());
                    flag = false;
                } catch (FIOInvalidFormatException exception) {
                    client.messageSystem.printError("Вы ввели фамилию некоректно.\n" +
                            "Пожалуйста попробуйте ещё раз.");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("name", client.dataUser.getName());
                    flag = false;
                } catch (FIOInvalidFormatException ex) {
                    client.messageSystem.printError("Вы ввели имя некоректно.\n" +
                            "Пожалуйста попробуйте ещё раз.");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("patronymic", client.dataUser.getPatronymic());
                    flag = false;
                } catch (FIOInvalidFormatException ex) {
                    client.messageSystem.printError("Вы ввели отчество некоректно.\n" +
                            "Пожалуйста попробуйте ещё раз.");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("birthData", client.dataUser.getBirthData());
                    flag = false;
                } catch (
                        InvalidDataFormatException ex) {
                    client.messageSystem.printError("Вы ввели дату в некоректной форме\n" +
                            "Пожалуйста введите дату в формате дд.мм.гггг");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("numberPhone", client.dataUser.getNumberPhone());
                    flag = false;
                } catch (InvalidNumberPhoneFormat ex) {
                    client.messageSystem.printError("Вы ввели номер в некоректной формате\n" +
                            "Пожалуйста введите номер в формате 88007512324");
                }
            }
            flag = true;
            while (flag) {
                try {
                    data.put("floor", client.dataUser.getFloor());
                    flag = false;
                } catch (InvalidFloorException ex) {
                    client.messageSystem.printError("Вы ввели пол в некоректной форме\n" +
                            "Пожалуйста введите пол буквой \"м\" (мужской) или \"ж\" (женский)");
                }
            }
            flag = true;
            try {
                model.record.createRecordUser(data);
                client.messageSystem.printResult(true);
            } catch (RecordInFileException ex) {
                client.messageSystem.printResult(false);
            }
            flag = client.messageSystem.isAddRecord();
        }
    }
}






















