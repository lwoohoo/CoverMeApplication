package ca.cmis.covermeapplication.model;

import java.time.LocalDate;
import java.time.LocalTime;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 33 "model.ump"
// line 123 "model.ump"
public abstract class Event
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Event Attributes
  private LocalDate date;
  private LocalTime startTime;
  private LocalTime endTime;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Event(LocalDate aDate, LocalTime aStartTime, LocalTime aEndTime)
  {
    date = aDate;
    startTime = aStartTime;
    endTime = aEndTime;
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

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endTime" + "=" + (getEndTime() != null ? !getEndTime().equals(this)  ? getEndTime().toString().replaceAll("  ","    ") : "this" : "null");
  }
}