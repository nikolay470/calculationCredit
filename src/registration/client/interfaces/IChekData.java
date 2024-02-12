package registration.client.interfaces;

import registration.client.exceptions.FIOInvalidFormatException;
import registration.client.exceptions.InvalidDataFormatException;
import registration.client.exceptions.InvalidFloorException;
import registration.client.exceptions.InvalidNumberPhoneFormat;


public interface IChekData {
    String checkFIO(String value, CurrentLocal local) throws FIOInvalidFormatException;
    String checkBirthData(String value) throws InvalidDataFormatException;
    long checkNumberPhone(String value) throws InvalidNumberPhoneFormat;
    String checkFloor(String value) throws InvalidFloorException;
}
