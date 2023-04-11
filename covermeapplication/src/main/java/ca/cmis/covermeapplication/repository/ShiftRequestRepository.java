package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.ShiftRequest;

public interface ShiftRequestRepository extends CrudRepository<ShiftRequest, Integer>{
    
    //pk
    ShiftRequest findShiftRequestByPostID(int postID);

    //find by date
    ShiftRequest findShiftRequestByDate(LocalDate date);

    //find by poster account
    ShiftRequest findShiftRequestByAccount(Account account);
}
