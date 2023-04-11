package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


import ca.cmis.covermeapplication.model.Availability;
import ca.cmis.covermeapplication.model.Availability.AvailabilityStatus;;

public interface AvailabilityRepository extends CrudRepository<Availability, Integer>{
    
    //pk
    Availability findAvailabilityByEventID(int eventID);

    //date
    List<Availability> findAvailabilityByDate(LocalDate date);

    //find by status
    List<Availability> findAvailabilityByAvailabilityStatus(AvailabilityStatus availabilityStatus);
}
