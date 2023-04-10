package ca.cmis.covermeapplication.model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 47 "model.ump"
// line 136 "model.ump"
public class Group
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Group Associations
  private List<WorkWeek> workWeeks;
  private List<Account> accounts;
  private Calendar calendar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Group(Calendar aCalendar)
  {
    workWeeks = new ArrayList<WorkWeek>();
    accounts = new ArrayList<Account>();
    if (!setCalendar(aCalendar))
    {
      throw new RuntimeException("Unable to create Group due to aCalendar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public WorkWeek getWorkWeek(int index)
  {
    WorkWeek aWorkWeek = workWeeks.get(index);
    return aWorkWeek;
  }

  public List<WorkWeek> getWorkWeeks()
  {
    List<WorkWeek> newWorkWeeks = Collections.unmodifiableList(workWeeks);
    return newWorkWeeks;
  }

  public int numberOfWorkWeeks()
  {
    int number = workWeeks.size();
    return number;
  }

  public boolean hasWorkWeeks()
  {
    boolean has = workWeeks.size() > 0;
    return has;
  }

  public int indexOfWorkWeek(WorkWeek aWorkWeek)
  {
    int index = workWeeks.indexOf(aWorkWeek);
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
  public static int minimumNumberOfWorkWeeks()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addWorkWeek(WorkWeek aWorkWeek)
  {
    boolean wasAdded = false;
    if (workWeeks.contains(aWorkWeek)) { return false; }
    workWeeks.add(aWorkWeek);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWorkWeek(WorkWeek aWorkWeek)
  {
    boolean wasRemoved = false;
    if (workWeeks.contains(aWorkWeek))
    {
      workWeeks.remove(aWorkWeek);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addWorkWeekAt(WorkWeek aWorkWeek, int index)
  {  
    boolean wasAdded = false;
    if(addWorkWeek(aWorkWeek))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWorkWeeks()) { index = numberOfWorkWeeks() - 1; }
      workWeeks.remove(aWorkWeek);
      workWeeks.add(index, aWorkWeek);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveWorkWeekAt(WorkWeek aWorkWeek, int index)
  {
    boolean wasAdded = false;
    if(workWeeks.contains(aWorkWeek))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfWorkWeeks()) { index = numberOfWorkWeeks() - 1; }
      workWeeks.remove(aWorkWeek);
      workWeeks.add(index, aWorkWeek);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addWorkWeekAt(aWorkWeek, index);
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
    workWeeks.clear();
    accounts.clear();
    calendar = null;
  }

}