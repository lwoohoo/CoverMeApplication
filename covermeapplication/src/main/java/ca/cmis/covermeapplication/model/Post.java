package ca.cmis.covermeapplication.model;

import java.time.LocalDateTime;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 19 "model.ump"
// line 112 "model.ump"
public class Post
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Post Attributes
  private LocalDateTime date;
  private String description;
  private String media;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Post(LocalDateTime aDate, String aDescription, String aMedia)
  {
    date = aDate;
    description = aDescription;
    media = aMedia;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(LocalDateTime aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setDescription(String aDescription)
  {
    boolean wasSet = false;
    description = aDescription;
    wasSet = true;
    return wasSet;
  }

  public boolean setMedia(String aMedia)
  {
    boolean wasSet = false;
    media = aMedia;
    wasSet = true;
    return wasSet;
  }

  public LocalDateTime getDate()
  {
    return date;
  }

  public String getDescription()
  {
    return description;
  }

  public String getMedia()
  {
    return media;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "description" + ":" + getDescription()+ "," +
            "media" + ":" + getMedia()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}