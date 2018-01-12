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
    public void entriesInstantiateWithId() throws Exception {
        Team post = setupNewTeam();
        assertEquals(1, post.getMemberId());
    }









    public Member setupNewMember(){
        return new Member ("Oprah", "Winfrey", "Public Figure");

    }

    public Team setupNewTeam(){

        return new Team("Hackers", "Java Course Team", setupNewMember());
    }




}