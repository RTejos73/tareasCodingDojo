select * from venta;

select * from producto;

select * from venta_producto;



SET @cventa = 5;
select v.id_venta AS 'Venta Nro', sum(p.precio) AS 'Total Venta', count(distinct vp.id_producto) AS 'Cant Productos' from venta v
JOIN venta_producto vp ON v.id_venta = vp.id_venta
JOIN producto p ON p.id_producto = vp.id_producto
WHERE v.id_venta = @cventa;

select v.id_venta AS 'Venta Nro', sum(p.precio) AS 'Total Venta', count(vp.id_producto) AS 'Cant Productos' from venta v
JOIN venta_producto vp ON v.id_venta = vp.id_venta
JOIN producto p ON p.id_producto = vp.id_producto
WHERE v.id_venta = @cventa;

INSERT INTO producto (codigo, nombre, descripcion, precio, cantidad) VALUES ('006','Maizena','Maizena, Almidon de Maiz caja 250gr',2000,15);
INSERT INTO producto (codigo, nombre, descripcion, precio, cantidad) VALUES ('007','Quick','Lavaloza Quick borella 250ml',180,25);
INSERT INTO producto (codigo, nombre, descripcion, precio, cantidad) VALUES ('008','Semola','Semola Lucchetti 100% trigo 250gr',1200,30);
INSERT INTO producto (codigo, nombre, descripcion, precio, cantidad) VALUES ('009','Arroz','Arroz Primavera bolsa 1 kilo Miraflores',1000,45);
INSERT INTO producto (codigo, nombre, descripcion, precio, cantidad) VALUES ('010','Cafe','Cafe instantaneo Liofilizado Juan Valdez 50gr',6500,50);

INSERT INTO venta (folio,fecha) VALUES ('v003tem',now());
INSERT INTO venta_producto (id_venta, id_producto) VALUE (3,4);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (3,4);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (3,4);
UPDATE producto SET cantidad = cantidad - 3 where id_producto = 4;
INSERT INTO venta (folio,fecha) VALUES ('v004tem',now());
INSERT INTO venta_producto (id_venta, id_producto) VALUE (4,5);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (4,5);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (4,7);
UPDATE producto SET cantidad = cantidad - 2 where id_producto = 5;
UPDATE producto SET cantidad = cantidad - 1 where id_producto = 7;
INSERT INTO venta (folio,fecha) VALUES ('v005tem',now());
INSERT INTO venta_producto (id_venta, id_producto) VALUE (5,6);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (5,9);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (5,10);
INSERT INTO venta_producto (id_venta, id_producto) VALUE (5,10);
UPDATE producto SET cantidad = cantidad - 1 where id_producto = 6;
UPDATE producto SET cantidad = cantidad - 1 where id_producto = 9;
UPDATE producto SET cantidad = cantidad - 2 where id_producto = 10;





