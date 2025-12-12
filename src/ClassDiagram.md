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