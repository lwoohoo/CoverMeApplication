package ca.cmis.covermeapplication.model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 49 "model.ump"
// line 138 "model.ump"
public class Group
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Group Attributes
  private int groupID;

  //Group Associations
  private List<Workweek> workweeks;
  private List<Account> accounts;
  private Calendar calendar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Group(int aGroupID, Calendar aCalendar)
  {
    groupID = aGroupID;
    workweeks = new ArrayList<Workweek>();
    accounts = new ArrayList<Account>();
    if (!setCalendar(aCalendar))
    {
      throw new RuntimeException("Unable to create Group due to aCalendar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGroupID(int aGroupID)
  {
    boolean wasSet = false;
    groupID = aGroupID;
    wasSet = true;
    return wasSet;
  }

  public int getGroupID()
  {
    return groupID;
  }
  /* Code from template association_GetMany */
  public Workweek getWorkweek(int index)
  {
    Workweek aWorkweek = workweeks.get(index);
    return aWorkweek;
  }

  public List<Workweek> getWorkweeks()
  {
    List<Workweek> newWorkweeks = Collections.unmodifiableList(workweeks);
    return newWorkweeks;
  }

  public int numberOfWorkweeks()
  {
    int number = workweeks.size();
    return number;
  }

  public boolean hasWorkweeks()
  {
    boolean has = workweeks.size() > 0;
    return has;
  }

  public int indexOfWorkweek(Workweek aWorkweek)
  {
    int index = workweeks.indexOf(aWorkweek);
    return index;
  }
  /* Code from template association_GetMany */
  public Account getAccount(int index)
  {
    Account aAccount = accounts.get(index);
    return aAccount;
  }

  public List<Account> getAccounts()
  {
    List<Account> newAccounts = Collections.unmodifiableList(accounts);
    return newAccounts;
  }

  public int numberOfAccounts()
  {
    int number = accounts.size();
    return number;
  }

  public boolean hasAccounts()
  {
    boolean has = accounts.size() > 0;
    return has;
  }

  public int indexOfAccount(Account aAccount)
  {
    int index = accounts.indexOf(aAccount);
    return index;
  }
  /* Code from template association_GetOne */
  public Calendar getCalendar()
  {
    return calendar;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWorkweeks()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addWorkweek(Workweek aWorkweek)
  {
    boolean wasAdded = false;
    if (workweeks.contains(aWorkweek)) { return false; }
    workweeks.add(aWorkweek);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWorkweek(Workweek aWorkweek)
  {
    boolean wasRemoved = false;
    if (workweeks.contains(aWorkweek))
    {
      workweeks.remove(aWorkweek);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWorkweekAt(Workweek aWorkweek, int index)
  {  
    boolean wasAdded = false;
    if(addWorkweek(aWorkweek))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWorkweeks()) { index = numberOfWorkweeks() - 1; }
      workweeks.remove(aWorkweek);
      workweeks.add(index, aWorkweek);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWorkweekAt(Workweek aWorkweek, int index)
  {
    boolean wasAdded = false;
    if(workweeks.contains(aWorkweek))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWorkweeks()) { index = numberOfWorkweeks() - 1; }
      workweeks.remove(aWorkweek);
      workweeks.add(index, aWorkweek);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWorkweekAt(aWorkweek, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAccounts()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addAccount(Account aAccount)
  {
    boolean wasAdded = false;
    if (accounts.contains(aAccount)) { return false; }
    accounts.add(aAccount);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeAccount(Account aAccount)
  {
    boolean wasRemoved = false;
    if (accounts.contains(aAccount))
    {
      accounts.remove(aAccount);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAccountAt(Account aAccount, int index)
  {  
    boolean wasAdded = false;
    if(addAccount(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAccountAt(Account aAccount, int index)
  {
    boolean wasAdded = false;
    if(accounts.contains(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAccountAt(aAccount, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setCalendar(Calendar aNewCalendar)
  {
    boolean wasSet = false;
    if (aNewCalendar != null)
    {
      calendar = aNewCalendar;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    workweeks.clear();
    accounts.clear();
    calendar = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "groupID" + ":" + getGroupID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "calendar = "+(getCalendar()!=null?Integer.toHexString(System.identityHashCode(getCalendar())):"null");
  }
}