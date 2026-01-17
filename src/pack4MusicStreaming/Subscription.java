package pack4MusicStreaming;

import java.time.LocalDate;

public abstract class Subscription
{
  private LocalDate startDate;
  private LocalDate endDate;

  public Subscription(LocalDate startDate, LocalDate endDate)
  {

  }

  public abstract boolean hasAds();
  public abstract double getMonthlyFee();

}
