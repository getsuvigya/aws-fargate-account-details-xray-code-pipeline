package suvigya.tutorials.aws.fargate.account_details_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.xray.spring.aop.XRayEnabled;

import suvigya.tutorials.aws.fargate.account_details_service.metaDetaService.ContainerMetaDataService;
import suvigya.tutorials.aws.fargate.account_details_service.models.AccountDetails;
@XRayEnabled
@RestController
@RequestMapping("accountDetails/v1")
public class AccountDetailsController {
	@Autowired
	ContainerMetaDataService containerMetaDataService;
@RequestMapping(value="/accountDetails/{accountId}")
public AccountDetails getAccountDetails(@PathVariable("accountId") long accountId) {
	AccountDetails accountDetails = new AccountDetails();
	if(accountId==17061988) {
	accountDetails.setAccountBalance(150000);
	accountDetails.setAccountHolderName("RajeshFromAccountService");
	accountDetails.setAccountId(170619881);
	}
	else if(accountId==19876345) {
		accountDetails.setAccountBalance(90000);
		accountDetails.setAccountHolderName("RaviFromAccountService");
		accountDetails.setAccountId(198763451);
	}
	accountDetails.setContainerMetaData(containerMetaDataService.retrieveContainerMetadataInfo());
	return accountDetails;
	
}
}
