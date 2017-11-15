package ucl.cs;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

    RecentlyUsedList list  = new RecentlyUsedList();

  @Test
  public void isinitialisdEmpty() {
      assertTrue(list.isEmpty());
      assertThat(list.size(),is(0));
  }

  @Test
  public void allowItemsToBeAdded() {
      list.add("hello");
      assertFalse(list.isEmpty());
      assertThat(list.size(),is(1));
      list.add("goodbye");
      assertThat(list.size(),is(2));
  }

    @Test
    public void keepsTheMostRecentItmemOnTheTopOfTheList() {
        list.add("Cat");
        list.add("dog");

        assertThat(list.get(1),is("Cat"));
        assertThat(list.get(0),is("dog"));
    }

    @Test
    public void preventDuplicates() {
        list.add("Cat");
        list.add("Cat");

        assertThat(list.size(),is(1));

    }

    @Test
    public void moveThemostReventEntryToTheTopOfTheListIfDuplicatedAdded() {
        list.add("one");
        list.add("two");
        list.add("one");
        assertThat(list.size(),is(2));
        assertThat(list.get(0),is("one"));

    }

}
