package exceptions;

//Custom exception for payment-related errors
class PaymentException extends Exception {

	public PaymentException() {
		super("Amount not received.");
	}

	public PaymentException(String message) {
		super(message);
	}
}

//PaymentService class responsible for processing payments
class PaymentService {

	public void processPayment(double amount) throws PaymentException {
		if (amount <= 0) {
			// Throw a custom PaymentException for invalid payment amount
			throw new PaymentException("Invalid payment amount: " + amount);
		}
		System.out.println("Received amount:" + amount);
	}
}

//Main class demonstrating the usage of custom exceptions
public class CustomExceptionHandlingEx01 {
	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();

		try {
			paymentService.processPayment(-100); // This should throw a PaymentException
		} catch (PaymentException e) {
			// Handle the PaymentException
			System.out.println("Payment processing failed: " + e.getMessage());
		}
	}
}
