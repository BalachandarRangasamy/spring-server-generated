package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FundingCheck
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")


public class FundingCheck   {
  @JsonProperty("PaymentTransactionFundingCheckResult")
  private String paymentTransactionFundingCheckResult = null;

  public FundingCheck paymentTransactionFundingCheckResult(String paymentTransactionFundingCheckResult) {
    this.paymentTransactionFundingCheckResult = paymentTransactionFundingCheckResult;
    return this;
  }

  /**
   * Get paymentTransactionFundingCheckResult
   * @return paymentTransactionFundingCheckResult
   **/
  @Schema(description = "")
  
    public String getPaymentTransactionFundingCheckResult() {
    return paymentTransactionFundingCheckResult;
  }

  public void setPaymentTransactionFundingCheckResult(String paymentTransactionFundingCheckResult) {
    this.paymentTransactionFundingCheckResult = paymentTransactionFundingCheckResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundingCheck fundingCheck = (FundingCheck) o;
    return Objects.equals(this.paymentTransactionFundingCheckResult, fundingCheck.paymentTransactionFundingCheckResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionFundingCheckResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundingCheck {\n");
    
    sb.append("    paymentTransactionFundingCheckResult: ").append(toIndentedString(paymentTransactionFundingCheckResult)).append("\n");
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
