package pack5NewsPublisher;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher
{
  private String name;
  private String foundedYear;

  // 0..*
  private final List<Editor> editors = new ArrayList<>();
  private final List<Reader> readers = new ArrayList<>();
  private final List<Article> articles = new ArrayList<>();
  private final List<Journalist> journalists = new ArrayList<>();
}
