package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.InitiatePaymentInitiationTransactionRequestPaymentInitiationTransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiatePaymentInitiationTransactionRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")


public class InitiatePaymentInitiationTransactionRequest   {
  @JsonProperty("PaymentInitiationTransaction")
  private InitiatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction = null;

  public InitiatePaymentInitiationTransactionRequest paymentInitiationTransaction(InitiatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
   **/
  @Schema(description = "")
  
    @Valid
    public InitiatePaymentInitiationTransactionRequestPaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(InitiatePaymentInitiationTransactionRequestPaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentInitiationTransactionRequest initiatePaymentInitiationTransactionRequest = (InitiatePaymentInitiationTransactionRequest) o;
    return Objects.equals(this.paymentInitiationTransaction, initiatePaymentInitiationTransactionRequest.paymentInitiationTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentInitiationTransactionRequest {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
