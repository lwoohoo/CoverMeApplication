package ca.cmis.covermeapplication.model;

import java.time.LocalDate;
import java.time.LocalTime;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 66 "model.ump"
// line 152 "model.ump"
public class CalendarEvent extends Event
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CalendarEvent Attributes
  private String description;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CalendarEvent(LocalDate aDate, LocalTime aStartTime, LocalTime aEndTime, String aDescription)
  {
    super(aDate, aStartTime, aEndTime);
    description = aDescription;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public String getDescription()
  {
    return description;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "description" + ":" + getDescription()+ "]";
  }
}