package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketWithTextInMiddle(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void nestedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void deepNestedBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[] ]]]]]"));
    }
    @Test
    public void justTextNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Here the code"));
    }
    @Test
    public void bracketParenthesisBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[()"));
    }
    @Test
    public void leftBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void wrongOrderBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void missMatchBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch []"));
    }
    @Test
    public void onlyLeftBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void reverceBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void openBracketFollowedByTextNoClose(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    }



