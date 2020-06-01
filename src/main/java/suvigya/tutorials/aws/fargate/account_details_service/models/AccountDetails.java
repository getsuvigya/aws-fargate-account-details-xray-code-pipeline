package suvigya.tutorials.aws.fargate.account_details_service.models;

import java.io.Serializable;

public class AccountDetails implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = -6881078337745299031L;
private long accountId;
private String accountHolderName;
private double accountBalance;
private String containerMetaData;
public long getAccountId() {
	return accountId;
}
public void setAccountId(long accountId) {
	this.accountId = accountId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
public String getContainerMetaData() {
	return containerMetaData;
}
public void setContainerMetaData(String containerMetaData) {
	this.containerMetaData = containerMetaData;
}




}
