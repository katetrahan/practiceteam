package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    @Test
    public void  member_MemberInstantiatesCorrectly_true() throws Exception {
        Member member = new Member("Oprah", "Winfrey", "Public Figure");
        assertEquals(true, member instanceof Member);
    }




}