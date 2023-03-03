package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveComplianceResponsePaymentInitiationTransaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")


public class RetrieveComplianceResponsePaymentInitiationTransaction   {
  @JsonProperty("PaymentTransactionType")
  private String paymentTransactionType = null;

  @JsonProperty("CustomerReference")
  private Object customerReference = null;

  @JsonProperty("PayerReference")
  private Object payerReference = null;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference = null;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference = null;

  @JsonProperty("PayeeReference")
  private Object payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference = null;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference = null;

  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("Currency")
  private String currency = null;

  @JsonProperty("DateType")
  private String dateType = null;

  @JsonProperty("PaymentPurpose")
  private String paymentPurpose = null;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference = null;

  @JsonProperty("DocumentContent")
  private String documentContent = null;

  public RetrieveComplianceResponsePaymentInitiationTransaction paymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
    return this;
  }

  /**
   * Get paymentTransactionType
   * @return paymentTransactionType
   **/
  @Schema(description = "")
  
    public String getPaymentTransactionType() {
    return paymentTransactionType;
  }

  public void setPaymentTransactionType(String paymentTransactionType) {
    this.paymentTransactionType = paymentTransactionType;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
   **/
  @Schema(description = "")
  
    public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
   **/
  @Schema(description = "")
  
    public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
   **/
  @Schema(description = "")
  
    public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
   **/
  @Schema(description = "")
  
    public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
   **/
  @Schema(description = "")
  
    public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
   **/
  @Schema(description = "")
  
    public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
   **/
  @Schema(description = "")
  
    public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(description = "")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
   **/
  @Schema(description = "")
  
    public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction paymentPurpose(String paymentPurpose) {
    this.paymentPurpose = paymentPurpose;
    return this;
  }

  /**
   * Get paymentPurpose
   * @return paymentPurpose
   **/
  @Schema(description = "")
  
    public String getPaymentPurpose() {
    return paymentPurpose;
  }

  public void setPaymentPurpose(String paymentPurpose) {
    this.paymentPurpose = paymentPurpose;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
   **/
  @Schema(description = "")
  
    public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public RetrieveComplianceResponsePaymentInitiationTransaction documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

  /**
   * Get documentContent
   * @return documentContent
   **/
  @Schema(description = "")
  
    public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveComplianceResponsePaymentInitiationTransaction retrieveComplianceResponsePaymentInitiationTransaction = (RetrieveComplianceResponsePaymentInitiationTransaction) o;
    return Objects.equals(this.paymentTransactionType, retrieveComplianceResponsePaymentInitiationTransaction.paymentTransactionType) &&
        Objects.equals(this.customerReference, retrieveComplianceResponsePaymentInitiationTransaction.customerReference) &&
        Objects.equals(this.payerReference, retrieveComplianceResponsePaymentInitiationTransaction.payerReference) &&
        Objects.equals(this.payerBankReference, retrieveComplianceResponsePaymentInitiationTransaction.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, retrieveComplianceResponsePaymentInitiationTransaction.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, retrieveComplianceResponsePaymentInitiationTransaction.payeeReference) &&
        Objects.equals(this.payeeBankReference, retrieveComplianceResponsePaymentInitiationTransaction.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, retrieveComplianceResponsePaymentInitiationTransaction.payeeProductInstanceReference) &&
        Objects.equals(this.amount, retrieveComplianceResponsePaymentInitiationTransaction.amount) &&
        Objects.equals(this.currency, retrieveComplianceResponsePaymentInitiationTransaction.currency) &&
        Objects.equals(this.dateType, retrieveComplianceResponsePaymentInitiationTransaction.dateType) &&
        Objects.equals(this.paymentPurpose, retrieveComplianceResponsePaymentInitiationTransaction.paymentPurpose) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, retrieveComplianceResponsePaymentInitiationTransaction.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.documentContent, retrieveComplianceResponsePaymentInitiationTransaction.documentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionType, customerReference, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, paymentPurpose, documentDirectoryEntryInstanceReference, documentContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveComplianceResponsePaymentInitiationTransaction {\n");
    
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    paymentPurpose: ").append(toIndentedString(paymentPurpose)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
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
