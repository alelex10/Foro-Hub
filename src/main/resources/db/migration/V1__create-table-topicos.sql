
create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(100) not null,
--      default: Esta palabra clave indica que se establecerá un valor predeterminado para la columna si no se proporciona un valor explícito al insertar un registro en la tabla.
--      current_timestamp: Es una función que devuelve la fecha y hora actuales del sistema en el que se ejecuta la base de datos. Esta función se utiliza como valor predeterminado para la columna fecha_creacion.
--      En resumen, esta colum
    fecha_creacion timestamp default current_timestamp,
    primary key(id)

);
