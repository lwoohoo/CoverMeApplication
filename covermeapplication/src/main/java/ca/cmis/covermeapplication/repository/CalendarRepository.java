package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Calendar;

public interface CalendarRepository extends CrudRepository<Calendar, Integer>{
    
    //pk
    Calendar findCalendarByCalendarID(int calendarID);
    
}
