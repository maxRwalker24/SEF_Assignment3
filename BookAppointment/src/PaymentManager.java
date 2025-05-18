public class PaymentManager {
    public PaymentManager(){

    }

    public boolean pay(String paymentInfo, LearnerDriver user){ //Paying the amountToPay with the payment info
        // For testing purposes set to true, but otherwise start as false and run validation
        boolean success = true;

        if(success){ //Calling the sendReciept function only if payment is successful
            displayReciept(user);
        }

        return success;
    }

    private void displayReciept(LearnerDriver user){ //Sending the reciept back to the user
    }
}
