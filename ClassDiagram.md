classDiagram
com.foodordering.User <|-- com.foodordering.Customer : extends
com.foodordering.Orderable <|.. com.foodordering.MenuItem : implements
com.foodordering.Payment <|-- com.foodordering.CashPayment : extends
com.foodordering.Payment <|-- com.foodordering.CreditCardPayment : extends

    class com.foodordering.Payment {
        +processPayment()
    }
    class com.foodordering.MenuItem {
        -double price
        +getPrice()
    }
    class com.foodordering.Customer {
        +Cart myCart
    }