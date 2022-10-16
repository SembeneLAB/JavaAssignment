public class TryingMethods {
  /* This class try a method*/

  public static void main(String[] args) {
    int x = 0;

    while (x < 1000) {
      x+= x;
      x++;
      System.out.println(x);
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
  
  public static void secondstaticmethod() {
    int number = 0;
    for (x = 12; x < 103; x++)
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
}