package ca.cmis.covermeapplication.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Shift;
import ca.cmis.covermeapplication.model.Team;
import ca.cmis.covermeapplication.model.Workday;
import ca.cmis.covermeapplication.model.Workweek;
import ca.cmis.covermeapplication.repository.AccountRepository;
import ca.cmis.covermeapplication.repository.ShiftRepository;
import ca.cmis.covermeapplication.repository.TeamRepository;
import ca.cmis.covermeapplication.repository.WorkdayRepository;
import ca.cmis.covermeapplication.repository.WorkweekRepository;

@SpringBootTest
public class ShiftRepoTests {
    
    @Autowired
    ShiftRepository shiftRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    WorkweekRepository workweekRepository;

    @Autowired
    WorkdayRepository workdayRepository;

    @Autowired
    AccountRepository accountRepository;

    @BeforeEach
    @AfterEach
    public void clear() {
        shiftRepository.deleteAll();
        accountRepository.deleteAll();
        workdayRepository.deleteAll();
        workweekRepository.deleteAll();
        teamRepository.deleteAll();
    }

    @Test
    public void testFindShiftByShiftID() {
        //create team
        Team team = new Team("good team");
        team = teamRepository.save(team);
        
        //create workweek
        LocalDate startDate = LocalDate.of(2023, 5, 8);
        Workweek workweek = new Workweek(startDate, team);
        workweek = workweekRepository.save(workweek);
        
        //create workday
        LocalDate date = LocalDate.of(2023, 7, 20);
        Workday workday = new Workday(date, workweek);
        workday = workdayRepository.save(workday);

        //create account
        String name = "peter";
        String email = "peter@a.ru";
        String phone = "902-456-7890";
        String username = "pete";
        String pass = "pass";
        boolean iA = true;
        Account account = new Account(name, email, phone, username, pass, iA);
        account = accountRepository.save(account);

        //create shift
        LocalTime sTime = LocalTime.of(9, 0);
        LocalTime eTime = LocalTime.of(17, 0);
        Shift shift = new Shift(sTime, eTime, workday, account);
        shift = shiftRepository.save(shift);
        int id = shift.getShiftID();

        shift = shiftRepository.findShiftByShiftID(shift.getShiftID());

        assertNotNull(shift);
        assertEquals(id, shift.getShiftID());
    }

}
