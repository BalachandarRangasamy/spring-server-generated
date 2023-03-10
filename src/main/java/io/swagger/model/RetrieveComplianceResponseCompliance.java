package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveComplianceResponseCompliance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")


public class RetrieveComplianceResponseCompliance   {
  @JsonProperty("PaymentTransactionComplianceCheckType")
  private String paymentTransactionComplianceCheckType = null;

  @JsonProperty("PaymentTransactionComplianceCheckResult")
  private String paymentTransactionComplianceCheckResult = null;

  @JsonProperty("PaymentTransactionComplianceTaskResult")
  private String paymentTransactionComplianceTaskResult = null;

  public RetrieveComplianceResponseCompliance paymentTransactionComplianceCheckType(String paymentTransactionComplianceCheckType) {
    this.paymentTransactionComplianceCheckType = paymentTransactionComplianceCheckType;
    return this;
  }

  /**
   * Get paymentTransactionComplianceCheckType
   * @return paymentTransactionComplianceCheckType
   **/
  @Schema(description = "")
  
    public String getPaymentTransactionComplianceCheckType() {
    return paymentTransactionComplianceCheckType;
  }

  public void setPaymentTransactionComplianceCheckType(String paymentTransactionComplianceCheckType) {
    this.paymentTransactionComplianceCheckType = paymentTransactionComplianceCheckType;
  }

  public RetrieveComplianceResponseCompliance paymentTransactionComplianceCheckResult(String paymentTransactionComplianceCheckResult) {
    this.paymentTransactionComplianceCheckResult = paymentTransactionComplianceCheckResult;
    return this;
  }

  /**
   * Get paymentTransactionComplianceCheckResult
   * @return paymentTransactionComplianceCheckResult
   **/
  @Schema(description = "")
  
    public String getPaymentTransactionComplianceCheckResult() {
    return paymentTransactionComplianceCheckResult;
  }

  public void setPaymentTransactionComplianceCheckResult(String paymentTransactionComplianceCheckResult) {
    this.paymentTransactionComplianceCheckResult = paymentTransactionComplianceCheckResult;
  }

  public RetrieveComplianceResponseCompliance paymentTransactionComplianceTaskResult(String paymentTransactionComplianceTaskResult) {
    this.paymentTransactionComplianceTaskResult = paymentTransactionComplianceTaskResult;
    return this;
  }

  /**
   * Get paymentTransactionComplianceTaskResult
   * @return paymentTransactionComplianceTaskResult
   **/
  @Schema(description = "")
  
    public String getPaymentTransactionComplianceTaskResult() {
    return paymentTransactionComplianceTaskResult;
  }

  public void setPaymentTransactionComplianceTaskResult(String paymentTransactionComplianceTaskResult) {
    this.paymentTransactionComplianceTaskResult = paymentTransactionComplianceTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveComplianceResponseCompliance retrieveComplianceResponseCompliance = (RetrieveComplianceResponseCompliance) o;
    return Objects.equals(this.paymentTransactionComplianceCheckType, retrieveComplianceResponseCompliance.paymentTransactionComplianceCheckType) &&
        Objects.equals(this.paymentTransactionComplianceCheckResult, retrieveComplianceResponseCompliance.paymentTransactionComplianceCheckResult) &&
        Objects.equals(this.paymentTransactionComplianceTaskResult, retrieveComplianceResponseCompliance.paymentTransactionComplianceTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionComplianceCheckType, paymentTransactionComplianceCheckResult, paymentTransactionComplianceTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveComplianceResponseCompliance {\n");
    
    sb.append("    paymentTransactionComplianceCheckType: ").append(toIndentedString(paymentTransactionComplianceCheckType)).append("\n");
    sb.append("    paymentTransactionComplianceCheckResult: ").append(toIndentedString(paymentTransactionComplianceCheckResult)).append("\n");
    sb.append("    paymentTransactionComplianceTaskResult: ").append(toIndentedString(paymentTransactionComplianceTaskResult)).append("\n");
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
