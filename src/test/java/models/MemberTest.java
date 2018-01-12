package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    @Test
    public void  member_MemberInstantiatesCorrectly_true() throws Exception {
        Member member = new Member("Oprah", "Winfrey");
        assertEquals(true, member instanceof Member);
    }

    @Test
    public void member_getFirst_String() {
        Member member = new Member("Oprah", "Winfrey");;
        assertEquals("Oprah", member.getFirst());

    }

    @Test
    public void member_getLast_String() {
        Member member = new Member("Oprah", "Winfrey");
        assertEquals("Winfrey", member.getLast());

    }













}