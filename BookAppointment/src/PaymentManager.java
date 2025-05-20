public class PaymentManager {
    public PaymentManager(){

    }

    public boolean pay(String paymentInfo, LearnerDriver user){ //Paying the amountToPay with the payment info
        // For testing purposes set to true, but otherwise start as false and run validation
        boolean success = true;
        UserInterface ui = new UserInterface();

        if(success){ //Calling the sendReciept function only if payment is successful
            ui.displayReceipt("Reciept");
        }

        return success;
    }
}
