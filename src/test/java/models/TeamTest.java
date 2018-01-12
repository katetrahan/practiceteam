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




}