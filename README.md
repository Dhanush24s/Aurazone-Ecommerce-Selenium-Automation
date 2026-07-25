# Aurazone E-Commerce Website Automation Testing

## Project Overview

This project automates the basic functionalities of the Aurazone E-Commerce Website using Selenium WebDriver and Java.

## Tools & Technologies

- Java
- Selenium WebDriver
- Maven
- Eclipse IDE
- Chrome Browser
- WebDriverManager

## Automated Test Cases

### TC001 - Verify Home Page
- Launch the website
- Verify the home page loads successfully

### TC002 - Search Product
- Click the search icon
- Search for "Trail Blazer"
- Verify the search is successful

### TC003 - Open Product Details
- Open the Trail Blazer product
- Verify the product details page opens

### TC004 - Add Product to Cart
- Open the product
- Click the Add to Cart button

### TC005 - Add Product to Wishlist
- Open the product
- Click the Wishlist (Heart) button

## Project Structure

```
AurazoneAutomation
│
├── src
│   └── test
│       └── java
│           └── test
│               └── AurazoneAutomationTest.java
│
├── pom.xml
└── README.md
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse.
3. Update Maven dependencies.
4. Run `AurazoneAutomationTest.java`.

## Author

Dhanush Kumar S