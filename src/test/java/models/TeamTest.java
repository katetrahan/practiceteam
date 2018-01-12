package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        Team team = new Team("Hackers", "Java Course Team", newMember);
        assertEquals(true, team instanceof Team);
    }

    @Test
    public void team_teamInstantiatesCorrectlyWithContent_String() throws Exception {
        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        Team team = new Team("Hackers", "Java Course Team", newMember);
        assertEquals("Hackers",team.getName());

    }

    @Test
    public void teamDescription_teamGetsDescription_String() throws Exception {
        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        Team team = new Team("Hackers", "Java Course Team", newMember);
        assertEquals("Java Course Team", team.getDescription());
    }

    @Test
    public void AllEntriesAreCorrectlyReturned_true() throws Exception {
        Team post = setupNewTeam();
        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        Team team = new Team("Hackers", "Java Course Team", newMember);
        assertTrue(Team.getAll().contains(post));
        assertEquals(2, Team.getAll().size());
    }

    @Test
    public void AllEntriesContainsAllEntries_true() throws Exception {
        Team post = setupNewTeam();
        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        Team team = new Team("Hackers", "Java Course Team", newMember);
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
        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        Team team = new Team("Hackers", "Java Course Team", newMember);
        assertEquals(2, Team.findById(team.getMemberId()).getMemberId());
    }

    @Test
    public void updateChangesEntryContent_String() throws Exception {
        Team post = setupNewTeam();
        String formerName = post.getName();
        int formerId = post.getMemberId();

        Member newMember = new Member("Oprah", "Winfrey", "Public Figure");
        post.edit("New Hackers", "Best Team ever ", newMember);

        assertEquals(formerId, post.getMemberId());
        assertNotEquals(formerName, post.getName());
    }















    public Member setupNewMember(){
        return new Member ("Oprah", "Winfrey", "Public Figure");

    }

    public Team setupNewTeam(){

        return new Team("Hackers", "Java Course Team", setupNewMember());
    }




}