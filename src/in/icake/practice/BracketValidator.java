
package in.icake.practice;

import java.util.ArrayList;

/*
 * Preeti Patwa
 * December 31st, 2014
 * bracket validator Implementation.
 */
public class BracketValidator {

    /*
     * bracket validator Implementation.
     * @param string to be verified
     * @return true if valid false otherwise
     */
    public boolean isBracketsValid(String input)
    {
        boolean result = false;
        Stack<Character> stack = new Stack<Character>();
        for (int index = 0; index < input.length(); index++)
        {
            char currentChar = input.charAt(index);
            if (isOpener(currentChar))
                stack.push(currentChar);
            else if (isCloser(currentChar))
            {
                if (isMatchingBracket(stack.peek(), currentChar))
                    stack.pop();
                else
                    result = false;
            }
        }
        if (stack.isEmpty())
            result = true;

        return result;
    }

    private boolean isMatchingBracket(char peek, char currentChar) {
        if (peek == '(' && currentChar == ')')
            return true;
        if (peek == '{' && currentChar == '}')
            return true;

        if (peek == '[' && currentChar == ']')
            return true;
        return false;
    }

    private boolean isCloser(char charAt) {
        // TODO Auto-generated method stub
        if (charAt == ')' || charAt == '}' || charAt == ']')
            return true;
        return false;
    }

    private boolean isOpener(char charAt) {
        // TODO Auto-generated method stub
        if (charAt == '(' || charAt == '{' || charAt == '[')
            return true;
        return false;
    }

}
