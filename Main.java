import java.util.Scanner;



public class Main{

    


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
    while (true) {
        
    
        String stop = input.next();
    if (stop.equalsIgnoreCase("end")){
        break;
    }

        double total = 0;

    double number1;
        try {
            number1 = Double.parseDouble(stop);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            input.nextLine();
            continue;
        }
    
    String operator = input.next();

    switch(operator){
        case "+":
        case "-":
        case "*":
        case "/":
        case "^":
        case "%":
            break;
        default:
            System.out.println("Error: Invalid operator");
    }

    if (operator.equals("%")){
        total = Math.sqrt(number1);
        System.out.println("Total: " + total);
        continue;
    }
     
    double number2;

    try {
            String secondInput = input.next();
            number2 = Double.parseDouble(secondInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
            input.nextLine();
            continue;
        }
    
       

        switch (operator){
        case "+":
            total = number1 + number2;
            break;
        case "-":
            total = number1 - number2;
            break;

        case "/":
            
            if (number2 == 0){
        System.out.println("Error: Cannot divide by zero");
        continue;
        }
            total = number1 / number2;
            break;

        case "*": 
            total = number1 * number2;
            break;

        case "^":
            total = Math.pow(number1, number2);
            break;

        default:
            continue;
        
        }
    
    
    System.out.println("Total:" + total);

    
    

    }
    input.close();
    
   

    }
}


