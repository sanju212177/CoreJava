package com.capgemini.Feb10;

public class question {

}
/*
 * A leading Bank is looking out solution providers to build an IT system which can help them to 
 * run their business online. To begin with, the bank wants to automate part of its functionalities 
 * related to online transfers. Develop a software component that can do the following:  
	
Current account customers do many online transfers as part of their business transactions. 

There are two types of transfers 

IMPS		
NEFT 
	
Each Customer should be able to view their online transfers and charge according to the type of 
transfers. 

Skeleton File for Development:  

Import the below attached skeleton code into your eclipse project and implement the required 
functionalities : 

Transfer.java 
TransferService.java 
TransferMain.java 

 Technical Requirements:  

You are required to develop an App which can provide the following service.  

API 1 (Requirement 1): Write Java class Transfer with below member variables:   

transferId of type String, transferType of type String, charge of type double, 
amount of type double, total of type double;  

Define a public parameterized constructor with all the above variables in the same order of 
parameters, along with getter and setter methods.   

Add a 3 parameter constructor Transfer(transferId,transferType,amount) 

API2(Requirement 2): Create another class TransferService and write the below public methods:  

ClassName  
Method Name  
Input Parameters  
Output Parameters  
Logic  

TransferService  
setTransferCharge()  
Transfer transfer  
 
Take the transfer object. Depending on the above type of transfer, apply the charges and setCharge 

TranferService  
setTransferTotal() 
Transfer transfer  
  
Take the transfer object.  add the charges to the amount and setTotal 

TranferService  
segregateTransfers() 
List transferList 
 
Take two instance variables impsList and neftList of type list. Iterate through the transferList 
and add them to particular type of list. 

TranferService  
DisplayList() 
              - 
- 
Display the lists separately with appropriate headings. 





  



Business Rules:  



 


 
IMPS 
NEFT 

<25000 
5 
50 

>=25000 and <=100000 
10 
150 

>100000 
15+10 for each 25000 above 
250+50 for each 25000 above 





  



API 3(Requirement 3): 



Create TransferMain.java and test the methods in TransferService class. 
 */

