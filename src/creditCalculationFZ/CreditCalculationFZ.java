package creditCalculationFZ;

import application.interfaces.IModul;
import creditCalculationFZ.client.classes.ClientCreditFZ;

public class CreditCalculationFZ implements IModul {
    private ModelCredit model;
    private ClientCreditFZ client;

    public CreditCalculationFZ() {
        client = ClientCreditFZ.getClient();
    }

    @Override
    public void start() {

    }
}
