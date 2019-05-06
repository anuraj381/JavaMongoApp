APIs

To save a order:
POST 'http://localhost:8080/orders'
With body : {"name" : "order1", "items" : "table, fridge", "account_number" : "ac_0124"}
and header : 'Content-Type: application/json'

To update orders: 
PUT 'http://localhost:8080/orders/{order_id}'
With body : {"name" : "order1", "items" : "table, fridge, fan", "account_number" : "ac_0125"}
and header : Content-Type : application/json

To fetch order details:
GET 'http://localhost:8080/orders/{order_id}'

To delete a order:
DELETE 'http://localhost:8080/orders/{order_id}'

where order can be like - 5aecef5b6d55754834124df3