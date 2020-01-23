package datastructures;

public class MultiBracketValidation {
    public static boolean bracketValidation(String input){
        int len = input.length();

        if((Character.compare(input.charAt(0), '}'))==0  || (Character.compare(input.charAt(0), ']'))==0 || (Character.compare(input.charAt(0), ')'))==0){
            return false;
        }

        if((Character.compare(input.charAt(len-1), '{'))==0  || (Character.compare(input.charAt(len-1), '['))==0 || (Character.compare(input.charAt(len-1), '('))==0){
            return false;
        }
                int opBracket = 0;
                int clBracket =0;
                int opCurly =0;
                int clCurly =0;
                int opSquare = 0;
                int clSquare = 0;

            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) == '('){
                    opBracket++;
                }
                else if(input.charAt(i) == ')'){
                    clBracket++;
                }
                else if(input.charAt(i) == '{'){
                    opCurly++;
                }
                else if(input.charAt(i) == '}'){
                    clCurly++;
                }
                else if(input.charAt(i) == '['){
                    opSquare++;
                }
                else if(input.charAt(i) == ']'){
                    clSquare++;
                }

            }

        if(opBracket != clBracket){
            return false;
        }
        if(opCurly != clCurly){
            return false;
        }
        if(opSquare != clSquare){
            return false;
        }
        return true;
    }
}
