package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void  team_teamInstantiatesCorrectly_true() throws Exception {
        Team team = new Team("Hackers", "Epicodus Java Course Team");
        assertEquals(true, team instanceof Team);
    }

}