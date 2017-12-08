package ucl.cs;
import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    private final List<String> content = new ArrayList<>();

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public void add(String element) {

      content.remove(element);
      content.add(0,element);
    }

    public int size() {
        return content.size();
    }

    public String get(int i) {
        return content.get(i);
    }
}
