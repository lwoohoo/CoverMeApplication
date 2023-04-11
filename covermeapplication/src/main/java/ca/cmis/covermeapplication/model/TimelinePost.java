package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import java.time.LocalDateTime;

import javax.persistence.Entity;

// line 97 "model.ump"
// line 172 "model.ump"
@Entity
public class TimelinePost extends Post
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //TimelinePost Attributes
  private String description;
  private String media;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public TimelinePost(LocalDateTime aDate, int aPostID, Account aAccount, String aDescription, String aMedia)
  {
    super(aDate, aPostID, aAccount);
    description = aDescription;
    media = aMedia;
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

  public boolean setMedia(String aMedia)
  {
    boolean wasSet = false;
    media = aMedia;
    wasSet = true;
    return wasSet;
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
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "description" + ":" + getDescription()+ "," +
            "media" + ":" + getMedia()+ "]";
  }
}