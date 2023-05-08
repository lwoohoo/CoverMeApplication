package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


// line 82 "model.ump"
// line 161 "model.ump"
@Entity
public class Shift
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Shift Attributes
  private LocalTime startTime;
  private LocalTime endTime;
  @Id
  @GeneratedValue
  private int shiftID;

  //Shift Associations
  @ManyToOne
  private Workday workday;
  @OneToOne
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Shift(){}

  public Shift(LocalTime aStartTime, LocalTime aEndTime, Workday aWorkday, Account aAccount)
  {
    startTime = aStartTime;
    endTime = aEndTime;
    if (!setWorkday(aWorkday))
    {
      throw new RuntimeException("Unable to create Shift due to aWorkday. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (!setAccount(aAccount))
    {
      throw new RuntimeException("Unable to create Shift due to aAccount. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public boolean setShiftID(int aShiftID)
  {
    boolean wasSet = false;
    shiftID = aShiftID;
    wasSet = true;
    return wasSet;
  }

  public LocalTime getStartTime()
  {
    return startTime;
  }

  public LocalTime getEndTime()
  {
    return endTime;
  }

  public int getShiftID()
  {
    return shiftID;
  }
  /* Code from template association_GetOne */
  public Workday getWorkday()
  {
    return workday;
  }
  /* Code from template association_GetOne */
  public Account getAccount()
  {
    return account;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setWorkday(Workday aNewWorkday)
  {
    boolean wasSet = false;
    if (aNewWorkday != null)
    {
      workday = aNewWorkday;
      wasSet = true;
    }
    return wasSet;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setAccount(Account aNewAccount)
  {
    boolean wasSet = false;
    if (aNewAccount != null)
    {
      account = aNewAccount;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    workday = null;
    account = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "shiftID" + ":" + getShiftID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endTime" + "=" + (getEndTime() != null ? !getEndTime().equals(this)  ? getEndTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "workday = "+(getWorkday()!=null?Integer.toHexString(System.identityHashCode(getWorkday())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}