class PaymentProcessor {
 public boolean processPayment(double amount, String paymentMethod) {
	 if (isValidPaymentMethod(paymentMethod)) {
		 if (amount > 0) {
			 System.out.println("Processing payment of $" + amount + " via " + paymentMethod);
			 System.out.println("Payment successful.");
			 return true;
		 } else {
			 System.out.println("Invalid payment amount.");
		 }
	 } else {
		 System.out.println("Invalid payment method.");
	 }
	 System.out.println("Payment processing failed.");
	 return false;
 }

 private boolean isValidPaymentMethod(String paymentMethod) {
	 return !"Invalid Method".equals(paymentMethod);
 }
}