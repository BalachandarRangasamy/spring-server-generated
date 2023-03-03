package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentInitiationTransaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")


public class PaymentInitiationTransaction   {
  @JsonProperty("PaymentTransactionType")
  private String paymentTransactionType = null;

  @JsonProperty("RecurringPaymentRecord")
  private String recurringPaymentRecord = null;

  @JsonProperty("RecurringPaymentCustomerReference")
  private Object recurringPaymentCustomerReference = null;

  @JsonProperty("RecurringPaymentReference")
  private Object recurringPaymentReference = null;

  @JsonProperty("CustomerReference")
  private Object customerReference = null;

  @JsonProperty("PaymentTransaction")
  private String paymentTransaction = null;

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

  @JsonProperty("Date")
  private String date = null;

  @JsonProperty("PaymentFeesOrCharges")
  private String paymentFeesOrCharges = null;

  @JsonProperty("PaymentMechanism")
  private String paymentMechanism = null;

  @JsonProperty("PaymentPurpose")
  private String paymentPurpose = null;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference = null;

  @JsonProperty("DocumentContent")
  private String documentContent = null;

  public PaymentInitiationTransaction paymentTransactionType(String paymentTransactionType) {
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

  public PaymentInitiationTransaction recurringPaymentRecord(String recurringPaymentRecord) {
    this.recurringPaymentRecord = recurringPaymentRecord;
    return this;
  }

  /**
   * Get recurringPaymentRecord
   * @return recurringPaymentRecord
   **/
  @Schema(description = "")
  
    public String getRecurringPaymentRecord() {
    return recurringPaymentRecord;
  }

  public void setRecurringPaymentRecord(String recurringPaymentRecord) {
    this.recurringPaymentRecord = recurringPaymentRecord;
  }

  public PaymentInitiationTransaction recurringPaymentCustomerReference(Object recurringPaymentCustomerReference) {
    this.recurringPaymentCustomerReference = recurringPaymentCustomerReference;
    return this;
  }

  /**
   * Get recurringPaymentCustomerReference
   * @return recurringPaymentCustomerReference
   **/
  @Schema(description = "")
  
    public Object getRecurringPaymentCustomerReference() {
    return recurringPaymentCustomerReference;
  }

  public void setRecurringPaymentCustomerReference(Object recurringPaymentCustomerReference) {
    this.recurringPaymentCustomerReference = recurringPaymentCustomerReference;
  }

  public PaymentInitiationTransaction recurringPaymentReference(Object recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
    return this;
  }

  /**
   * Get recurringPaymentReference
   * @return recurringPaymentReference
   **/
  @Schema(description = "")
  
    public Object getRecurringPaymentReference() {
    return recurringPaymentReference;
  }

  public void setRecurringPaymentReference(Object recurringPaymentReference) {
    this.recurringPaymentReference = recurringPaymentReference;
  }

  public PaymentInitiationTransaction customerReference(Object customerReference) {
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

  public PaymentInitiationTransaction paymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
    return this;
  }

  /**
   * Get paymentTransaction
   * @return paymentTransaction
   **/
  @Schema(description = "")
  
    public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }

