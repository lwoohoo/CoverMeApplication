package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.CalendarEvent;

public interface CalendarEventRepository extends CrudRepository<CalendarEvent, Integer>{
    
    //pk
    CalendarEvent findCalendarEventByEventID(int eventID);

    //date
    List<CalendarEvent> findCalendarEventByDate(LocalDate date);
}
