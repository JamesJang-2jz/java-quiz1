public class LoopFun {
      public Integer factorial(Integer number){
          Integer result = 1;
          for (int i = 1; i <= number; i++) {
              result *= i;
          }
          return result;
      }
      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       */
      public String acronym(String phrase) {
          StringBuilder sb = new StringBuilder();
          if (phrase.length() > 0){
              sb.append(Character.toUpperCase(phrase.charAt(0)));
          }
          for (int i = 1; i < phrase.length(); i++) {
              char currentChar = phrase.charAt(i);
              char lastChar = phrase.charAt(i - 1);
              if (Character.isWhitespace(lastChar)){
                  sb.append(Character.toUpperCase(currentChar));
              }
          }
          return sb.toString();
      }
      //String result = phrase.replaceAll("\\B.|\\P{L}","").toUpperCase();
    //          return result;
      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          StringBuilder sb = new StringBuilder();
          int len = word.length();
          for (int i = 0; i < len; i++) {
              char c = (char) (word.charAt(i) + 3);
              if (c > 'z') sb.append((char)(word.charAt(i) - (26 - 3)));
              else sb.append((char)(word.charAt(i) + 3));
          }
          return sb.toString();
      }
}
