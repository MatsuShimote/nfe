package org.nfe.implementations;

import org.nfe.abstracts.Entity;
import org.nfe.abstracts.InputTypes;

import java.util.Scanner;

public class Shipping extends Entity {
  private ShippingCompany shippingCompany;
  private double grossWeight;
  private double netWeight;
  private BusinessClient businessClient;
  private PrivateIndividualClient privateIndividualClient;
  private Supplier supplier;
  private Vehicle vehicle;

  public Shipping() {}

  public ShippingCompany getShippingCompany() {
    return shippingCompany;
  }

  public void setShippingCompany(ShippingCompany shippingCompany) {
    this.shippingCompany = shippingCompany;
  }

  public double getGrossWeight() {
    return grossWeight;
  }

  public void setGrossWeight(double grossWeight) {
    this.grossWeight = grossWeight;
  }

  public double getNetWeight() {
    return netWeight;
  }

  public void setNetWeight(double netWeight) {
    this.netWeight = netWeight;
  }

  public BusinessClient getBusinessClient() {
    return businessClient;
  }

  public void setBusinessClient(BusinessClient businessClient) {
    this.businessClient = businessClient;
  }

  public PrivateIndividualClient getPrivateIndividualClient() {
    return privateIndividualClient;
  }

  public void setPrivateIndividualClient(PrivateIndividualClient privateIndividualClient) {
    this.privateIndividualClient = privateIndividualClient;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void create(Scanner input) {

//    TODO
//    String shippingCompany = (String) this.inputWithoutException(input, "Digite o nome da empresa de envio", InputTypes.STRING);
//
//    this.setBusinessClient();
//    this.setGrossWeight();
//    this.setSupplier();
//    this.setNetWeight();
//    this.setVehicle();
//    this.setPrivateIndividualClient();
//    this.setShippingCompany(new ShippingCompany());
  }
}
