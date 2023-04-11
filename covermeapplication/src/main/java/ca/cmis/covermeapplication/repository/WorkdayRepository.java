package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Workday;
import ca.cmis.covermeapplication.model.Workweek;

public interface WorkdayRepository extends CrudRepository<Workday, Integer>{
    
    //pk
    Workday findWorkdayByWorkdayID(int workdayID);

    //find by date
    Workday finWorkdayByDate(LocalDate date);

    //find by workweek
    List<Workday> findWorkdayByWorkweek(Workweek workweek);
}
