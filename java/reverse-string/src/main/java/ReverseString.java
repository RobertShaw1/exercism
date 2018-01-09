class ReverseString {

    String reverse(String inputString) {
       if (inputString == "") return "";

       StringBuilder inputStringCopy = new StringBuilder(inputString);
       return inputStringCopy.reverse().toString();
    }
  
}