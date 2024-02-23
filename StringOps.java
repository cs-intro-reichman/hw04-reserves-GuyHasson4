public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        char letter;
        String rString = "";
        for (int i = 0; i < string.length() ;i++ ) {
            letter = string.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'u'|| letter == 'o'){
                letter = (char)(letter - 32);
            }
            else if (letter > 65 && letter < 91 && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U') {
                letter = (char)(letter +32);
            }
            rString += letter;
        }
        return rString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        char previous = ' ';
        char current;
        String sentence = "";

        int i = 0;
        while (i < string.length() && string.charAt(i) == ' '){
            i++;
        }
        string = string.substring(i);

        if(string.length() > 0){
            current = string.charAt(0);
            sentence += (char)(current >= 'A' && current <= 'Z' ? current + 32 : current);
        }
        for (int j = 1; j < string.length() ; j++ ) {
            previous = string.charAt(j-1);
            current = string.charAt(j);

            if (previous == ' '){
                if (current != ' '){
                    sentence += (char)(current >= 'A' && current <= 'Z' ? current : current - 32);
                }
            }else{
                        sentence += (char)(current >= 'A' && current <= 'Z' ? current + 32 : current);
                }
           previous = current;
        }
        return sentence;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int size = 0;
        for (int i = 0; i < string.length() ;i++ ) {
            
            if (string.charAt(i) == chr) {
                size++;
            }
        }

        int[] allIndex = new int[size];
        int arryLocation = 0;

        for (int j = 0; j < string.length(); j++ ) {
            if (string.charAt(j) == chr) {
                allIndex[arryLocation] = j;
                arryLocation++;            
            }
        }
        return allIndex;
    }
}
