# Identification of Stakeholders
## Cool Software Solutions
- Private marketplace for left-over products
- The look and feel of the platform must fit with the existing e-commerce-suit (web-application)
- Have the platform as a product line in order to save money
- Existing frameworks and components from the online shop software must be reused if possible
- The platform must be included in every part of the product line, each of which having different configuration or newly developed software
- Different releases use the same assets
- The platform must use modern security standards
- A central server must be set up, so clients can use the platform as SaaS as well as a local service
## Pilot Client
### Sales Manager
- Products can be auctioned with the option to buy it instantly at a fixed price
- Users can see the status of their present and past sales and purchases
- Every user has their own credit score, based on their pending bills, preventing them from participating in too many auctions
- Intuitive interface -> no schooling of users
- Employees get 20% off
- Employees' purchases get subtracted from their paycheck
- Payment methods are:
  - Bill
  - Credit card
  - PayPal
- Wholesalers must choose between pick-up or shipping for their products
- A payment-processor like Saferpay or Datatrans must be implemented
### IT Manager
- Intuitive interface -> no schooling of users
- The platform must be easily editable
- The platform must be split into a frontend- and a backend-part
- A micro service architecture must be used to be able to make changes to single components quickly
## Users
- Core functionality accessible through REST API
- The platform must be developed to work on PC, tablet and smartphone
- The price of marketplace items must dynamically refresh without reloading the page
### Sellers
- Different auction types (e.g. sourcing action)
#### Companies
- Wholesalers must choose between pick-up or shipping for their products
- The platform must implement the company's
  - Authentication and authorization systems (single-sign-on)
  - Accounting system (transactions)
  - Inventory management (remaining stock)
  - Shipping system (sold products)
  - External payment-process using Datatrans or Saferpay (authorization and settlement)