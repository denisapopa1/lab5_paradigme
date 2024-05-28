//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            IntCalculator calculator=new IntCalculator(10);
            int result=calculator.Add(5).Substract(3).Multiply(2).Result();
            System.out.println("a)"+ result);
            AdvancedCalculator calculator1=new AdvancedCalculator(10);
            int result2=calculator1.Division(4).Pow(2).AnotherPow(2).Result();
            System.out.println("b)"+ result2);

        }
    }
