
public class FizzBuzz {
	public String fizzBuzz(int number) {
        String resp;
        
        if(((number % 3) == 0) && ((number % 5) == 0 )) {
            resp = "FizzBuzz";
        }else if((number % 5) == 0 ) {
            resp = "Buzz";
        }else if ((number % 3) == 0) {
        	resp = "Fizz";
        }else {
            resp = String.valueOf(number);
        }
        return resp;
    }
}
