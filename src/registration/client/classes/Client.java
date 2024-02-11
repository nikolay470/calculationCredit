package registration.client.classes;

import registration.client.interfaces.IDataUser;

import java.io.InputStream;

public class Client {
    private static Client view;
    public IDataUser dataUser;
    public MessageSystem messageSystem;

    private Client(InputStream stream) {
        dataUser = new DataUser(stream, ControllerLocal.getRuLocal(), new Check());
        messageSystem = new MessageSystem(stream);
    }

    public static Client getClient() {
        if (view == null) {
            view = new Client(System.in);
            return view;
        } else {
            return view;
        }
    }
}
