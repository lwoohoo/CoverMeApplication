package ca.cmis.covermeapplication.model;

import java.time.LocalDateTime;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


// line 19 "model.ump"
// line 117 "model.ump"
public abstract class Post
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Post Attributes
  private LocalDateTime date;
  private int postID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Post(LocalDateTime aDate, int aPostID)
  {
    date = aDate;
    postID = aPostID;
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

  public boolean setPostID(int aPostID)
  {
    boolean wasSet = false;
    postID = aPostID;
    wasSet = true;
    return wasSet;
  }

  public LocalDateTime getDate()
  {
    return date;
  }

  public int getPostID()
  {
    return postID;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "postID" + ":" + getPostID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}