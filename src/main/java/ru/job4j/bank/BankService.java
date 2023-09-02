package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Работает со счетами, пользователями и переводами
 *
 * @author Павел
 * @version 1.0
 */

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавить пользователя
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }
    }

    /**
     * Удалить пользователя
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Добавить счёт
     *
     * @param passport паспорт
     * @param account  счёт
     */
    public void addAccount(String passport, Account account) {
        List<Account> accounts = getAccounts(new User(passport, ""));
        if (accounts != null) {
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Поиск оп паспорту
     *
     * @param passport номер паспорта
     * @return объект паспорт
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> passport.equals(user.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск
     *
     * @param passport  паспорт
     * @param requisite реквизиты
     * @return Счёт
     */
    public Account findByRequisite(String passport, String requisite) {
        List<Account> accounts = getAccounts(new User(passport, ""));
        if (accounts == null) {
            return null;
        }
        return accounts.stream()
                .filter(account -> requisite.equals(account.getRequisite()))
                .findFirst()
                .orElse(null);
    }

    /**
     * Перевод денег
     *
     * @param srcPassport   паспорт источник
     * @param srcRequisite  реквизиты источник
     * @param destPassport  паспорт приёмник
     * @param destRequisite реквизиты приёмник
     * @param amount        количество
     * @return {@code true} если перевод успешен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }

    /**
     * получить список счетов
     *
     * @param user пользователь
     * @return список счетов
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
