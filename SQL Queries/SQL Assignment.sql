INSERT INTO Suppliers (SupplierID, Name, ContactInfo, Address) VALUES (1, 'Supplier A',
'contactA@example.com', 'Address A'), (2, 'Supplier B', 'contactB@example.com', 'Address B'), (3,
'Supplier C', 'contactC@example.com', 'Address C');
INSERT INTO Products (ProductID, Name, Description, SupplierID) VALUES (1, 'Product 1',
'Description 1', 1), (2, 'Product 2', 'Description 2', 1), (3, 'Product 3', 'Description 3', 2), (4, 'Product 4',
'Description 4', 3), (5, 'Product 5', 'Description 5', 3);
INSERT INTO Orders (OrderID, OrderDate, SupplierID) VALUES (1, '2024-07-01', 1), (2, '2024-07-05',
2), (3, '2024-07-10', 3), (4, '2024-07-15', 1), (5, '2024-07-20', 2);
INSERT INTO OrderDetails (OrderDetailID, OrderID, ProductID, Quantity, Price) VALUES (1, 1, 1, 10,
100), (2, 1, 2, 5, 200), (3, 2, 3, 15, 150), (4, 3, 4, 20, 250), (5, 3, 5, 25, 300), (6, 4, 1, 10, 100), (7, 4, 3, 5,
150), (8, 5, 2, 10, 200), (9, 5, 4, 15, 250);
INSERT INTO Inventory (InventoryID, ProductID, QuantityOnHand) VALUES (1, 1, 50), (2, 2, 30), (3, 3,
20), (4, 4, 15), (5, 5, 10);

			

-- 1. List all products along with their supplier names
select products.Name as productName,suppliers.Name as supplierName
from products 
join suppliers ;

-- 2. Get all orders with their details (including product names and quantities)
select *
from orders
join orderdetails
on orders.OrderID = orderdetails.OrderID
join products
on orderdetails.productId = products.productId;

-- 3. Find all suppliers who have supplied a specific product (e.g., ProductID = 1)

select suppliers.Name as SupplierName,productId 
from products
join suppliers
on products.supplierId = suppliers.supplierId
where productId=1;

-- 4. List all products and their current inventory levels
select products.name as productName, inventory.quantityonhand as inventoryLevel
from products
left join inventory
on inventory.productId=products.productId;


-- 5. Find all orders placed within the last month
select *
from orders
where orderdate >= (SELECT CURDATE() - INTERVAL 1 MONTH );

-- 6. Get total quantity ordered for each product
select products.productid, products.Name ,sum(quantity) as totalQuantityOrdered
from orderdetails
join products
on products.productId = orderdetails.productId
group by productId;

-- 7. Retrieve all orders along with the total amount spent for each order
select orders.orderId , sum(orderdetails.price* orderdetails.quantity) as totalAmount
from orders 
join orderdetails
on orderdetails.orderId = orders.orderId
group by orders.orderId ;

-- 8. Find products supplied by more than one supplier
select name, count( distinct supplierid) as supplierCount
from products
group by productid
having supplierCount >1;



-- 9. Get the average inventory level for each product

select p.productid,sum(i.quantityonhand)/count(p.productid) as averageInventory
from inventory i
join products p
on i.productid=p.productid
group by p.productid;

-- 10. List suppliers who have not supplied any products

select *
from suppliers
left join orders
on suppliers.supplierid = orders.supplierid
having orders.supplierid is null