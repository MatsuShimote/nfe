package org.nfe.implementations;

import org.nfe.abstracts.InputTypes;
import org.nfe.abstracts.People;

public class Supplier extends People {
  private String cnpj;
  private String companyName;
  private String stateSubscription;
  public Supplier() {
    this.cnpj = "";
    this.companyName = "";
    this.stateSubscription = "";
  }

  public Supplier(String cnpj, String companyName, String stateSubscription, Address address, Phone phone) {
    super(address, phone);

    this.cnpj = cnpj;
    this.companyName = companyName;
    this.stateSubscription = stateSubscription;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getStateSubscription() {
    return stateSubscription;
  }

  public void setStateSubscription(String stateSubscription) {
    this.stateSubscription = stateSubscription;
  }
  public create(Scanner input) {
    String companyName = (String) this.inputWithoutException(input, "Digite o nome da empresa : ", InputTypes.STRING);
    String cnpj = (String) this.inputWithoutException(input, "Digite o CNPJ: ", InputTypes.STRING);
    String stateSubscription = (String) this.inputWithoutException(input, "Digite a Inscricao estadual: ", InputTypes.STRING);

    this.setCompanyName(companyName);
    this.setCnpj(cnpj);
    this.setStateSubscription(stateSubscription);
}