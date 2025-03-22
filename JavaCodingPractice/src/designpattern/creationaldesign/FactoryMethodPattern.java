package designpattern.creationaldesign;

/**
 * The Factory Method Design Pattern is a creational design pattern used in software development.
 * It provides an interface for creating objects in a superclass while allowing subclasses to specify the types of objects they create.
 *
 * This pattern simplifies the object creation process by placing it in a dedicated method,
 * promoting loose coupling between the object creator and the objects themselves.
 * This approach enhances flexibility, extensibility, and maintainability,
 * enabling subclasses to implement their own factory methods for creating specific object types.
 */

// product interface
interface PaymentService {
    void processPayment();
}

// Concrete product class
class PayPalPaymentService implements PaymentService {
    public void processPayment() {
        System.out.println("Processing via PayPal");
    }
}

// concrete product class
class CreditCardPaymentService implements PaymentService {
    public void processPayment() {
        System.out.println("Processing via Credit Card");
    }
}

// creator interface (Factory interface)
// Factory interface defining the factory method
interface ServiceFactory {
    PaymentService createPaymentService();
}

// concrete Factory class for PayPalPaymentService
class PayPalPaymentServiceFactory implements ServiceFactory{
    public PaymentService createPaymentService(){
        return new PayPalPaymentService();
    }
}

// concrete Factory class for CreditCardPaymentService
class CreditCardPaymentServiceFactory implements ServiceFactory{
    public PaymentService createPaymentService(){
        return new CreditCardPaymentService();
    }
}


// Factory to return appropriate payment service factory
class PaymentServiceFactory {
    public static ServiceFactory getPaymentService(String type) {
        if ("paypal".equalsIgnoreCase(type)) {
            return new PayPalPaymentServiceFactory();
        } else if ("creditcard".equalsIgnoreCase(type)) {
            return new CreditCardPaymentServiceFactory();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}


// Main class
class FactoryMethodPattern {
    public static void main(String[] args) {
        // Usage
        ServiceFactory serviceFactory = PaymentServiceFactory.getPaymentService("paypal");
        PaymentService payment = serviceFactory.createPaymentService();
        payment.processPayment();

    }
}
