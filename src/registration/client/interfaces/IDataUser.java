package registration.client.interfaces;

import registration.client.exceptions.FIOInvalidFormatException;
import registration.client.exceptions.InvalidDataFormatException;
import registration.client.exceptions.InvalidFloorException;
import registration.client.exceptions.InvalidNumberPhoneFormat;

public interface IDataUser {
    String getSurname() throws FIOInvalidFormatException;
    String getName() throws FIOInvalidFormatException;
    String getPatronymic() throws FIOInvalidFormatException;
    String getBirthData() throws InvalidDataFormatException;
    long getNumberPhone() throws InvalidNumberPhoneFormat;
    String getFloor() throws InvalidFloorException;
}
