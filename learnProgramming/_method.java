package learnProgramming;


public class _method {
  public static void main(String[] args) {

 //   System.out.println(displayHighScorePosition(name,calculateHighScorePosition(1500)));
    displayHighScorePosition("johnh",calculateHighScorePosition(1000));
    displayHighScorePosition("lodi",calculateHighScorePosition(900));
    displayHighScorePosition("kurimaw",calculateHighScorePosition(400));
    displayHighScorePosition("pokuru",calculateHighScorePosition(50));
  
  }

  public static void displayHighScorePosition(String name, int position){
      String post= "";
      if(position==1)post = "st";
      if (position ==2) post = "nd";
      if (position ==3) post = "rd";
      if (position >3) post = "th";

      String message = name + " manage to get into position " + position +post+ " on highscore table.";
    System.out.println(message);

  }

  public static int calculateHighScorePosition(int score){
      int position = 4;
    if (score>=1000){
        position = 1;
    } else if ((score >= 500)){
        position = 2;
    } else if((score >= 100) ){
        position = 3;
    }
    return position;
  }

}