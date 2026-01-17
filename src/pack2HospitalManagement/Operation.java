package pack2HospitalManagement;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Operation
{
  private String type;
  private LocalTime startTime;
  private List<Doctor> doctorList = new ArrayList<>();

  public Operation(String type, LocalTime startTime, List<Doctor> doctorList)
  {
    this.type = type;
    this.startTime = startTime;
    this.doctorList.addAll(doctorList);
  }
}
