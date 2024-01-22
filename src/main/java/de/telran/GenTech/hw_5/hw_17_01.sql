-- Вывести сред/стоимость товаров из категорий 1, 2, 5, у которых название начинается с буквы t
SELECT
    avg(Price) as avg_price
FROM Products
where ProductName like "t%";

-- Посчитать стоимость заказа 10248
SELECT
    sum(Products.Price*Quantity) as sum
FROM OrderDetails
    join Products on OrderDetails.ProductID = Products.ProductID
where OrderID = 10248;


-- Вывести ко-во товаров с ценой от 10 до 250 EUR
SELECT count(*)
FROM Products
where Price >10 && Price <250;

-- Вывести сумму, на которую было отправлено товаров клиентам в Germany
SELECT
    sum(Products.Price*Quantity) as sum
FROM OrderDetails
    join Products on OrderDetails.ProductID = Products.ProductID
    join Orders on OrderDetails.OrderID = Orders.OrderID
    join Customers on Orders.CustomerID = Customers.CustomerID
where Customers.Country = "Germany";


-- С помощью инструмента онлайн-проектирования опишите схему БД "чат поддержки" (базовые сущности и характеристики)
https://dbdiagram.io/d/chat-65aeac53ac844320ae77737f