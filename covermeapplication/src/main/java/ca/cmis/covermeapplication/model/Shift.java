package ca.cmis.covermeapplication.model;

import java.time.LocalTime;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 77 "model.ump"
public class Shift
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Shift Attributes
  private LocalTime startTime;
  private LocalTime endTime;

  //Shift Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Shift(LocalTime aStartTime, LocalTime aEndTime, Account aAccount)
  {
    startTime = aStartTime;
    endTime = aEndTime;
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

  public LocalTime getStartTime()
  {
    return startTime;
  }

  public LocalTime getEndTime()
  {
    return endTime;
  }
  /* Code from template association_GetOne */
  public Account getAccount()
  {
    return account;
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
    account = null;
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startTime" + "=" + (getStartTime() != null ? !getStartTime().equals(this)  ? getStartTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "endTime" + "=" + (getEndTime() != null ? !getEndTime().equals(this)  ? getEndTime().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}