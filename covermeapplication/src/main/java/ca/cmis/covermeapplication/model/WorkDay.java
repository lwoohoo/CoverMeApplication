package ca.cmis.covermeapplication.model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.time.LocalDate;
import java.util.*;


// line 89 "model.ump"
// line 169 "model.ump"
public class Workday
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Workday Attributes
  private LocalDate date;
  private int workdayID;

  //Workday Associations
  private List<Shift> shifts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Workday(LocalDate aDate, int aWorkdayID)
  {
    date = aDate;
    workdayID = aWorkdayID;
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

  public boolean setWorkdayID(int aWorkdayID)
  {
    boolean wasSet = false;
    workdayID = aWorkdayID;
    wasSet = true;
    return wasSet;
  }

  public LocalDate getDate()
  {
    return date;
  }

  public int getWorkdayID()
  {
    return workdayID;
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
    shifts.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "workdayID" + ":" + getWorkdayID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}