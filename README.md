# Cucumber2ndGroup2025


## Overview

This repository contains a Cucumber BDD automation framework for testing the Product Store application.
The framework is built using Java, Selenium, and Cucumber, following the Page Object Model (POM) design pattern.
...
## Features

BDD with Cucumber – Feature files written in Gherkin for readability.

Page Object Model (POM) – Separates test logic from UI interactions.

Cross-browser support – Managed via BrowserFactory.

Data-driven testing – Test data managed via Excel (ExcelReader).

Reusable utilities – Configuration management and reporting.

Reports – Integrated ExtentReports for execution reports.


## Project Structure

src/test/java
│
├── Pages
│   ├── CartPage.java
│   ├── HomePage.java
│   └── PlaceOrderPage.java
│
├── Runner
│   └── runner.java              # Cucumber test runner
│
├── Steps
│   ├── Base.java                 # Common setup/teardown
│   └── stepDef.java              # Step definitions
│
├── Utils
│   ├── BrowserFactory.java       # Browser setup (Chrome, Firefox, etc.)
│   ├── ConfigureReader.java      # Reads config (e.g., properties file)
│   └── ExcelReader.java          # Reads test data from Excel
│
└── resources
├── Data
│   └── LaptopOrderData.xlsx  # Test data for scenarios
├── extent.properties         # ExtentReports configuration
└── ProductStore.feature      # Sample feature file

...

## Tools & Technologies

Java 11+

Selenium WebDriver

Cucumber (BDD with Gherkin)

Maven (build & dependency management)

ExtentReports (reporting)

JUnit/TestNG (test execution)

Apache POI (Excel handling)

## Setup

1. Clone the repository:
git clone https://github.com/yourusername/Cucumber2ndGroup2025.git
2. Navigate to the project directory:
3. Build the project using Maven:

```bash
## Running Tests

To run Cucumber tests:

## Project Structure

- `src/main/java` - Application source code
- `src/test/java` - Test code (Cucumber step definitions, runners, etc.)
- `src/test/resources` - Feature files

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

#Created:
Aphiwe Njongo