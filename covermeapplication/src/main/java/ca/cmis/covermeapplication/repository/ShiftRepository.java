package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Shift;
import ca.cmis.covermeapplication.model.Workday;

public interface ShiftRepository extends CrudRepository<Shift, Integer>{
    
    //pk
    Shift findShiftByShiftID(int shiftID);

    // //find shift by workday
    // Shift findShiftByWorkday(Workday workday);
 
}
