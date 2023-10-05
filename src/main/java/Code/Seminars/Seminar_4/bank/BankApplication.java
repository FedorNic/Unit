package Code.Seminars.Seminar_4.bank;

public class BankApplication {
    public static void main(String[] args) {

        // Создаем модель, представление и презентер
        BankModel model = new BankModel();
        BankView view = new BankView();
        BankPresenter presenter = new BankPresenter(model, view);

        // Добавляем клиентов
        presenter.addClient("Alice", "A12345", 1000.0);
        presenter.addClient("Bob", "B67890", 2000.0);

        // Показываем информацию о клиентах
        presenter.displayAllClients();
    }
}