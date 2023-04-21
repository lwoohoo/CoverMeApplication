package ca.cmis.covermeapplication.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Availability;
import ca.cmis.covermeapplication.model.Calendar;
import ca.cmis.covermeapplication.model.Availability.AvailabilityStatus;
import ca.cmis.covermeapplication.repository.AccountRepository;
import ca.cmis.covermeapplication.repository.AvailabilityRepository;
import ca.cmis.covermeapplication.repository.CalendarRepository;

@SpringBootTest
public class AvailabilityRepositoryTests {

    @Autowired
    private AvailabilityRepository availabilityRepository;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CalendarRepository calendarRepository;

    @BeforeEach
    @AfterEach
    public void clear() {
        availabilityRepository.deleteAll();
        calendarRepository.deleteAll();
        accountRepository.deleteAll();
    }

    @Test
    public void testFindAvailabilityByEventID() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

        account = accountRepository.save(account);

        //create calendar
        Calendar calendar = new Calendar();

        calendar = calendarRepository.save(calendar);

        //create availability event
        LocalDate date = LocalDate.of(2023, 7, 20);
        LocalTime startTime = LocalTime.of(13, 0, 0);
        LocalTime endTime = LocalTime.of(17, 0, 0);

        Availability availability = new Availability(date, startTime, endTime, account, calendar, AvailabilityStatus.AVAILABLE);
    
        availability = availabilityRepository.save(availability);

        availability = availabilityRepository.findAvailabilityByEventID(availability.getEventID());

        assertNotNull(availability);
        assertEquals(AvailabilityStatus.AVAILABLE, availability.getAvailabilityStatus());
    }

    @Test
    public void testFindAvailabilityByDate() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

        account = accountRepository.save(account);

        //create calendar
        Calendar calendar = new Calendar();

        calendar = calendarRepository.save(calendar);

        //create availability event
        LocalDate date = LocalDate.of(2023, 7, 20);
        LocalTime startTime = LocalTime.of(13, 0, 0);
        LocalTime endTime = LocalTime.of(17, 0, 0);

        Availability availability = new Availability(date, startTime, endTime, account, calendar, AvailabilityStatus.AVAILABLE);
    
        availability = availabilityRepository.save(availability);
        
        List<Availability> availabilities = availabilityRepository.findAvailabilityByDate(date);

        assertEquals(availabilities.size(), 1);
        assertNotNull(availabilities.get(0));
        assertEquals(availabilities.get(0).getDate(), date);
    }

    @Test
    public void testFindAvailabilityByAvailabilityStatus() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

        account = accountRepository.save(account);

        //create calendar
        Calendar calendar = new Calendar();

        calendar = calendarRepository.save(calendar);

        //create availability event
        LocalDate date = LocalDate.of(2023, 7, 20);
        LocalTime startTime = LocalTime.of(13, 0, 0);
        LocalTime endTime = LocalTime.of(17, 0, 0);

        Availability availability = new Availability(date, startTime, endTime, account, calendar, AvailabilityStatus.AVAILABLE);
    
        availability = availabilityRepository.save(availability);

        List<Availability> availabilities = availabilityRepository.findAvailabilityByDate(date);

        assertEquals(availabilities.size(), 1);
        assertNotNull(availabilities.get(0));
        assertEquals(availabilities.get(0).getAvailabilityStatus(), Availability.AvailabilityStatus.AVAILABLE);
    }


}