  public PaymentInitiationTransaction payerReference(Object payerReference) {
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

  public PaymentInitiationTransaction payerBankReference(Object payerBankReference) {
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

  public PaymentInitiationTransaction payerProductInstanceReference(Object payerProductInstanceReference) {
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

  public PaymentInitiationTransaction payeeReference(Object payeeReference) {
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

  public PaymentInitiationTransaction payeeBankReference(Object payeeBankReference) {
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

  public PaymentInitiationTransaction payeeProductInstanceReference(Object payeeProductInstanceReference) {
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

  public PaymentInitiationTransaction amount(String amount) {
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

  public PaymentInitiationTransaction currency(String currency) {
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

  public PaymentInitiationTransaction dateType(String dateType) {
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

  public PaymentInitiationTransaction date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PaymentInitiationTransaction paymentFeesOrCharges(String paymentFeesOrCharges) {
    this.paymentFeesOrCharges = paymentFeesOrCharges;
    return this;
  }

  /**
   * Get paymentFeesOrCharges
   * @return paymentFeesOrCharges
   **/
  @Schema(description = "")
  
    public String getPaymentFeesOrCharges() {
    return paymentFeesOrCharges;
  }

  public void setPaymentFeesOrCharges(String paymentFeesOrCharges) {
    this.paymentFeesOrCharges = paymentFeesOrCharges;
  }

  public PaymentInitiationTransaction paymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
    return this;
  }

  /**
   * Get paymentMechanism
   * @return paymentMechanism
   **/
  @Schema(description = "")
  
    public String getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }

  public PaymentInitiationTransaction paymentPurpose(String paymentPurpose) {
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

  public PaymentInitiationTransaction documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public PaymentInitiationTransaction documentContent(String documentContent) {
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
    PaymentInitiationTransaction paymentInitiationTransaction = (PaymentInitiationTransaction) o;
    return Objects.equals(this.paymentTransactionType, paymentInitiationTransaction.paymentTransactionType) &&
        Objects.equals(this.recurringPaymentRecord, paymentInitiationTransaction.recurringPaymentRecord) &&
        Objects.equals(this.recurringPaymentCustomerReference, paymentInitiationTransaction.recurringPaymentCustomerReference) &&
        Objects.equals(this.recurringPaymentReference, paymentInitiationTransaction.recurringPaymentReference) &&
        Objects.equals(this.customerReference, paymentInitiationTransaction.customerReference) &&
        Objects.equals(this.paymentTransaction, paymentInitiationTransaction.paymentTransaction) &&
        Objects.equals(this.payerReference, paymentInitiationTransaction.payerReference) &&
        Objects.equals(this.payerBankReference, paymentInitiationTransaction.payerBankReference) &&
        Objects.equals(this.payerProductInstanceReference, paymentInitiationTransaction.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, paymentInitiationTransaction.payeeReference) &&
        Objects.equals(this.payeeBankReference, paymentInitiationTransaction.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, paymentInitiationTransaction.payeeProductInstanceReference) &&
        Objects.equals(this.amount, paymentInitiationTransaction.amount) &&
        Objects.equals(this.currency, paymentInitiationTransaction.currency) &&
        Objects.equals(this.dateType, paymentInitiationTransaction.dateType) &&
        Objects.equals(this.date, paymentInitiationTransaction.date) &&
        Objects.equals(this.paymentFeesOrCharges, paymentInitiationTransaction.paymentFeesOrCharges) &&
        Objects.equals(this.paymentMechanism, paymentInitiationTransaction.paymentMechanism) &&
        Objects.equals(this.paymentPurpose, paymentInitiationTransaction.paymentPurpose) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, paymentInitiationTransaction.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.documentContent, paymentInitiationTransaction.documentContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionType, recurringPaymentRecord, recurringPaymentCustomerReference, recurringPaymentReference, customerReference, paymentTransaction, payerReference, payerBankReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, amount, currency, dateType, date, paymentFeesOrCharges, paymentMechanism, paymentPurpose, documentDirectoryEntryInstanceReference, documentContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationTransaction {\n");
    
    sb.append("    paymentTransactionType: ").append(toIndentedString(paymentTransactionType)).append("\n");
    sb.append("    recurringPaymentRecord: ").append(toIndentedString(recurringPaymentRecord)).append("\n");
    sb.append("    recurringPaymentCustomerReference: ").append(toIndentedString(recurringPaymentCustomerReference)).append("\n");
    sb.append("    recurringPaymentReference: ").append(toIndentedString(recurringPaymentReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    paymentTransaction: ").append(toIndentedString(paymentTransaction)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    paymentFeesOrCharges: ").append(toIndentedString(paymentFeesOrCharges)).append("\n");
    sb.append("    paymentMechanism: ").append(toIndentedString(paymentMechanism)).append("\n");
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
