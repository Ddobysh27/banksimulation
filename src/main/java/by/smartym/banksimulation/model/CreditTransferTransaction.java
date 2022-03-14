package by.smartym.banksimulation.model;

import lombok.Data;

@Data
public class CreditTransferTransaction {

    private InstructedAmount instructedAmount;
    private RemittanceInformation remittanceInformation;
    private String requestedExecutionDate;
}
