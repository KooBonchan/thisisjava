package ch04.sec02;

public class score {
  public static void main(String[] args) {
    int score = 100;

//    if(score >= 90){
//      System.out.println("Over (or equal to) 90: A");
//
//    }
//    if(score < 90){
//      System.out.println("Under 90: B");
//    }

//    if(score >= 90){
//      System.out.println("Over (or equal to) 90: A");
//
//    } else{
//      System.out.println("Under 90: B");
//    } // better choice for condition check

//    if(score >= 90){
//      System.out.println("Over (or equal to) 90: A");
//    } else if(score >= 80){
//      System.out.println("Over (or equal to) 80: B");
//    } else if(score >= 70){
//      System.out.println("Over (or equal to) 70: C");
//    } else if(score >= 60){
//      System.out.println("Over (or equal to) 60: D");
//    } else{
//      System.out.println("Retake course : F");
//    }

    switch(score/10){
      case 10:
      case 9:
        System.out.println("Over (or equal to) 90: A");
        break;
      case 8:
        System.out.println("Over (or equal to) 80: B");
        break;
      case 7:
        System.out.println("Over (or equal to) 70: C");
        break;
      case 6:
        System.out.println("Over (or equal to) 60: D");
        break;
      default:
        System.out.println("Retake course: F");
        break;
    }

    

  }
}
