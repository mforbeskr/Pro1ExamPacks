package pack4MusicStreaming;

import java.util.ArrayList;
import java.util.List;

public class StreamingService {

  private String serviceName;
  private final List<User> users = new ArrayList<>();
  private final List<Song> songs = new ArrayList<>();

  public StreamingService(String serviceName)
  {
    this.serviceName = serviceName;
  }

  public void addUser (User user){
    users.add(user);
  }
}
