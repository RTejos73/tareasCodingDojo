public class FizzBuzz {
    public String fizzBuzz(int number) {
        String resp;
        
        if((number % 3) == 0){
            resp = "Fizz";
        }else if((number % 5) == 0 ) {
            resp = "Buzz";
        }else {
            resp = String.valueOf(number);
        }
        return resp;
    }

    
}
