package sample;

public class Mathematics {

    public static double Math(String string){
        int index_1 = string.indexOf(' '); // получаем индекс первого пробела

        char[] dst = new char[index_1]; // создаем массив для элементов, находящихся до пробела
        string.getChars(0,index_1, dst, 0);
        String first_str = new String(dst); // преобразуем массив из элементов, находящихся до пробела, в строку
        double first_str_double = Double.valueOf(first_str);

        int length_string = string.length(); // найдем длину строки, чтобы обрезать данную нам в самом начале строку
        string = string.substring(index_1 + 1, length_string);

        String operation = String.valueOf(string.charAt(0));
        length_string = string.length();
        string = string.substring(2, length_string); // снова обрезаем строку, т.к. нужный символ мы получили

        index_1 = string.indexOf(' ');
        dst = new char[index_1];
        string.getChars(0,index_1, dst, 0);
        String second_str = new String(dst);
        double second_str_double = Double.valueOf(second_str);

        double answer = 0;
        if(operation.equals("+")){
            answer = first_str_double + second_str_double;
        } else if(operation.equals("-")){
            answer = first_str_double - second_str_double;
        } else if(operation.equals("•")){
            answer = first_str_double * second_str_double;
        } else if(operation.equals("/")){
            answer = first_str_double / second_str_double;
        }
        return answer;
    }
}
