package Code.Seminars.Seminar_4.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель - содержит данные и бизнес логику
 */
public class BankModel {
    private List<Client> clients;

    public BankModel() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List <Client> getClients() {
        return clients;
    }
}