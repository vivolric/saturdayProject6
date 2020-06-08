package TestPackage;

import Settings.*;

//import Settings.UserNameAndPassword;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    @Before
    public void beforeClass() {

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }


    /*
    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method
    For Example  one of the condition is if the UserNameLists has myusername , you are supposed to create your test case for this.
    You will do the same approach for each condition of the both methods.

     */

    @Test
    public void test1() {
        UserNameAndPassword userName1 = new UserNameAndPassword();
        String actual = userName1.setUsername("aaaa");

        Assert.assertEquals("Username length should be more then 6", actual);
    }

    @Test
    public void test2() {
        UserNameAndPassword userName1 = new UserNameAndPassword();
        String actual = userName1.setUsername("aaaa bbes");

        Assert.assertEquals("Username should NOT contain space", actual);
    }

    @Test
    public void test3() {
        UserNameAndPassword userName1 = new UserNameAndPassword();
        String actual = userName1.setUsername("aaaaaaa");

        Assert.assertEquals("Username should contain @ symbol", actual);
    }

    @Test
    public void test4() {
        UserNameAndPassword userName1 = new UserNameAndPassword();
        String actual = userName1.setUsername("Barbara@gmail.com");

        Assert.assertEquals("Username should be unique", actual);
    }

    @Test
    public void test5() {
        UserNameAndPassword userName1 = new UserNameAndPassword();
        String expected = "youareright@gmail.com";
        String actual = userName1.setUsername(expected);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test6() {
        UserNameAndPassword password1 = new UserNameAndPassword();
        String actual = password1.setPassword("less");

        Assert.assertEquals("Password length more then 5 character", actual);
    }


    @Test
    public void test7() {
        UserNameAndPassword password1 = new UserNameAndPassword();
        String expected = "lessdesfgt";
        String actual = password1.setPassword(expected);

        Assert.assertEquals(expected, actual);
    }

}
