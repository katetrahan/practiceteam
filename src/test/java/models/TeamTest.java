package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeamTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Team.clearAll();
    }

    @Test
    public void team_teamInstantiatesCorrectly_String() throws Exception {
        ArrayList<String> member= new ArrayList();
        Team team = new Team("Hackers", "Java Course Team", "");
        assertEquals(true, team instanceof Team);
    }

    @Test
    public void team_teamInstantiatesCorrectlyWithContent_String() throws Exception {
        ArrayList<String> member= new ArrayList();
        Team team = new Team("Hackers", "Java Course Team", "");
        assertEquals("Hackers",team.getName());

    }

    @Test
    public void teamDescription_teamGetsDescription_String() throws Exception {
        ArrayList<String> member= new ArrayList();
        Team team = new Team("Hackers", "Java Course Team", "");
        assertEquals("Java Course Team", team.getDescription());
    }

    @Test
    public void AllEntriesAreCorrectlyReturned_true() throws Exception {
        Team post = setupNewTeam();
        ArrayList<String> member= new ArrayList();
        Team team = new Team("Hackers", "Java Course Team", "");
        assertTrue(Team.getAll().contains(post));
        assertEquals(2, Team.getAll().size());
    }

    @Test
    public void AllEntriesContainsAllEntries_true() throws Exception {
        Team post = setupNewTeam();
        ArrayList<String> member= new ArrayList();
        Team team = new Team("Hackers", "Java Course Team", "");
        assertTrue(Team.getAll().contains(post));
        assertTrue(Team.getAll().contains(team));
    }

    @Test
    public void entriesInstantiateWithId_Integer() throws Exception {
        Team post = setupNewTeam();
        assertEquals(1, post.getMemberId());
    }

    @Test
    public void findReturnsCorrectEntry_Integer() throws Exception {
        Team post = setupNewTeam();
        assertEquals(1, Team.findById(post.getMemberId()).getMemberId());

    }

    @Test
    public void findReturnsCorrectEntryWhenMoreThanOnePostExists_Integer() throws Exception {
        Team post = setupNewTeam();
        ArrayList<String> member= new ArrayList();
        Team team = new Team("Hackers", "Java Course Team", "");
        assertEquals(2, Team.findById(team.getMemberId()).getMemberId());
    }

    @Test
    public void updateChangesEntryContent_String() throws Exception {
        Team post = setupNewTeam();
        String formerName = post.getName();
        int formerId = post.getMemberId();


        post.edit("New Hackers", "Best Team ever ","");

        assertEquals(formerId, post.getMemberId());
        assertNotEquals(formerName, post.getName());
    }


    @Test
    public void removeCommasfromArray_String() throws Exception {
        Team post = setupNewTeam();
        ArrayList<String> member= new ArrayList();
        Team.clearAll();
        Team.clearAllM();
        Team team = new Team("Hackers", "Java Course Team", "1");
        Team team2 = new Team("Hackers", "Java Course Team", "2");
        Team team3 = new Team("Hackers", "Java Course Team", "3");
        assertEquals("[1, 2, 3]", team.getMember());

    }





    public Team setupNewTeam(){
        ArrayList<String> member= new ArrayList();
        return new Team("Hackers", "Java Course Team", "");
    }




}