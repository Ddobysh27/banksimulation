package by.smartym.banksimulation.model;

import lombok.Data;

@Data
public class Payload {

    private Beneficiary beneficiary;
    private String creationDateTime;
    private CreditTransferTransaction creditTransferTransaction;
    private int numberOfTransactions;
    private String paymentInformationId;
    private PaymentTypeInformation paymentTypeInformation;
}
