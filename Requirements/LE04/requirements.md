# Requirements
## Vision
### Priority
- Private marketplace for left-over products
- Products can be auctioned with the option to buy it instantly at a fixed price
- Users can see the status of their present and past sales and purchases
- Every user has their own credit score, based on their pending bills, preventing them from participating at too many auctions
- Intuitive interface -> no schooling of users
- Employees get 20% off
- Employees' purchases get subtracted from their paycheck
- Payment methods are:
  - Bill
  - Credit card
  - PayPal
- Wholesalers must choose between pick-up or shipping for their products
- The look and feel of the platform must fit with the existing e-commerce-suit (web-application)
### Future
- Different auction types (e.g. sourcing action)
---
## Hopes and Dreams
- 50% more revenue
- 80% of left-over products sold in 2 weeks
- Have the platform as a product line in order to save money
- Existing frameworks and components from the online shop software must be reused if possible
---
## Development Requirements
- The platform must be easily editable
- The platform must implement the company's
  - Authentication and authorization systems (single-sign-on)
  - Accounting system (transactions)
  - Inventory management (remaining stock)
  - Shipping system (sold products)
  - External payment-process using Datatrans or Saferpay (authorization and settlement)
- The platform must be developed as a product line
- The platform must be included in every part of the product line, each of which having different configuration or newly developed software
- Different releases use the same assets
- Core functionality accessible through REST API
- The platform must be developed to work on PC, tablet and smartphone
- The platform must be split into a frontend- and a backend-part
- The platform must use modern security standards
- The price of marketplace items must dynamically refresh without reloading the page
- A payment-processor like Saferpay or Datatrans must be implemented
- A central server must be set up, so clients can use the platform as SaaS as well as a local service
- A micro service architecture must be used to be able to make changes to single components quickly
---
## Product Line Variability Requirements
- Private or public marketplace
- Either a single seller for private auctions or multiple ones for public auctions
- Authentication and authorization
- Branding of the website
- Categories and subcategories for products
- Transaction fees (percentage, fixed, etc)
- Delivery options (by pick-up, by mail, etc)
- Seller rating (for public marketplace)
- Notifications for sellers and buyers after the completion of an auction
- Import of auction products
- Payment options (cash, bill, credit card, paypal, etc)