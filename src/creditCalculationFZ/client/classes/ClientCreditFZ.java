package creditCalculationFZ.client.classes;

public class ClientCreditFZ {
    private static ClientCreditFZ client;
    public ParamCreditFZ paramCredit;

    private ClientCreditFZ(ParamCreditFZ paramCredit) {
        this.paramCredit = paramCredit;
    }

    public static ClientCreditFZ getClient() {
        if (client == null) {
            client = new ClientCreditFZ(new ParamCreditFZ(System.in, new CheckParamCreditFZ()));
            return client;
        } return client;
    }
}
