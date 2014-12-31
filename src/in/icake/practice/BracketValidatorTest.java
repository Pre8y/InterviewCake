
package in.icake.practice;

import junit.framework.TestCase;

import org.junit.Test;

public class BracketValidatorTest extends TestCase {
    private String value1;
    private String value2;
    private String value3;

    public BracketValidatorTest(String testName)
    {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        // TODO Auto-generated method stub
        super.setUp();
        value1 = "{ [ ] ( ) }";
        value2 = "{ [ ( ] ) }";
        // value3 = "{ [ }";
        value3 = "{ [ ( ] ) }";
    }

    @Override
    protected void tearDown() throws Exception {
        // TODO Auto-generated method stub
        super.tearDown();
        value1 = null;
        value2 = null;
        value3 = null;
    }

    @Test
    public void testIsBracketsValid()
    {
        BracketValidator validator = new BracketValidator();
        assertEquals(true, validator.isBracketsValid(value1));
        assertEquals(false, validator.isBracketsValid(value2));
        assertEquals(false, validator.isBracketsValid(value3));

    }

}
