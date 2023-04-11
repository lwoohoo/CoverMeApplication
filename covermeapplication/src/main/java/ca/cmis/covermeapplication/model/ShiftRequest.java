package ca.cmis.covermeapplication.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 55 "model.ump"
// line 143 "model.ump"
@Entity
public class ShiftRequest extends Post
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //ShiftRequest Attributes
  private LocalDate shiftDate;
  private LocalTime startTime;
  private LocalTime endTime;

  //ShiftRequest Associations
  @OneToOne
  private Role role;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public ShiftRequest(LocalDateTime aDate, int aPostID, LocalDate aShiftDate, LocalTime aStartTime, LocalTime aEndTime, Role aRole)
  {
    super(aDate, aPostID);
    shiftDate = aShiftDate;
    startTime = aStartTime;
    endTime = aEndTime;
    if (!setRole(aRole))
    {
      throw new RuntimeException("Unable to create ShiftRequest due to aRole. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setShiftDate(LocalDate aShiftDate)
  {
    boolean wasSet = false;
    shiftDate = aShiftDate;
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

  public LocalDate getShiftDate()
  {
    return shiftDate;
  }

  public LocalTime getStartTime()
  {
    return startTime;
  }

  public LocalTime getEndTime()
  {
    return endTime;
  }
  /* Code from template association_GetOne */
  public Role getRole()
  {
    return role;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setRole(Role aNewRole)
  {
    boolean wasSet = false;
    if (aNewRole != null)
    {
      role = aNewRole;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    role = null;
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "shiftDate" + "=" + (getShiftDate() != null ? !getShiftDate().equals(this)  ? getShiftDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endTime" + "=" + (getEndTime() != null ? !getEndTime().equals(this)  ? getEndTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "role = "+(getRole()!=null?Integer.toHexString(System.identityHashCode(getRole())):"null");
  }
}