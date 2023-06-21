 

public class MathUtilities{

  public Integer add(Integer baseValue, Integer valueToAdd){
      return baseValue + valueToAdd;
  }

  public Double add(Double baseValue, Double valueToAdd){
      return baseValue + valueToAdd;
  }

  public Double half(Integer number) {
      return (double) (number/2);
  }

  public Boolean isOdd(Integer number){
      return (number % 2 != 0);
  }

  public Integer square(Integer number) {
      return number * number;
  }

}
