package ca.cmis.covermeapplication.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 33 "model.ump"
// line 128 "model.ump"
@Entity
public abstract class Event
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Event Attributes
  private LocalDate date;
  private LocalTime startTime;
  private LocalTime endTime;
  @Id
  @GeneratedValue
  private int eventID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Event(LocalDate aDate, LocalTime aStartTime, LocalTime aEndTime, int aEventID)
  {
    date = aDate;
    startTime = aStartTime;
    endTime = aEndTime;
    eventID = aEventID;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(LocalDate aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setStartTime(LocalTime aStartTime)
  {
    boolean wasSet = false;
    startTime = aStartTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setEndTime(LocalTime aEndTime)
  {
    boolean wasSet = false;
    endTime = aEndTime;
    wasSet = true;
    return wasSet;
  }

  public boolean setEventID(int aEventID)
  {
    boolean wasSet = false;
    eventID = aEventID;
    wasSet = true;
    return wasSet;
  }

  public LocalDate getDate()
  {
    return date;
  }

  public LocalTime getStartTime()
  {
    return startTime;
  }

  public LocalTime getEndTime()
  {
    return endTime;
  }

  public int getEventID()
  {
    return eventID;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "eventID" + ":" + getEventID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endTime" + "=" + (getEndTime() != null ? !getEndTime().equals(this)  ? getEndTime().toString().replaceAll("  ","    ") : "this" : "null");
  }
}