package view.interfaces;

import view.classes.exceptions.FIOInvalidFormatException;
import view.classes.exceptions.InvalidDataFormatException;
import view.classes.exceptions.InvalidFloorException;
import view.classes.exceptions.InvalidNumberPhoneFormat;

public interface IDataUser {
    String getSurname() throws FIOInvalidFormatException;
    String getName() throws FIOInvalidFormatException;
    String getPatronymic() throws FIOInvalidFormatException;
    String getBirthData() throws InvalidDataFormatException;
    long getNumberPhone() throws InvalidNumberPhoneFormat;
    String getFloor() throws InvalidFloorException;
}
