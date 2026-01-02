useCaseDiagram
actor com.foodordering.Customer
usecase "View Menu" as UC1
usecase "Add Items to Cart" as UC2
usecase "Place com.foodordering.Order" as UC3
usecase "Process com.foodordering.Payment" as UC4

    com.foodordering.Customer --> UC1
    com.foodordering.Customer --> UC2
    com.foodordering.Customer --> UC3
    com.foodordering.Customer --> UC4