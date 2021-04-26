SELECT * from USUARIO u Where u.nombre LIKE '%a%';
SELECT * from USUARIO u where u.id BETWEEN 1 and 10;
SELECT u.nombre,r.descripcion,r.nivel from USUARIO u 
join usuario_rol ur on u.id = ur.id_usuario 
join rol r on r.id = ur.id_rol;

SELECT u.nombre,r.descripcion,r.nivel from USUARIO u 
join usuario_rol ur on u.id = ur.id_usuario 
join rol r on r.id = ur.id_rol
where r.nivel = (SELECT min(r2.nivel) from rol r2);
