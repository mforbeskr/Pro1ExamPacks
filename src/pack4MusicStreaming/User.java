package pack4MusicStreaming;

import java.util.ArrayList;
import java.util.List;

public class User
{
  private String email;
  private final List<Playlist> playlists = new ArrayList<>();

  public User(String email){
    this.email = email;
  }

}
