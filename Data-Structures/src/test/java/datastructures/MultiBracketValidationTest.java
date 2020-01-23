package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test
    public void testArgument1(){
        assertTrue(MultiBracketValidation.bracketValidation("{}"));
//        System.out.println(MultiBracketValidation.bracketValidation("{{}}{}"));
    }
    @Test
    public void testArgument2(){
        assertTrue(MultiBracketValidation.bracketValidation("{}(){}"));


    }@Test
    public void testArgument3(){
        assertTrue(MultiBracketValidation.bracketValidation("()[[Extra Characters]]"));

    }@Test
    public void testArgument4(){
        assertTrue(MultiBracketValidation.bracketValidation("(){}[[]]"));

    }
    @Test
    public void testArgument5(){
        assertTrue(MultiBracketValidation.bracketValidation("{}{Code}[Fellows](())"));

    }
    @Test
    public void testArgument6(){
        assertFalse(MultiBracketValidation.bracketValidation("[({}]"));

    }
    @Test
    public void testArgument7(){
        assertFalse(MultiBracketValidation.bracketValidation("(]("));

    }
    @Test
    public void testArgument8(){
        assertFalse(MultiBracketValidation.bracketValidation("{(})}"));

    }
    @Test
    public void testArgument9(){
        assertFalse(MultiBracketValidation.bracketValidation("}((((((())))){(})"));

    }@Test
    public void testArgument10(){
        assertFalse(MultiBracketValidation.bracketValidation("[(([{{[{(})]}"));

    }@Test
    public void testArgument11(){
        assertFalse(MultiBracketValidation.bracketValidation("{"));

    }
    @Test
    public void testArgument12(){
        assertFalse(MultiBracketValidation.bracketValidation(")"));

    }@Test
    public void testArgument13(){
        assertFalse(MultiBracketValidation.bracketValidation("[}"));

    }@Test
    public void testArgument14(){
        assertFalse(MultiBracketValidation.bracketValidation("}{"));

    }
}