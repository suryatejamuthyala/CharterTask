# Points Calculator based on customer transaction
#The rest API to get customer rewards based on customer Id

#A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.   A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).   Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total. 

- The package name is structured as com.retailer.rewards
- Exception is thrown if customer does not exists.
- H2 in-memory database to store the information.
- Please check doc file provided in the project
- Install H2 db locally and run it . change the db settings in application.properties file.
- Do run the scrip.sql on H2 in memory DB to prepare the test data.
- Please refer Calculator.docx - https://github.com/suryatejamuthyala/CharterTask/blob/master/calculator.pdf

```
 http://localhost:8080/customers/{customerId}/rewards
```

By `https://www.linkedin.com/in/suryatejamuthyala/`
