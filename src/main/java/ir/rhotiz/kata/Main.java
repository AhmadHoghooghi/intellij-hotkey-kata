package ir.rhotiz.kata;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static DollyClass dolly;
    public static boolean condition;
    public static void main(String[] args) {
        //use f2 to jump to next problem
        //	use alt + enter to fix everything like change variable type, then use it again for diamond syntax
        // List<String> keyToValue = new HashMap<String, String>();

        List<String> strings = Collections.singletonList("a");
        //use alt+enter for replace for with for each
        for(String string: strings){
            System.out.println("string = " + string);
        }

        //in next step we will come back to this class with ctrl+e (recent files)
        //focus on project tab with alt+1
        //then go back to editor with Esc

        //go back to project tab again
        //create a new class named MyClass(alt+insert)
        //>>>>> go and come back
        //remove MyClass


        //go to declaration of variable with ctrl+B
        //then go to declaration of class with ctrl+B
        //then come back with find usage (alt+shift+7)
        //exit find with ESC
        dolly = new DollyClass();

        //run this method with double ctrl (run anything)

        // uncomment this line and then comment it again with ctrl+/

/*
        uncomment this line and then
        comment it again wtih ctrl+shift+/
        (use ctrl+w for selection)
*/

        // declare myInt as int variable and complete current statement (insertion of ; with ctrl+shift+enter)


        //test complete current statement on for (use string and strings) write for and hit the keys
        // then write String string: strings and hit the key
        //then write if and hit the keys
        //then write `condition==true` and hit the keys
        //then soutv string
        for (String string : strings) {
            if (condition = true) {
                System.out.println("string = " + string);
            }
        }
        //use alt+ctrl+l to reformat code

        //then use ctrl+shift+alt+l to reformat file with some options (like select scope)





    }
}
