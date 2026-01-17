package pack4MusicStreaming;

import java.time.LocalDate;

public class FamilySubscription extends Subscription
{
  private int numberOfUsers;

  public FamilySubscription(LocalDate startDate, LocalDate endDate,
      int numberOfUsers)
  {
    super(startDate, endDate);
    this.numberOfUsers = numberOfUsers;
  }

  @Override public boolean hasAds()
  {
    return false;
  }

  @Override public double getMonthlyFee()
  {
    return 5;
  }
}
