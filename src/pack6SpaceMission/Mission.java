package pack6SpaceMission;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Mission
{
  private String missionName;
  private LocalDate launchDate;
  protected double baseCost;
  private String status;
  private final List<CrewMember> crewMemberList = new ArrayList<>();


  public CrewMember findCaptain(){
    return null;
  }

  public double getCost(){
    return 0;
  }
}
