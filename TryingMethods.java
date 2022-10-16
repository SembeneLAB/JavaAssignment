public class TryingMethods {
  /* This class try a method*/

  public static void main(String[] args) {
    int a = 1;
    int sum = 0;

    while (a < 1000) {
      sum= sum + a;
      a = a+1;
      
    }
    System.out.println(sum);
    secondstaticmethod();

    TryingMethods tryingmethods = new TryingMethods();
    tryingmethods.seconddynamicmethod("extrovert");
    tryingmethods.firstdynamicmethod(1);
    
  }
  
  
  public static void secondstaticmethod() {
    int number = 0;
    for (int x = 12; x < 103; x++)
    {
      if (x % 2 == 0){
        number = number + 1;
      }
    }
    System.out.println(number);
    
  }

    public void seconddynamicmethod(String personality) {

    if (personality == "introvert"){
      System.out.println("introvert");
    }
    else if (personality == "extrovert"){

      System.out.println("extrovert");
    }
    else{
      System.out.println("ambivert");
    }

}
String firstdynamicmethod(Integer number) {
    switch (number) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    
      default:
        break;
    }
    return null;

     

  }
}