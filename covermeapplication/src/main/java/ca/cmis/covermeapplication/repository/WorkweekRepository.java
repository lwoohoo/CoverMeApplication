package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Workweek;

public interface WorkweekRepository extends CrudRepository<Workweek, Integer>{
    
    //pk
    Workweek findWorkweekByWorkweekID(int workweekID);

    //find workweek by startdate
    Workweek findWorkweekByStartDate(LocalDate startDate);
}
