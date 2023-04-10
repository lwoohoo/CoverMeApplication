package ca.cmis.covermeapplication.model;

import java.time.LocalDate;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

// line 84 "model.ump"
public class WorkDay
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WorkDay Attributes
  private LocalDate date;

  //WorkDay Associations
  private List<WorkWeek> workWeeks;
  private List<Shift> shifts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WorkDay(LocalDate aDate)
  {
    date = aDate;
    workWeeks = new ArrayList<WorkWeek>();
    shifts = new ArrayList<Shift>();
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

  public LocalDate getDate()
  {
    return date;
  }
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
  public Shift getShift(int index)
  {
    Shift aShift = shifts.get(index);
    return aShift;
  }

  public List<Shift> getShifts()
  {
    List<Shift> newShifts = Collections.unmodifiableList(shifts);
    return newShifts;
  }

  public int numberOfShifts()
  {
    int number = shifts.size();
    return number;
  }

  public boolean hasShifts()
  {
    boolean has = shifts.size() > 0;
    return has;
  }

  public int indexOfShift(Shift aShift)
  {
    int index = shifts.indexOf(aShift);
    return index;
  }
  /* Code from template association_IsNumberOfValidMethod */
  public boolean isNumberOfWorkWeeksValid()
  {
    boolean isValid = numberOfWorkWeeks() >= minimumNumberOfWorkWeeks() && numberOfWorkWeeks() <= maximumNumberOfWorkWeeks();
    return isValid;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfWorkWeeks()
  {
    return 7;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWorkWeeks()
  {
    return 7;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfWorkWeeks()
  {
    return 7;
  }
  /* Code from template association_AddMNToOnlyOne */
  public WorkWeek addWorkWeek(LocalDate aStartDate)
  {
    if (numberOfWorkWeeks() >= maximumNumberOfWorkWeeks())
    {
      return null;
    }
    else
    {
      return new WorkWeek(aStartDate, this);
    }
  }

  public boolean addWorkWeek(WorkWeek aWorkWeek)
  {
    boolean wasAdded = false;
    if (workWeeks.contains(aWorkWeek)) { return false; }
    if (numberOfWorkWeeks() >= maximumNumberOfWorkWeeks())
    {
      return wasAdded;
    }

    WorkDay existingWorkDay = aWorkWeek.getWorkDay();
    boolean isNewWorkDay = existingWorkDay != null && !this.equals(existingWorkDay);

    if (isNewWorkDay && existingWorkDay.numberOfWorkWeeks() <= minimumNumberOfWorkWeeks())
    {
      return wasAdded;
    }

    if (isNewWorkDay)
    {
      aWorkWeek.setWorkDay(this);
    }
    else
    {
      workWeeks.add(aWorkWeek);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeWorkWeek(WorkWeek aWorkWeek)
  {
    boolean wasRemoved = false;
    //Unable to remove aWorkWeek, as it must always have a workDay
    if (this.equals(aWorkWeek.getWorkDay()))
    {
      return wasRemoved;
    }

    //workDay already at minimum (7)
    if (numberOfWorkWeeks() <= minimumNumberOfWorkWeeks())
    {
      return wasRemoved;
    }
    workWeeks.remove(aWorkWeek);
    wasRemoved = true;
    return wasRemoved;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfShifts()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addShift(Shift aShift)
  {
    boolean wasAdded = false;
    if (shifts.contains(aShift)) { return false; }
    shifts.add(aShift);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeShift(Shift aShift)
  {
    boolean wasRemoved = false;
    if (shifts.contains(aShift))
    {
      shifts.remove(aShift);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addShiftAt(Shift aShift, int index)
  {  
    boolean wasAdded = false;
    if(addShift(aShift))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfShifts()) { index = numberOfShifts() - 1; }
      shifts.remove(aShift);
      shifts.add(index, aShift);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveShiftAt(Shift aShift, int index)
  {
    boolean wasAdded = false;
    if(shifts.contains(aShift))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfShifts()) { index = numberOfShifts() - 1; }
      shifts.remove(aShift);
      shifts.add(index, aShift);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addShiftAt(aShift, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=workWeeks.size(); i > 0; i--)
    {
      WorkWeek aWorkWeek = workWeeks.get(i - 1);
      aWorkWeek.delete();
    }
    shifts.clear();
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}