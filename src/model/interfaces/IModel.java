package model.interfaces;

import model.classes.exceptions.RecordInFileException;

import java.io.IOException;
import java.util.HashMap;

public interface IModel {
    void createRecordUser(HashMap<String, Object> data) throws RecordInFileException;
}
