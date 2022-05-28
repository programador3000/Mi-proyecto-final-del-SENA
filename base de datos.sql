drop database if exists proyecto ;
create database proyecto;
use  proyecto;

create table categoria(
					id_catego int primary key auto_increment,
                    nom_catego varchar(50),
                    descrip varchar(225),
                    estado varchar(20)
               
           
                    

);

create table producto(
					id_produ int primary key auto_increment,
                    id_catego_fk int,
                    nombre_produ varchar(100),
                    descripcion varchar(225),
                    precio_venta double,
                    uni_medi varchar(50),
                    foreign key(id_catego_fk) references categoria(id_catego)
);


create table cliente(
				id_clien int primary key auto_increment,
                nom_clien varchar(30),
                direcci_clien varchar(80),
                tel_clien varchar(20),
                email_clien varchar(100)
			
);


create table venta(
					id_venta int primary key auto_increment,
                    id_cliente_fk int,
                    valor double,
                    foreign key(id_cliente_fk) references cliente(id_clien)
);



create table detalle_venta(
					id_detalle_venta int primary key auto_increment,
                    id_venta_fk int,
                    id_produ_fk int,
                    cantidad int,
                    precio double,
                    descuento double,
                    foreign key (id_venta_fk) references venta(id_venta),
                    foreign key (id_produ_fk) references producto(id_produ)
);



create table repartidor(
				id_repar int primary key auto_increment,
                nom_repar varchar(30),
                doc_repar varchar(100),
                tel_repar varchar(15)
);
create table envio(
				id_envio int primary key auto_increment,
                id_venta_fk int,
                id_repar_fk int,
                fecha_envio varchar(255),
                foreign key(id_venta_fk) references venta (id_venta),
                foreign key(id_repar_fk) references repartidor (id_repar)
                
);

create table login(
				usuario varchar(250),
                contraseña varchar(250)
);
insert into login values('admin','admin');













