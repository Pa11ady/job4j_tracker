package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс хранит данные пользователя
 *
 * @author Павел
 * @version 1.0
 */

public class User {
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Получить паспорт
     *
     * @return паспорт
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Установить паспорт
     *
     * @param passport паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Получить имя пользователя
     *
     * @return имя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Установить Имя пользователя
     *
     * @param username имя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
