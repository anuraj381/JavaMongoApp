APIs

To save a order:
POST 'http://localhost:8080/orders'<br />
With body : {"name" : "order1", "items" : "table, fridge", "account_number" : "ac_0124"}<br />
and header : 'Content-Type: application/json'

To update orders:<br />
PUT 'http://localhost:8080/orders/{order_id}'<br />
With body : {"name" : "order1", "items" : "table, fridge, fan", "account_number" : "ac_0125"}<br />
and header : Content-Type : application/json<br />

To fetch order details:<br />
GET 'http://localhost:8080/orders/{order_id}'<br />

To delete a order:<br />
DELETE 'http://localhost:8080/orders/{order_id}'<br />

where order can be like - 5aecef5b6d55754834124df3
