package ca.cmis.covermeapplication.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.TimelinePost;

public interface TimelinePostRepository extends CrudRepository<TimelinePost, Integer>{
    
    //pk
    TimelinePost findTimelinePostByPostID(int postID);

    //find by date
    TimelinePost findTimelinePostByDate(LocalDate date);

    //find by account
    TimelinePost findTimelinePostByAccount(Account account);
}
