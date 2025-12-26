package oops.polymorphism;

import java.math.BigDecimal;

/**
 * OverloadingProdScenario.java
 * Created by Navneet Malva on 18/12/25 : 23:23.
 */
public class OverloadingProdScenario {

  // ===== NEW CORE METHOD (3 params) =====
  public void processPayment(String userId, BigDecimal amount, String source) {

    System.out.println(
        "Processing payment for user=" + userId +
            ", amount=" + amount +
            ", source=" + source
    );
  }

  // ===== OLD METHOD (kept for backward compatibility) =====
  public void processPayment(String userId, BigDecimal amount) {

    // Delegate to new method
    processPayment(userId, amount, "UNKNOWN");
  }

  public static void main(String[] args) {
    OverloadingProdScenario ob = new OverloadingProdScenario();
    ob.processPayment("Bob", BigDecimal.ONE, "SYSTEM-PRODUCTION");
    ob.processPayment("John", BigDecimal.ONE);
  }
}


