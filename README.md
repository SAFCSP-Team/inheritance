# Inheritance


**Objectives**

In this project, you can create a system to manage bank accounts using object-oriented principles.

**Concepts**

| Concept   |      Resources      |
|----------|:-------------:|
|Concept of a package |  [Concept of a package ](https://github.com/nourabyte/high-level-language/blob/main/resources/what-is-a-package.md) |
|Tutorial about Package      |    [What is a package](https://www.youtube.com/watch?v=Bua6LQO2vQ8)  |


**Problem**

Understand Hierarchy by using inheritance.


**Implementation**
1. Bank (Main class)
* Properties: accounts: A collection to store and manage multiple accounts. 
* Methods:
  * Create a new account and add it to the collection.
  * Retrieve an account from the collection based on the account number.
  * deposit(accountNumber, amount): Deposit the specified amount into the account.
2. Account
* Properties: accountNumber and balance.
* Methods:
  * deposit(amount): Add the specified amount to the account balance.
  * Retrieve the account number.
  * Subtract the specified amount from the account balance.
  * Retrieve the account balance.

 3. SavingsAccount (Derived class)

Properties:
interestRate: The interest rate for the savings account.
Methods:
calculateInterest(): Calculate and add interest to the account balance based on the interest rate.
4. CurrentAccount (Derived class)
* Properties: overdraftLimit.
Methods:
  * `Override` the withdraw(amount) method to consider the overdraft limit.



```Java


```

