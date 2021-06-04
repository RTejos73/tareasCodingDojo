use lead_gen_business2;

-- 1
select sum(amount) as 'Total Ingresos', monthname(charged_datetime) as Mes from billing
where month(charged_datetime) = 3;

-- 2
select concat(c.first_name, ' ', c.last_name) as Cliente, sum(amount) as 'Total Recaudado' from billing b
inner join clients c ON b.client_id = c.client_id
where c.client_id = 2;

-- 3




