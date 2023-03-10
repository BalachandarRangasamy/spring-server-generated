package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RetrieveOrderInitiationResponseOrderInitiation;
import io.swagger.model.RetrieveOrderInitiationResponsePaymentInitiationTransaction;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveOrderInitiationResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")


public class RetrieveOrderInitiationResponse   {
  @JsonProperty("PaymentInitiationTransaction")
  private RetrieveOrderInitiationResponsePaymentInitiationTransaction paymentInitiationTransaction = null;

  @JsonProperty("OrderInitiation")
  private RetrieveOrderInitiationResponseOrderInitiation orderInitiation = null;

  public RetrieveOrderInitiationResponse paymentInitiationTransaction(RetrieveOrderInitiationResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
   **/
  @Schema(description = "")
  
    @Valid
    public RetrieveOrderInitiationResponsePaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(RetrieveOrderInitiationResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }

  public RetrieveOrderInitiationResponse orderInitiation(RetrieveOrderInitiationResponseOrderInitiation orderInitiation) {
    this.orderInitiation = orderInitiation;
    return this;
  }

  /**
   * Get orderInitiation
   * @return orderInitiation
   **/
  @Schema(description = "")
  
    @Valid
    public RetrieveOrderInitiationResponseOrderInitiation getOrderInitiation() {
    return orderInitiation;
  }

  public void setOrderInitiation(RetrieveOrderInitiationResponseOrderInitiation orderInitiation) {
    this.orderInitiation = orderInitiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveOrderInitiationResponse retrieveOrderInitiationResponse = (RetrieveOrderInitiationResponse) o;
    return Objects.equals(this.paymentInitiationTransaction, retrieveOrderInitiationResponse.paymentInitiationTransaction) &&
        Objects.equals(this.orderInitiation, retrieveOrderInitiationResponse.orderInitiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction, orderInitiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveOrderInitiationResponse {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
    sb.append("    orderInitiation: ").append(toIndentedString(orderInitiation)).append("\n");
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
