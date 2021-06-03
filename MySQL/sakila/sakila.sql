-- 1
select cu.first_name, cu.last_name, cu.email, ad.address from city ci
INNER JOIN address ad ON ci.city_id = ad.city_id
INNER JOIN customer cu ON cu.address_id = ad.address_id
where ci.city_id = 312;

-- 2
SELECT fi.title, fi.description, fi.release_year, fi.rating, fi.special_features, ca.name  FROM category ca
INNER JOIN film_category fc ON ca.category_id = fc.category_id
INNER JOIN film fi ON fc.film_id = fi.film_id
WHERE ca.name like 'comedy';

-- 3
select ac.actor_id AS Identificacion, concat(ac.first_name,' ',ac.last_name) AS Actor, fi.title AS Pelicula, fi.description AS Descipcion, fi.release_year AS 'Año Lanzamiento' from actor ac
INNER JOIN film_actor fa ON ac.actor_id = fa.actor_id
INNER JOIN film fi ON fa.film_id = fi.film_id
WHERE ac.actor_id = 5;

-- 4
select cu.first_name, cu.last_name, cu.email, ad.address  from customer cu 
INNER JOIN address ad ON cu.address_id = ad.address_id 
where cu.address_id in (
	select address_id from address a where a.city_id in (1,42,312,459)
	) and cu.store_id = 1;

-- 5
select fi.title, fi.description, fi.release_year, fi.rating, fi.special_features from film fi 
INNER JOIN film_actor fa ON fi.film_id = fa.film_id
INNER JOIN actor ac ON ac.actor_id = fa.actor_id
where fi.rating = "G" and fi.special_features like "%behind the scenes%" and ac.actor_id = 15;

-- 6
select fi.film_id, fi.title, ac.actor_id, concat(ac.first_name,' ', ac.last_name) AS 'Nombre Actor' from film fi
INNER JOIN film_actor fa ON fi.film_id = fa.film_id
INNER JOIN actor ac ON ac.actor_id = fa.actor_id 
WHERE fi.film_id = 369;

-- 7
select fi.film_id, fi.title, fi.description, fi.release_year, fi.rating, fi.special_features, ca.name, fi.rental_rate  from film fi
inner join film_category fc ON fi.film_id = fc.film_id
inner join category ca ON fc.category_id = ca.category_id
where ca.name like '%drama%' and fi.rental_rate = '2.99';

-- 8
select ac.actor_id, fi.film_id, fi.title, fi.description, fi.release_year, fi.rating, fi.special_features, ca.name, concat(ac.first_name,' ',ac.last_name) AS 'Nombre del Actor' from film fi
inner join film_category fc ON fi.film_id = fc.film_id
inner join category ca ON fc.category_id = fc.category_id
inner join film_actor fa on fa.film_id = fi.film_id
inner join actor ac ON ac.actor_id = fa.actor_id
where  ca.name = 'Action' and ac.first_name like '%Sandra%' and ac.last_name like '%kilmer%';


