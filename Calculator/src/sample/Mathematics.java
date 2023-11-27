package sample;

/*
 Comments will only be in those places that I found difficult to understand: there are many different variables with strange names.
 In other places, everything is intuitive, so I didn't litter the code with comments.
 */

public class Mathematics {

    /**
     * This function takes a string and passes it to Math for further transformations
     * @parameter string - a mathematical expression written in a string. Which is passed to this method for counting
     * @return answer - the result of a calculated expression returned as a double variable
     */
    public static double Convert(String string){
        double answer = 0;
        answer = Math(string);
        return answer;
    }


    /**
     * This function calculates the result of a mathematical
     * expression written in a string and returns the result as a double variable
     * @parameter string - a mathematical expression written in a string. Which is passed to this method for counting
     * @return answer - the result of a calculated expression returned as a double variable
     */
    public static double Math(String string){
        double answer = 0;
        /*
        variable for storing the response. Why not the field?
        In the process of executing a recursive function,
        it will require passing responses between execution stages
        */

        int index_operation = 0; // variable for storing the index of a mathematical sign
        int index_operation_2 = 0; // variable for storing the second part of the mathematical sign: brackets
        String string1, string2, string3, string4 = ""; // strings for working with array slices

        if(string.contains("sqrt(")){
            index_operation = string.lastIndexOf("s"); // we determine the beginning of the square root entry

            string4 = string.substring(index_operation + 5); // we make a slice in which we put the entire line following "sqrt("
            string4 = Math2(string4);   // calculate the value of the expression between the square root brackets
            string1 = string.substring(0, index_operation + 5); // making a line slice, in which we put the beginning of the line before sqrt(
            string = string1 + string4; // glue the slices together and get a string where the root expression is calculated

            string4 = string.substring(index_operation);
            /*
            we make a slice in which we put the entire line following "s"
            to find the index of the bracket that defines where the root expression ends
             */
            index_operation_2 = string4.indexOf(")") + index_operation;
            /*
            we find the location of the closing parenthesis in the slice and add the index
            of the initial character to understand the location of the closing parenthesis in the entire expression
             */

            string1 = string.substring(0, index_operation); // cutting a string to the root
            string2 = string.substring(index_operation_2 + 1); // a slice of the string after the root
            string3 = string.substring(index_operation + 5, index_operation_2); // a string fragment containing the root expression
            answer = Math(string1 + Math.sqrt(Math(string3)) + string2); // we calculate the answer by calculating the root of the root expression
        }
        else if(string.contains("(")){
            index_operation = string.lastIndexOf("(");
            string4 = string.substring(index_operation);
            index_operation_2 = string4.indexOf(")") + index_operation;
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation_2 + 1);
            string3 = string.substring(index_operation + 1, index_operation_2);
            answer = Math(string1 + Math(string3) + string2);
        }
        else if(string.contains("+")){
            index_operation = string.indexOf("+");
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation + 1);
            answer = Math(string1) + Math(string2);
        }
        else if(string.contains("-")){
            index_operation = string.lastIndexOf("-");
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation + 1);
            answer = Math(string1) - Math(string2);;
        }
        else if(string.contains("•")){
            index_operation = string.indexOf("•");
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation + 1);
            answer = Math(string1) * Math(string2);;
        }
        else if(string.contains("/")){
            index_operation = string.lastIndexOf("/");
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation + 1);
            answer = Math(string1) / Math(string2);;
        }
        else{
            answer = Double.valueOf(string);
        }

        return answer;
    }

    /**
     * This function takes a string and counts the root expression.
     * It is needed for situations like this: " sqrt( 3 + ( 15 - 9 ) ) "
     * it will not work to use string.index( ")" ) in Math because there will be problems with counting
     * expressions in parentheses.
     * @parameter string - a string containing the root expression and the rest of the expression after the root
     * @return answer - a string containing the counted root expression and the expression after the root
     */
    public static String Math2(String string){
        String answer = string;
        int index_operation = 0;
        int index_operation_2 = 0;
        String string1, string2, string3, string4 = "";

        if(string.contains("(")){
            index_operation = string.lastIndexOf("(");
            string4 = string.substring(index_operation);
            index_operation_2 = string4.indexOf(")") + index_operation;
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation_2 + 1);
            string3 = string.substring(index_operation + 1, index_operation_2);
            answer = Math2(string1 + Math(string3) + string2);
        }

        return answer;
    }
}
