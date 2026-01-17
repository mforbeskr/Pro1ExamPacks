package pack3LibrarySystem;

import java.time.LocalDate;

public abstract class LibraryItem
{
  private int itemId;
  private String title;
  private LocalDate dueDate;
  private Borrower loanedBy;


  public LibraryItem (int id){}
  public String getTitle (){return title;}
  public boolean isOverDue(){return false;}
  public abstract double calculateLateFee();
}
