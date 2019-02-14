package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by semvv on 13/02/2019.
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MergeRublePaymentOrderDocument {
    private String legalUserName;
    private String legalUserCif;
    private String legalUserTaxIdNumber;
    private String legalAddressFull;
    private String managerPosition;
    private String managerName;
    private String effectiveDate;
    private String amount;
    private String seqNo;
    private String documentTypeId;
    private String currencyCode;
    private String currencyIsoNumber;
    private boolean express;
    private String vatt;
    private String beneficiaryName;
    private String beneficaryTaxIdNumber;
    private String beneficiaryAccountNumber;
    private String beneficiaryBankName;
    private String beneficiaryBankCode;
    private String beneficiaryBankCountryCode112;
    private String beneficiaryRegCountryCode112;
    private String payerName;
    private String payerLocation;
    private String payerAccountNumber;
    private String payerAccountCurrencyCode933;
    private String payerAccountCurrencyIsoNumber;
    private String payerTaxIdNumber;
    private String payerBankName;
    private String payerBankCode;
    private String descriptionData;
    private String descriptionAdditional;
    private String transferCostsCode;
    private String transferCostsName;
    private String paymentQueueCode;
    private String paymentQueueName;
    private String keepingAccountId;
    private String payerAccountId;
    private String beneficiaryAccountId;
    private boolean isTaxPayment;
}
