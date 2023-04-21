package ca.cmis.covermeapplication.Repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Calendar;
import ca.cmis.covermeapplication.repository.CalendarRepository;

@SpringBootTest
public class CalendarRepoTests {
    
    @Autowired
    CalendarRepository calendarRepository;

    @BeforeEach
    @AfterEach
    public void clear() {
        calendarRepository.deleteAll();
    }

    @Test
    public void testFindCalendarByCalendarID() {
        Calendar calendar = new Calendar();

        calendar = calendarRepository.save(calendar);

        calendar = calendarRepository.findCalendarByCalendarID(calendar.getCalendarID());

        assertNotNull(calendar);
    }
}
