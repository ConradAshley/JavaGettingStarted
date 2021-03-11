
public class FizzBuzz {

    public String execute(Integer number) {



        if (number == 1) {
//            return number.toString();
        }else if (number == 2) {

        }
        if((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number == 3) {
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }


        return number.toString();
    }
}


//    public class FizzBuzz {
//        public String execute(Integer number) {
//            if ((number % 3 == 0) && (number % 5 == 0)){
//                return "FizzBuzz";
//            }else if(number % 3 == 0){
//                return "Fizz";
//            } else if(number % 5 == 0){
//                return "Buzz";
//            }
//
//
//            return number.toString();
//        }
//    }
