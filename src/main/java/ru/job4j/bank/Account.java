package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс хранит данные по счёту
 *
 * @author Павел
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Получить реквизиты счёта
     *
     * @return строка с реквизитами
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Установить реквизиты счёта
     *
     * @param requisite реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Получить баланс счёта
     *
     * @return баланс
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Установить баланс счёта
     *
     * @param balance баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
