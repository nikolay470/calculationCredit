package registration.model.classes;

import registration.model.interfaces.IRecord;

public class Model {
    private static Model model;
    public IRecord record;

    private Model() {
        record = new Record();
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
