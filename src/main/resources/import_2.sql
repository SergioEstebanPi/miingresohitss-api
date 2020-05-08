/* tabla bodega */

INSERT INTO bodega (id_bodega,direccion_bodega,nombre_bodega) VALUES (1,'Cll 1 # 2 - 3','Sede 1');

INSERT INTO bodega (id_bodega,direccion_bodega,nombre_bodega) VALUES (2,'Cll 2 # 2 - 3','Sede 2');

INSERT INTO bodega (id_bodega,direccion_bodega,nombre_bodega) VALUES (3,'Cll 3 # 2 - 3','Sede 3');

INSERT INTO bodega (id_bodega,direccion_bodega,nombre_bodega) VALUES (4,'Cll 4 # 2 - 3','Sede 4');

INSERT INTO bodega (id_bodega,direccion_bodega,nombre_bodega) VALUES (5,'Cll 5 # 2 - 3','Sede 5');


/* tabla producto */

INSERT INTO producto (id_producto,descripcion_producto,estado_producto,fabricante,foto_producto,meses_garantia,nombre_producto,precio_minimo,unidad_medida) VALUES (1,'Audifonos inalámbrico','ACT','Beats','/path',12,'Beats Solo 3 Wireless',150000,'unidad');

INSERT INTO producto (id_producto,descripcion_producto,estado_producto,fabricante,foto_producto,meses_garantia,nombre_producto,precio_minimo,unidad_medida) VALUES (2,'Best movil MAC','ACT','MAC','/path',24,'Apple iPad',170000,'unidad');

INSERT INTO producto (id_producto,descripcion_producto,estado_producto,fabricante,foto_producto,meses_garantia,nombre_producto,precio_minimo,unidad_medida) VALUES (3,'Alcatel 1s','ACT','Alcatel modelo 2019','/path',48,'Alcatel',330000,'unidad');


/* tabla descuento */

INSERT INTO descuento (id_descuento,fecha_final,fecha_inicial,porcentaje,id_producto) VALUES (1,'10/07/2022','02/02/2010',0.6,1);

/* tabla inventario */

INSERT INTO inventario (id_inventario,cantidad_disponible,id_bodega,id_producto) VALUES (1,200,1,1);

INSERT INTO inventario (id_inventario,cantidad_disponible,id_bodega,id_producto) VALUES (2,500,1,2);

INSERT INTO inventario (id_inventario,cantidad_disponible,id_bodega,id_producto) VALUES (3,280,2,2);

INSERT INTO inventario (id_inventario,cantidad_disponible,id_bodega,id_producto) VALUES (4,300,1,2);


/* tabla cliente */

INSERT INTO cliente (id_cliente,apellidos_cliente,contrasena,correo,direccion_cliente,documento,fecha_nacimiento,foto_cliente,genero,nombres_cliente,telefono,tipo_documento) VALUES (1,'Ramirez','1234','1@hotmail.com','Cra 1 # 2 - 3','1020332544','02/05/1980','/path','M','Pedro José','3205558012','CC');

INSERT INTO cliente (id_cliente,apellidos_cliente,contrasena,correo,direccion_cliente,documento,fecha_nacimiento,foto_cliente,genero,nombres_cliente,telefono,tipo_documento) VALUES (2,'Ortegon','1234','2@hotmail.com','Cra 2 # 2 - 3','1020332545','02/05/1982','/path','F','Jimena Katherine','3205558013','CC');

INSERT INTO cliente (id_cliente,apellidos_cliente,contrasena,correo,direccion_cliente,documento,fecha_nacimiento,foto_cliente,genero,nombres_cliente,telefono,tipo_documento) VALUES (3,'Jimenez','1234','3@hotmail.com','Cra 3 # 2 - 3','1020332546','02/05/1984','/path','F','Andrea Martiza','3205558014','CC');

/* tabla mediopago */

INSERT INTO medio_pago (id_medio_pago,codigo_postal,codigo_verificacion,nombre_tarjeta,numero_tarjeta,valida_hasta,id_cliente) VALUES (1,'15003','654','Jorge Peralta','1234668534549878','02/26',1);

INSERT INTO medio_pago (id_medio_pago,codigo_postal,codigo_verificacion,nombre_tarjeta,numero_tarjeta,valida_hasta,id_cliente) VALUES (2,'15003','653','Jorge Peralta','1234668534549879','02/28',1);

INSERT INTO medio_pago (id_medio_pago,codigo_postal,codigo_verificacion,nombre_tarjeta,numero_tarjeta,valida_hasta,id_cliente) VALUES (3,'15003','654','Andrea Perez','1234668534549871','02/26',2);

INSERT INTO medio_pago (id_medio_pago,codigo_postal,codigo_verificacion,nombre_tarjeta,numero_tarjeta,valida_hasta,id_cliente) VALUES (4,'15003','653','Andrea Perez','1234668534549872','02/28',2);

INSERT INTO medio_pago (id_medio_pago,codigo_postal,codigo_verificacion,nombre_tarjeta,numero_tarjeta,valida_hasta,id_cliente) VALUES (5,'15003','125','Andrea Perez','0000668534549871','02/26',3);


/* tabla venta */

INSERT INTO venta (id_venta,estado_venta,fecha_venta,valor_total,id_cliente,id_medio_pago) VALUES (1,'TER','12/05/2019',500000,1,1);

INSERT INTO venta (id_venta,estado_venta,fecha_venta,valor_total,id_cliente,id_medio_pago) VALUES (2,'TER','06/11/2019',200000,1,1);

INSERT INTO venta (id_venta,estado_venta,fecha_venta,valor_total,id_cliente,id_medio_pago) VALUES (3,'TER','06/11/2018',1000000,2,3);

/* tabla detalleventa */

INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (1,2,200000,1,1);

INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (2,1,100000,2,1);


INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (3,2,50000,1,2);


INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (4,1,50000,3,2);



INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (5,1,500000,1,3);

INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (6,1,250000,2,3);

INSERT INTO detalle_venta (id_detalle_venta,cantidad_venta,valor_unitario,id_producto,id_venta) VALUES (7,1,250000,3,3);