package sample;

import java.util.Objects;

public class Mathematics {

    public static double Math(String string){
        double answer = 0; // переменная для хранения ответа
        int index_operation = 0; // переменная для хранения индекса мат. знака
        int index_operation_2 = 0;
        char [] string_in_char;
        String string1, string2, string3, string4 = "";

        if(string.contains("(")){
            index_operation = string.lastIndexOf("(");
            string4 = string.substring(index_operation);
            index_operation_2 = string4.indexOf(")") + index_operation;
            string1 = string.substring(0, index_operation);
            string2 = string.substring(index_operation_2 + 1);
            string3 = string.substring(index_operation + 1, index_operation_2);
            answer = Math(string1 + Math(string3) + string2);
        }
        else if(string.contains("+")){ //проверяем, есть ли в строке знак "+"
            index_operation = string.indexOf("+"); // если есть, то находим его индекс
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

    public static double Convert(String string){
        double answer = 0;
        answer = Math(string);
        return answer;
    }
}
