package ca.cmis.covermeapplication.model;

import java.time.LocalDate;
import java.time.LocalTime;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 60 "model.ump"
// line 147 "model.ump"
public class Availability extends Event
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum AvailabilityStatus { AVAILABLE, NOT_SPECIFIED, UNAVAILABLE }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Availability Attributes
  private AvailabilityStatus availabilityStatus;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Availability(LocalDate aDate, LocalTime aStartTime, LocalTime aEndTime, AvailabilityStatus aAvailabilityStatus)
  {
    super(aDate, aStartTime, aEndTime);
    availabilityStatus = aAvailabilityStatus;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAvailabilityStatus(AvailabilityStatus aAvailabilityStatus)
  {
    boolean wasSet = false;
    availabilityStatus = aAvailabilityStatus;
    wasSet = true;
    return wasSet;
  }

  public AvailabilityStatus getAvailabilityStatus()
  {
    return availabilityStatus;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "availabilityStatus" + "=" + (getAvailabilityStatus() != null ? !getAvailabilityStatus().equals(this)  ? getAvailabilityStatus().toString().replaceAll("  ","    ") : "this" : "null");
  }
}