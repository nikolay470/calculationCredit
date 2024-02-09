package view.interfaces;

import view.classes.exceptions.FIOInvalidFormatException;
import view.classes.exceptions.InvalidDataFormatException;
import view.classes.exceptions.InvalidFloorException;
import view.classes.exceptions.InvalidNumberPhoneFormat;

import java.util.Date;



public interface IChekData {
    String checkFIO(String value, CurrentLocal local) throws FIOInvalidFormatException;
    String checkBirthData(String value) throws InvalidDataFormatException;
    long checkNumberPhone(String value) throws InvalidNumberPhoneFormat;
    String checkFloor(String value) throws InvalidFloorException;
}
