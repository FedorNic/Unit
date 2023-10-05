package Code.Seminars.Seminar_4.bank;

import java.util.List;

/**
 * Представление - отображает данные и получает входные данные от пользователя
 */
public class BankView {
    public void printClientDetales(Client client) {
        System.out.println("Client Details: ");
        System.out.println("Name: " + client.getName());
        System.out.println("Account number: " + client.getAccountNumber());
        System.out.println("Balance: $" + client.getBalance());
        System.out.println();
    }

    public void printAllClients(List<Client> clients) {
        System.out.println("All clients: ");
        for (Client client: clients) {
            printClientDetales(client);
        }
    }
}