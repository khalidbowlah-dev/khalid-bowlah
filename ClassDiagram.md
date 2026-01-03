classDiagram
com.foodordering.User <|-- com.foodordering.Customer : extends
class com.foodordering.Restaurant {
-List~MenuItem~ menu
+addMenuItem(MenuItem item)
+displayMenu()
+loadMenuFromCSV(String filename)
}
com.foodordering.Restaurant *-- com.foodordering.MenuItem : contains
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