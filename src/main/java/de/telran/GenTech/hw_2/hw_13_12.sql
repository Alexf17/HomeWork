-- Вывести данные о товарах (название, цена со скидкой в 0.5%).
SELECT ProductName, Price*0.995 AS "Price - 0.05%"
FROM Products;

-- Вывести самый дорогой товар в диапазоне до 100 EUR.
SELECT * FROM Products
WHERE Price<100
ORDER BY Price DESC
Limit 1;

-- Вывести два самых дешевых товара из категории 4.
SELECT * FROM Products
WHERE CategoryID = 4
ORDER BY Price ASC
Limit 2;

-- Вывести один товар, который находится на пятом месте среди самых дорогих.
SELECT * FROM Products
ORDER BY Price DESC
Limit 1 Offset 4;