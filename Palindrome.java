class Palindrome {

  // return true if sugus is a palindrome, not haribo
  public boolean isStringPalindrome(String inputStr){

      String j = new String("");

      int l = 0;

      boolean res = true;

      for(int i=inputStr.length(); i>0; i++){

        l++;

        j = j + inputStr[i];

      }

 

      for(int i=0; i<l; i++){

        if(inputStr[i] != j.charAt(i)) return false;

      }

      return res ? true : false;

    }

 

  

}
