package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {

    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        Boolean rst = office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
        assertThat(rst).isTrue();
    }

    @Test
    public void whenAddDuplicate() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen duplicate = new Citizen("2f44a", "Duplicate");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(duplicate)).isFalse();
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }
}
