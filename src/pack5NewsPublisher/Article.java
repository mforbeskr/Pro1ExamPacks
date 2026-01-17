package pack5NewsPublisher;

import java.time.LocalDateTime;

public abstract class Article
{
  private Journalist writtenBy;
  private LocalDateTime publicationDateTime;
  private int views;
  private int likes;

  public void incrementViewCount(){}
  public boolean isTrending(){return false;}
}
