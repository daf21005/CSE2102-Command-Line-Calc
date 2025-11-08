public class CommandLine{

    public static void main(String[] args){
        // if no arguments are provided
        if (args.length == 0){
            System.out.println("No arguments provided");
            return;
        }

        String operator = args[0];

        // check if the first argument is a valid operator
        if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")){
            System.out.println("Must use one of the operators: + - * /");
            return;
        }

        // provided code 
        System.out.println("Arguments provided:");
        for (String arg : args){
            System.out.println(arg);
        }

        // perform the operation
        try {
            double result = Double.parseDouble(args[1]);
            for (int i = 2; i < args.length; i++){
                double number = Double.parseDouble(args[i]);
                switch (operator){
                    case "+":
                        result += number;
                        break;
                    case "-":
                        result -= number;
                        break;
                    case "*":
                        result *= number;
                        break;
                    case "/":
                        if (number == 0){
                            System.out.println("Error: Division by zero");
                            return;
                        }
                        result /= number;
                        break;
                }
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments after the operator must be numbers");
        }

    
    }
}