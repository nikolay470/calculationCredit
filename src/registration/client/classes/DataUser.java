package registration.client.classes;

import registration.client.classes.exceptions.FIOInvalidFormatException;
import registration.client.classes.exceptions.InvalidDataFormatException;
import registration.client.classes.exceptions.InvalidFloorException;
import registration.client.classes.exceptions.InvalidNumberPhoneFormat;
import registration.client.interfaces.CurrentLocal;
import registration.client.interfaces.IChekData;
import registration.client.interfaces.IDataUser;

import java.io.InputStream;
import java.util.Scanner;

public class DataUser implements IDataUser {
    private Scanner scanner;
    private CurrentLocal local;
    private IChekData checkData;

    public DataUser(InputStream stream, CurrentLocal local, IChekData check) {
        this.scanner = new Scanner(stream);
        this.local = local;
        this.checkData = check;
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
}
