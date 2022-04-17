import java.util.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.beans.PropertyEditorSupport;
import java.lang.*;
import static java.lang.Float.NaN;
import java.lang.Math;


public class MyScientificCalc
{
    public MyScientificCalc() {
    }

    private static final Logger logger = LogManager.getLogger(MyScientificCalc.class);

    public static void main(String args[])
    {
        int flag=0, ch;
        double num, b;
        int factnum;
        MyScientificCalc calculator = new MyScientificCalc();
        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator System");
        do
        {
            System.out.println("Option Menu");
            System.out.println("Hi ");
            System.out.println("1) Square Root");
            System.out.println("2) Factorial");
            System.out.println("3) Natural Log");
            System.out.println("4) Power");
            System.out.println("5) Exit");
            System.out.print("Enter choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                    case 1:
                        System.out.println("Square Root");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println(calculator.squareRoot(num));
                        break;
                    case 2:
                        System.out.println("Factorial");
                        System.out.print("Enter number: ");
                        factnum = reader.nextInt();
                        System.out.println(calculator.factorial(factnum));
                        break;
                    case 3:
                        System.out.println("Natural Log");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println(calculator.naturalLog(num));
                        break;
                    case 4:
                        System.out.println("Power");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        b = reader.nextDouble();
                        System.out.println(calculator.power(num,b));
                        break;
                    default: System.out.println("Exiting program due to invalid input");
                        flag=1;
                }
            }
            System.out.println("\n");
        }while(flag==0);
    }
    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        logger.info("Executing square root function");
        return result;
    }

    public int factorial(int number) {
        int result = number;
        for( int i = number-1; i >= 1; i--){
            result = result*i;
        }
        logger.info("Executing factorial function");
        return result;
    }

    public double naturalLog(double number) {
        double result = Math.log(number);
        logger.info("Executing Natural log function");
        return result;
    }

    public double power(double number, double b) {
        double result = Math.pow(number, b);
        logger.info("Executing Power function");
        return result;
    }
}

// do {
//     System.out.println("Calculator, Choose to perform operation");
//     System.out.print("Press 1 to Add\nPress 2 to Subtract\nPress 3 to Multiply\nPress 4 to Divide\n"+
//             "Press 5 to calculate Square Root\nPress 6 to calculate Factorial\nPress 7 to calculate Natural Logarithm\nPress 8 to calculate Power\n" +
//             "Press any other key to exit\nEnter your choice: ");
//     int choice;
//     try {
//         choice = scanner.nextInt();
//     } catch (InputMismatchException error) {
//         return;
//     }

//     switch (choice) {
//         case 1:
//             try {
//                 System.out.print("Enter the first number : ");
//                 number1 = scanner.nextDouble();
//                 System.out.print("Enter the second number : ");
//                 number2 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Addition result is : " + calculator.add(number1, number2));
//             break;
//         case 2:
//             try {
//                 System.out.print("Enter the first number : ");
//                 number1 = scanner.nextDouble();
//                 System.out.print("Enter the second number : ");
//                 number2 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Subtraction result is : " + calculator.subtract(number1, number2));
//             break;
//         case 3:
//             try {
//                 System.out.print("Enter the first number : ");
//                 number1 = scanner.nextDouble();
//                 System.out.print("Enter the second number : ");
//                 number2 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Multiplication result is : " + calculator.multiply(number1, number2));
//             break;
//         case 4:
//             try {
//                 System.out.print("Enter the first number : ");
//                 number1 = scanner.nextDouble();
//                 System.out.print("Enter the second number : ");
//                 number2 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Division result is : " + calculator.divide(number1, number2));
//             break;
//         case 5:
//             //Squareroot
//             try {
//                 System.out.print("Enter the number : ");
//                 number1 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Division result is : " + calculator.sqrroot(number1));
//             break;
//         case 6:
//             //Factorial
//             try {
//                 System.out.print("Enter the number : ");
//                 number1 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Division result is : " + calculator.factorial(number1));
//             break;
//         case 7: //Natural Logarithm
//             try {
//                 System.out.print("Enter the number : ");
//                 number1 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Division result is : " + calculator.natural_log(number1));
//             break;
//         case 8: //Power Function
//             try {
//                 System.out.print("Enter the base number : ");
//                 number1 = scanner.nextDouble();
//                 System.out.print("Enter the power : ");
//                 number2 = scanner.nextDouble();
//             } catch (InputMismatchException error) {
//                 logger.error("Invalid input, Entered input is not a number");
//                 return;
//             }
//             System.out.println("Division result is : " + calculator.power(number1, number2));
//             break;
//         default:
//             System.out.println("Exiting....");
//             return;
//     }

//     System.out.print("\n\n");
// } while (true);
// }