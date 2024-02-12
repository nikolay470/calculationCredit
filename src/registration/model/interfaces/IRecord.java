package registration.model.interfaces;

import registration.model.exceptions.RecordInFileException;

import java.util.HashMap;

public interface IRecord {
    void createRecordUser(HashMap<String, Object> data) throws RecordInFileException;
}