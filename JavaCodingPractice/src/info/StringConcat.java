package info;

public class StringConcat {
    public static void main(String[] args) {

        String str = "This     is  a     Example   class         To Test.";
        String[] charArray = str.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (String s : charArray) {
            newStr.append(s);
        }
        System.out.println(newStr);

    }
}

class StringConcatenationAnother {
    public static void main(String[] args) {
        String str = "This     is  a     Example   class         To Test.";
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                result.append(ch);
            }
        }
        System.out.println(result);

    }
}
