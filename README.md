Discount calculator
Run the project, the server runs on 8090. Use postman or any rest client and use this request and basic Authorization.

Username :payit
password: fab

{"sBillnumber": "1","sCustomerId":"vinil@gmail.com","dAmount":"200",
"itemVo":[{"sName":"23445","skuType":"E","quantity":"1","dSellingPrice":"200"}]}

and post on the URL http://localhost:8090/discount 
skuType in the request json meant type of the item { G -> Grocery, E-> Electronics, etc}.
The in memory H2 database is created with 3 customers and different type for them EMPLOYEE (3), AFFILIATE(2), OTHER(1)

The discount applied based on the below.
1.	If the user is an employee of the store, he gets a 30% discount
2.	If the user is an affiliate of the store, he gets a 10% discount
3.	If the user has been a customer for over 2 years, he gets a 5% discount. If the customer does not fall in any of the above then
4.	For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount).
5.	The percentage based discounts do not apply on groceries.
6.	A user can get only one of the percentage based discounts on a bill.
The response is the new payable amount(after deducting the discount) with Http status 200.

* For sand box tesing run the com.fab.retaildiscount.discountcalculator.bodaoimp. DiscontBoDaoTest class provides basic level of unit testing.


