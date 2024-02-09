package view.interfaces;

import view.classes.exceptions.*;

import java.util.Date;


public interface IView {
    String getSurname() throws FIOInvalidFormatException;
    String getName() throws FIOInvalidFormatException;
    String getPatronymic() throws FIOInvalidFormatException;
    String getBirthData() throws InvalidDataFormatException;
    long getNumberPhone() throws InvalidNumberPhoneFormat;
    String getFloor() throws InvalidFloorException;
    void printResult(boolean res);
    void printError(String mess);
}
