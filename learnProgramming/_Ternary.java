public class _Ternary {
  
  public static void main(String[] args) {


    //sample
  //   int ageOf = 23;
  //   boolean isEighteen = (ageOf <= 20)? true:false;
  //   System.out.println(isEighteen);

  //chalenge
 double a = 20.00d;
 double b = 80.00d;
 double sum = (a + b) * 100.00d;
 System.out.println(sum);
 double reminder = sum % 40.00d;
System.out.println(reminder);
 boolean inNoReminder = (reminder == 0) ? true: false;
 
 System.out.println(inNoReminder);

 if (!inNoReminder) {
  System.out.println("has reminder");

 }

  }
}
