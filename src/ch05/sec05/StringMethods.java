package ch05.sec05;

public class StringMethods {
//  char at
//  length
//  replace
//  substring
//  indexof
//  split

  public static void main(String[] args) {
    sexCheck("9506244230123");

  }

  static boolean ssnLengthVerify(String ssn){
    if(ssn.length() != 13){
      System.out.println("Not Korea SSN");
      return false;
    }
    else{
      return true;
    }
  }

  static void sexCheck(String ssn){
    if(!ssnLengthVerify(ssn)) return;
    switch(ssn.charAt(6)){
      case '1': case'3':
        System.out.println("Male");
        break;
      case '2': case'4':
        System.out.println("Female");
        break;
      default:
        System.out.println("Korean?");
    }
  }
}

