package registration.client.interfaces;

import registration.client.classes.exceptions.FIOInvalidFormatException;
import registration.client.classes.exceptions.InvalidDataFormatException;
import registration.client.classes.exceptions.InvalidFloorException;
import registration.client.classes.exceptions.InvalidNumberPhoneFormat;


public interface IChekData {
    String checkFIO(String value, CurrentLocal local) throws FIOInvalidFormatException;
    String checkBirthData(String value) throws InvalidDataFormatException;
    long checkNumberPhone(String value) throws InvalidNumberPhoneFormat;
    String checkFloor(String value) throws InvalidFloorException;
}
