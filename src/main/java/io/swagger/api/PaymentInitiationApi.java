/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.HTTPError;
import io.swagger.model.InitiatePaymentInitiationTransactionRequest;
import io.swagger.model.InitiatePaymentInitiationTransactionResponse;
import io.swagger.model.RetrieveComplianceResponse;
import io.swagger.model.RetrieveFundingCheckResponse;
import io.swagger.model.RetrieveOrderInitiationResponse;
import io.swagger.model.RetrievePaymentInitiationTransactionResponse;
import io.swagger.model.UpdatePaymentInitiationTransactionRequest;
import io.swagger.model.UpdatePaymentInitiationTransactionResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-12T21:31:06.265Z[GMT]")
@Validated
public interface PaymentInitiationApi {

    @Operation(summary = "InCR Initiate a payment transaction", description = "InCR Initiate a payment transaction", tags={ "CR - PaymentInitiationTransaction" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InitiatePaymentInitiationTransactionResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "429", description = "Too Many Requests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/PaymentInitiation/Initiate",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InitiatePaymentInitiationTransactionResponse> initiate(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody InitiatePaymentInitiationTransactionRequest body);

    @Operation(summary = "ReCR Retrieve details about a payment transaction", description = "ReCR Retrieve details about a payment transaction", tags={ "CR - PaymentInitiationTransaction" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RetrievePaymentInitiationTransactionResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "429", description = "Too Many Requests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/PaymentInitiation/{paymentinitiationId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrievePaymentInitiationTransactionResponse> retrieve(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId);


    @Operation(summary = "ReBQ Retrieve details about a payment transaction compliance check", description = "ReBQ Retrieve details about a payment transaction compliance check", tags={ "BQ - Compliance" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RetrieveComplianceResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "429", description = "Too Many Requests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/PaymentInitiation/{paymentinitiationId}/Compliance/{complianceId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrieveComplianceResponse> retrieveCompliance(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("complianceId") String complianceId);


    @Operation(summary = "ReBQ Retrieve details about a payment transaction funds available", description = "ReBQ Retrieve details about a payment transaction funds available", tags={ "BQ - FundingCheck" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RetrieveFundingCheckResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "429", description = "Too Many Requests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/PaymentInitiation/{paymentinitiationId}/FundingCheck/{fundingcheckId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrieveFundingCheckResponse> retrieveFundingCheck(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("fundingcheckId") String fundingcheckId);


    @Operation(summary = "ReBQ Retrieve details about the payment order initiation", description = "ReBQ Retrieve details about the payment order initiation", tags={ "BQ - OrderInitiation" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = RetrieveOrderInitiationResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "429", description = "Too Many Requests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/PaymentInitiation/{paymentinitiationId}/OrderInitiation/{orderinitiationId}/Retrieve",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RetrieveOrderInitiationResponse> retrieveOrderInitiation(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId, @Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("orderinitiationId") String orderinitiationId);


    @Operation(summary = "UpCR Update details of a payment transaction instruction", description = "UpCR Update details of a payment transaction instruction", tags={ "CR - PaymentInitiationTransaction" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdatePaymentInitiationTransactionResponse.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "429", description = "Too Many Requests", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = HTTPError.class))) })
    @RequestMapping(value = "/PaymentInitiation/{paymentinitiationId}/Update",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<UpdatePaymentInitiationTransactionResponse> update(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("paymentinitiationId") String paymentinitiationId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody UpdatePaymentInitiationTransactionRequest body);

}
