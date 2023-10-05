package Seminar_4.bank;

import Code.Seminars.Seminar_4.bank.BankModel;
import Code.Seminars.Seminar_4.bank.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BankModelTest {

    private BankModel bankModel;

    @BeforeEach
    void setUp() {
        bankModel = new BankModel();
    }

//     Тест без mock заглушек

//    @Test
//    void addClient() {
//        Client client = new Client("John", "J12345", 500.0);
//
//        bankModel.addClient(client);
//
//        List<Client> clients = bankModel.getClients();
//        assertThat(clients).contains(client);
//    }

    /**
     * https://habr.com/ru/articles/444982/
     * Статья про Mockito
     */


        @Test
    void addClient() {
        // Создаем mock объекта BankModel, чтобы проверить его метод addClient
        // используется для создания SPY объекта на основе реального объекта bankModel
            // SPY объект позволяет нам сохранять реальную реализацию объекта, но при этом мы можем перехватывать вызовы
            // его методов и наблюдать за этим
        BankModel mockedBankModel = Mockito.spy(bankModel);

        // Упрощенная версия строки 42
        // Экземпляр bankModel1 копируем в созданный SPY объект
//        BankModel bankModel1 = new BankModel();
//        BankModel mockedBankModel1 = Mockito.spy(bankModel1);

        // Создаем mock клиента, которого мы хотим добавить в модель
        Client client = new Client("John", "J12345", 500.0);

        // Задаем ожидание: при вызове addClient с объектом client, он должен быть добавлен в список
        // Используется для настройки объекта mockedBankModel.
        // Настройка - чтобы метод был вызван с РЕАЛЬНОЙ реализацией (не так как mock)
        // doCallRealMethod() - метод, который показывает, что нужно вызывать реальный метод mockedBankModel класса BankModel
        // когда (when) мы вызываем addClient на mockedBankModel Mockito не будет заменять его заглушкой,
        // а воспользуется реальным методом, который есть в классе BankModel
            // Мы говорим Mockito, что когда вызываем метод addClient нав объекте mockedBankModel,
            // он должен использовать его реальную реализацию (ту что в классе BankModel).
            // Это нужно если нам нужно протестировать реальную работу метода, но при этом сохранить
            // возможность использования маркированных объектов для других частей теста
        doCallRealMethod().when(mockedBankModel).addClient(client);

        // Вызываем метод addClient
        mockedBankModel.addClient(client);

        // Проверяем, что клиент был успешно добавлен в модель
        List<Client> clients = mockedBankModel.getClients();
        assertThat(clients).contains(client);

        // Проверяем, что метод addClient был вызван один раз с объектом client
        verify(mockedBankModel, times(1)).addClient(client);

        // Проверяем, что метод getClients был вызван два раза
        verify(mockedBankModel, times(2)).getClients();
    }
}