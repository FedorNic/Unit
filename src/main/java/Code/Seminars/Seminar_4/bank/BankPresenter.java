package Code.Seminars.Seminar_4.bank;

import java.util.List;

/**
 * Связывает модель и представление. Обрабатывает взаимодействие пользователя
 */
public class BankPresenter {
    private BankModel model;
    private BankView view;

    public BankPresenter(BankModel model, BankView view) {
        this.model = model;
        this.view = view;
    }

    public void addClient(String name, String accountNumber, double balance) {
        Client client = new Client(name, accountNumber, balance);
        model.addClient(client);
    }

    public void displayAllClients() {
        List<Client> clients = model.getClients();
        view.printAllClients(clients);
    }
}