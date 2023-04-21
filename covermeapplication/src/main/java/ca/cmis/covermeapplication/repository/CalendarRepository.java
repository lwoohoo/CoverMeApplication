package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Calendar;
import ca.cmis.covermeapplication.model.Team;

public interface CalendarRepository extends CrudRepository<Calendar, Integer>{
    
    //pk
    Calendar findCalendarByCalendarID(int calendarID);

    //associated queries

    Calendar findCalendarByAccount(Account account);

    Calendar findCalendarByTeam(Team team);
    
}
