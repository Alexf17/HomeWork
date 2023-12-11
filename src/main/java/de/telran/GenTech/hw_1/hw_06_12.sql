-- Вывести название и стоимость товаров от 20 до 150 EUR

SELECT 
ProductName,
Price
FROM Products
WHERE
	Price >= 20
	AND
	Price <= 150

-- Вывести страны поставщиков, кроме тех, что из USA
SELECT 
Country
FROM Suppliers
WHERE 
    NOT Country = 'USA'

-- Вывести перевозчика с ID 1
SELECT * FROM Shippers
WHERE
    ShipperID = 1

-- Вывести контактные имена клиентов, кроме тех, что из France и USA

SELECT 
ContactName
FROM Customers
WHERE 
    NOT Country = 'France'
AND
	NOT Country = 'USA'

-- Вывести страну, город и адрес всех поставщиков, кроме тех, что из Japan и Brazil

SELECT 
Country,
City,
Address
FROM Suppliers
WHERE
    NOT Country = 'Japan'
AND
	NOT Country = 'Brazil'