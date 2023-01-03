public class _statement {
  public static void main(String[] args) {

    System.out.println(calculateScore(false, 12, 23, 100));
    System.out.println(calculateScore(false, 22, 33, 2323));
  }

  public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
  
    if (!gameOver){
      int finalScore = score +(levelCompleted * bonus);
      return  finalScore += 1000;
      
    }
    return -1;
  }
  
}
