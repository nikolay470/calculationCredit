package registration.client.interfaces;

import registration.client.classes.exceptions.FIOInvalidFormatException;
import registration.client.classes.exceptions.InvalidDataFormatException;
import registration.client.classes.exceptions.InvalidFloorException;
import registration.client.classes.exceptions.InvalidNumberPhoneFormat;

public interface IDataUser {
    String getSurname() throws FIOInvalidFormatException;
    String getName() throws FIOInvalidFormatException;
    String getPatronymic() throws FIOInvalidFormatException;
    String getBirthData() throws InvalidDataFormatException;
    long getNumberPhone() throws InvalidNumberPhoneFormat;
    String getFloor() throws InvalidFloorException;
}
