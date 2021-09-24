public class Main {

    public static void main(String[] args) {
	// write your code here
      // Set ticket prices
        // if age of person is 10 or under
        // then set ticket to 5.00
        // if age of person over 65
        // then set ticket to 8.00
        // otherwise standard ticket price = 12.50
        int age =66;
        double ticket =12.50;
        boolean freeToy = false;

        if (age <= 10) {
            //set ticket price 5.00
            ticket = 5.00;
            //children under 5 get a free toy!
            if (age < 5) {
                freeToy = true;
            }
        }
        else if (age > 65 ) {
            //set ticket price = 8.00
            ticket = 8.00;
        }
        else {
            //standard tickets
            //ticket = 12.50;
            System.out.println("No discount");
        }

        System.out.println("ticket is:" + ticket);
        System.out.println("free toy?:" + freeToy);
    }
}
