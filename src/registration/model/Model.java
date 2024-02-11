package registration.model;

import registration.model.exceptions.RecordInFileException;
import registration.model.interfaces.IModel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;;

public class Model implements IModel {
    private static Model model;
    private Model() {}

    @Override
    public void createRecordUser(HashMap<String, Object> data) throws RecordInFileException {
        try {
            String pathFile = "src/" + data.get("surname") + ".txt";
            FileWriter writer = new FileWriter(pathFile, true);
            String record = String.format(
                    "%s %s %s\nДата рождения: %s\n"
                    + "Номер телефона: %d\nПол: %s\n"
                    +"============================================\n\n",
                    data.get("surname"), data.get("name"), data.get("patronymic"),
                    data.get("birthData"), data.get("numberPhone"), data.get("floor")
            );
            writer.write(record);
            writer.close();
        } catch (IOException exception) {
            throw new RecordInFileException();
        }
    }

    public static Model getModel() {
        if (model == null) {
            model = new Model();
            return model;
        } else {
            return model;
        }
    }
}
