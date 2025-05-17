public class PaymentManager {
    public PaymentManager(){

    }

    public boolean processPayment(String paymentInfo, int amountToPay, LearnerDriver user){ //Paying the amountToPay with the payment info
        boolean success = false;

        if(success){ //Calling the sendReciept function only if payment is successful
            sendReciept(user);
        }

        return success;
    }

    private void sendReciept(LearnerDriver user){ //Sending the reciept back to the user
    }
}
