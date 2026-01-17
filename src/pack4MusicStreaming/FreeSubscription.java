package pack4MusicStreaming;

import java.time.LocalDate;

public class FreeSubscription extends Subscription
{

  public FreeSubscription(LocalDate startDate, LocalDate endDate)
  {
    super(startDate, endDate);
  }


  @Override public boolean hasAds()
  {
    return true;
  }

  @Override public double getMonthlyFee()
  {
    return 0;
  }
}
