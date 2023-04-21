package ca.cmis.covermeapplication.Repository;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.repository.AccountRepository;
import ca.cmis.covermeapplication.repository.CalendarEventRepository;
import ca.cmis.covermeapplication.repository.CalendarRepository;

@SpringBootTest
public class CalendarEventRepoTests {
    
    @Autowired
    CalendarEventRepository calendarEventRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CalendarRepository calendarRepository;

    @BeforeEach
    @AfterEach
    public void clear() {
        calendarEventRepository.deleteAll();
        calendarRepository.deleteAll();
        accountRepository.deleteAll();
    }
        
    @Test
    public void testFindCalendarEventByEventID() {
        LocalDate date = LocalDate.of(2023, 7, 20);
        LocalTime startTime = LocalTime.of(20, 45);
        LocalTime endTime = LocalTime.of(21, 30);
        String description = "Party";

        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

    }
}
