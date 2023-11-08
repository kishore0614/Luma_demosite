Feature: Luma Shopping Automated

Scenario: User in Signin ioto Application
Given User Launch the url
When User click Login
And User Enter the Username
And User Enter the Password  
And User Click the Signin 
Then Next page shown (Page02)



Scenario: User select Menwear Page

When User click Men
And User click Hoodie
Then Next page shown (Page03)



Scenario: User Adding Hoodie into the cart

When User select Size
And User select Color  
And User click the Added to cart
Then Next page shown (Page04)


Scenario: Checkout process

And User click Items
And User click Checkout
Then Next page shown (Page05)



Scenario: User Confirm The Order

When User click the Checkout
And User click Next
Then Next page shown (Page06)



Scenario: Last Page Of Application

When User click Place Order
Then Next page shown (Page07) 