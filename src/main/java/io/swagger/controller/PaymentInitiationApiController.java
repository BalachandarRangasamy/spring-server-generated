package io.swagger.controller;

import io.swagger.api.PaymentInitiationApi;
import io.swagger.model.InitiatePaymentInitiationTransactionRequest;
import io.swagger.model.InitiatePaymentInitiationTransactionResponse;
import io.swagger.model.RetrieveComplianceResponse;
import io.swagger.model.RetrieveFundingCheckResponse;
import io.swagger.model.RetrieveOrderInitiationResponse;
import io.swagger.model.RetrievePaymentInitiationTransactionResponse;
import io.swagger.model.UpdatePaymentInitiationTransactionRequest;
import io.swagger.model.UpdatePaymentInitiationTransactionResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")
@RestController
public class PaymentInitiationApiController implements PaymentInitiationApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentInitiationApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentInitiationApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InitiatePaymentInitiationTransactionResponse> initiate(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody InitiatePaymentInitiationTransactionRequest body) {
        String accept = request.getHeader("Accept");
        log.info("initiate in");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InitiatePaymentInitiationTransactionResponse>(objectMapper.readValue("{\n  \"PaymentInitiationTransaction\" : {\n    \"PaymentFeesOrCharges\" : \"PaymentFeesOrCharges\",\n    \"RecurringPaymentReference\" : { },\n    \"RecurringPaymentCustomerReference\" : { },\n    \"DateType\" : \"DateType\",\n    \"RecurringPaymentRecord\" : \"RecurringPaymentRecord\",\n    \"DocumentDirectoryEntryInstanceReference\" : { }\n  }\n}", InitiatePaymentInitiationTransactionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InitiatePaymentInitiationTransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

        return new ResponseEntity<InitiatePaymentInitiationTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RetrievePaymentInitiationTransactionResponse> retrieve(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RetrievePaymentInitiationTransactionResponse>(objectMapper.readValue("{\n  \"PaymentInitiationTransaction\" : {\n    \"PaymentFeesOrCharges\" : \"PaymentFeesOrCharges\",\n    \"RecurringPaymentReference\" : { },\n    \"PayeeProductInstanceReference\" : { },\n    \"PaymentMechanism\" : \"PaymentMechanism\",\n    \"Amount\" : \"Amount\",\n    \"PayerBankReference\" : { },\n    \"PayeeReference\" : { },\n    \"RecurringPaymentRecord\" : \"RecurringPaymentRecord\",\n    \"PayerReference\" : { },\n    \"PaymentPurpose\" : \"PaymentPurpose\",\n    \"PayeeBankReference\" : { },\n    \"DocumentContent\" : \"DocumentContent\",\n    \"RecurringPaymentCustomerReference\" : { },\n    \"Currency\" : \"Currency\",\n    \"PaymentTransactionType\" : \"PaymentTransactionType\",\n    \"PayerProductInstanceReference\" : { },\n    \"DateType\" : \"DateType\",\n    \"DocumentDirectoryEntryInstanceReference\" : { }\n  }\n}", RetrievePaymentInitiationTransactionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RetrievePaymentInitiationTransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RetrievePaymentInitiationTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RetrieveComplianceResponse> retrieveCompliance(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("complianceId") String complianceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RetrieveComplianceResponse>(objectMapper.readValue("{\n  \"Compliance\" : {\n    \"PaymentTransactionComplianceCheckType\" : \"PaymentTransactionComplianceCheckType\",\n    \"PaymentTransactionComplianceTaskResult\" : \"PaymentTransactionComplianceTaskResult\",\n    \"PaymentTransactionComplianceCheckResult\" : \"PaymentTransactionComplianceCheckResult\"\n  },\n  \"PaymentInitiationTransaction\" : {\n    \"PayeeProductInstanceReference\" : { },\n    \"Amount\" : \"Amount\",\n    \"PayerBankReference\" : { },\n    \"PayeeReference\" : { },\n    \"PayerReference\" : { },\n    \"PaymentPurpose\" : \"PaymentPurpose\",\n    \"CustomerReference\" : { },\n    \"PayeeBankReference\" : { },\n    \"DocumentContent\" : \"DocumentContent\",\n    \"Currency\" : \"Currency\",\n    \"PaymentTransactionType\" : \"PaymentTransactionType\",\n    \"PayerProductInstanceReference\" : { },\n    \"DateType\" : \"DateType\",\n    \"DocumentDirectoryEntryInstanceReference\" : { }\n  }\n}", RetrieveComplianceResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RetrieveComplianceResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RetrieveComplianceResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RetrieveFundingCheckResponse> retrieveFundingCheck(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("fundingcheckId") String fundingcheckId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RetrieveFundingCheckResponse>(objectMapper.readValue("{\n  \"FundingCheck\" : {\n    \"PaymentTransactionFundingCheckResult\" : \"PaymentTransactionFundingCheckResult\"\n  },\n  \"PaymentInitiationTransaction\" : {\n    \"PaymentFeesOrCharges\" : \"PaymentFeesOrCharges\",\n    \"PayerReference\" : { },\n    \"CustomerReference\" : { },\n    \"Amount\" : \"Amount\",\n    \"Currency\" : \"Currency\",\n    \"PaymentTransactionType\" : \"PaymentTransactionType\",\n    \"PayerBankReference\" : { },\n    \"PayerProductInstanceReference\" : { },\n    \"DateType\" : \"DateType\"\n  }\n}", RetrieveFundingCheckResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RetrieveFundingCheckResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RetrieveFundingCheckResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RetrieveOrderInitiationResponse> retrieveOrderInitiation(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("orderinitiationId") String orderinitiationId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RetrieveOrderInitiationResponse>(objectMapper.readValue("{\n  \"PaymentInitiationTransaction\" : {\n    \"PaymentFeesOrCharges\" : \"PaymentFeesOrCharges\",\n    \"PayeeProductInstanceReference\" : { },\n    \"PaymentMechanism\" : \"PaymentMechanism\",\n    \"Amount\" : \"Amount\",\n    \"PayerBankReference\" : { },\n    \"PayeeReference\" : { },\n    \"PayerReference\" : { },\n    \"PaymentPurpose\" : \"PaymentPurpose\",\n    \"CustomerReference\" : { },\n    \"PayeeBankReference\" : { },\n    \"DocumentContent\" : \"DocumentContent\",\n    \"Currency\" : \"Currency\",\n    \"PaymentTransactionType\" : \"PaymentTransactionType\",\n    \"PayerProductInstanceReference\" : { },\n    \"DateType\" : \"DateType\",\n    \"DocumentDirectoryEntryInstanceReference\" : { }\n  },\n  \"OrderInitiation\" : {\n    \"PaymentOrderProcedureInstanceReference\" : { },\n    \"OrderInitiationTaskResult\" : \"OrderInitiationTaskResult\",\n    \"PaymentOrderProcedureInstanceStatus\" : \"PaymentOrderProcedureInstanceStatus\"\n  }\n}", RetrieveOrderInitiationResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RetrieveOrderInitiationResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RetrieveOrderInitiationResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UpdatePaymentInitiationTransactionResponse> update(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UpdatePaymentInitiationTransactionRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UpdatePaymentInitiationTransactionResponse>(objectMapper.readValue("{\n  \"PaymentInitiationTransaction\" : {\n    \"PaymentFeesOrCharges\" : \"PaymentFeesOrCharges\",\n    \"RecurringPaymentReference\" : { },\n    \"PayeeProductInstanceReference\" : { },\n    \"PaymentMechanism\" : \"PaymentMechanism\",\n    \"Amount\" : \"Amount\",\n    \"PayerBankReference\" : { },\n    \"PayeeReference\" : { },\n    \"RecurringPaymentRecord\" : \"RecurringPaymentRecord\",\n    \"PayerReference\" : { },\n    \"PaymentPurpose\" : \"PaymentPurpose\",\n    \"PayeeBankReference\" : { },\n    \"DocumentContent\" : \"DocumentContent\",\n    \"RecurringPaymentCustomerReference\" : { },\n    \"Currency\" : \"Currency\",\n    \"PaymentTransactionType\" : \"PaymentTransactionType\",\n    \"PayerProductInstanceReference\" : { },\n    \"DateType\" : \"DateType\",\n    \"DocumentDirectoryEntryInstanceReference\" : { }\n  }\n}", UpdatePaymentInitiationTransactionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UpdatePaymentInitiationTransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UpdatePaymentInitiationTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
