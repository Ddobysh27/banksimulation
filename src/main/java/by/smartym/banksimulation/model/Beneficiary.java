package by.smartym.banksimulation.model;

import lombok.Data;

@Data
public class Beneficiary {

    private Creditor creditor;
    private CreditorAccount creditorAccount;
}
