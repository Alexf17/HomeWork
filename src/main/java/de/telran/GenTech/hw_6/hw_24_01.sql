-- Вывести заказы со стоимостью от 5000 EUR (проекция: номер_заказа, стоимость_заказа)
SELECT OrderID , sum(Quantity*Products.Price) AS sum_of_order
FROM OrderDetails
JOIN Products ON Products.ProductID = OrderDetails.ProductID
GROUP BY OrderID
HAVING sum_of_order >= 5000;

-- Вывести страны, в которые было отправлено 3 и более заказов
SELECT Customers.Country, COUNT(*) AS orders_count
FROM Orders
JOIN  Customers ON Customers.CustomerID=Orders.CustomerID
GROUP BY Customers.Country
HAVING orders_count >=3;

-- Вывести ТОП-10 самых продаваемых товаров (проекция: название_товара, ко_во_проданных_единиц)
SELECT Products.ProductName, Quantity
FROM OrderDetails
JOIN Products ON Products.ProductID = OrderDetails.ProductID
GROUP BY OrderDetails.ProductId
ORDER BY Quantity DESC
LIMIT 10;

-- Расчитать З/П менеджеров (ставка - 5% от суммы проданных заказов)
SELECT EmployeeID , sum(OrderDetails.Quantity*Products.Price)*0.05 AS salary
FROM Orders
JOIN OrderDetails ON OrderDetails.OrderID = Orders.OrderID
JOIN Products ON Products.ProductID = OrderDetails.ProductID
GROUP BY EmployeeID;