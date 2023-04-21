package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Workday;

public interface WorkdayRepository extends CrudRepository<Workday, Integer>{
    
    //pk
    Workday findWorkdayByWorkdayID(int workdayID);

    //find by date
    Workday findWorkdayByDate(LocalDate date);

    // //find by workweek
    // List<Workday> findWorkdayByWorkweek(Workweek workweek);
}
