package com.cmucs426.model.test;

import com.cmucs426.model.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testUserConstructor() {
        User user = new User("user1", "user1@cmucs246.com");
        assertEquals("user1@cmucs246.com", user.getEmail());
    }

    @Test
    public void testSetEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.setEmail("newemail@cmucs246.com");
        assertEquals("newemail@cmucs246.com", user.getEmail());
    }

    @Test
    public void testUpdateEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.updateEmail("updatedemail@cmucs246.com");
        assertEquals("updatedemail@cmucs246.com", user.getEmail());
    }
}
