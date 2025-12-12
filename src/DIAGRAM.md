# Project UML Diagrams

## 1. Class Diagram
```mermaid
classDiagram
    User <|-- Customer : extends
    Orderable <|.. MenuItem : implements
    Payment <|-- CashPayment : extends
    Payment <|-- CreditCardPayment : extends
    
    class Payment {
        +processPayment()
    }
    class MenuItem {
        -double price
        +getPrice()
    }
    class Customer {
        +Cart myCart
    }
```

## 2. Use Case Diagram
```mermaid
useCaseDiagram
    actor Customer
    usecase "View Menu" as UC1
    usecase "Add Items to Cart" as UC2
    usecase "Place Order" as UC3
    usecase "Process Payment" as UC4
    
    Customer --> UC1
    Customer --> UC2
    Customer --> UC3
    Customer --> UC4
```