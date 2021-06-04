use lead_gen_business2;

-- 1
select sum(amount) as 'Total Ingresos', monthname(charged_datetime) as Mes from billing
where month(charged_datetime) = 3 and year(charged_datetime) = 2012; 

-- 2
select concat(c.first_name, ' ', c.last_name) as Cliente, sum(amount) as 'Total Recaudado' from billing b
inner join clients c ON b.client_id = c.client_id
where c.client_id = 2;

-- 3
select c.client_id, s.domain_name from clients c
inner join sites s ON c.client_id = s.client_id
where c.client_id = 10;

-- 4
select sites.client_id as Cliente,count(distinct(sites.domain_name)) as 'Sitios', concat(month(sites.created_datetime),' ', year(sites.created_datetime))  from leads 
inner join sites ON leads.site_id = sites.site_id
    where sites.site_id in 
	(select site_id from sites where client_id = 1) 
    group by month(sites.created_datetime), year(sites.created_datetime)
    order by sites.created_datetime;

-- 5
select s.domain_name as website, count(l.site_id), concat(monthname(l.registered_datetime),' ',date_format(l.registered_datetime,"%d"),', ', year(l.registered_datetime)) as Fecha from clients c
inner join sites s on c.client_id = s.client_id
inner join leads l on s.site_id = l.site_id
where l.registered_datetime >= '2011/01/01' AND l.registered_datetime < '2011/02/15'
group by s.domain_name;


-- 6
select concat(c.first_name,' ',c.last_name) as cliente, count(c.client_id) from clients c
inner join sites s on c.client_id = s.client_id
inner join leads l on l.site_id = s.site_id
where l.registered_datetime >= '2011/01/01' and l.registered_datetime <= '2011/12/31'
group by c.client_id;

-- 7 

select distinct(concat(c.first_name,' ',c.last_name)) as cliente,  monthname(l.registered_datetime) as mes  from clients c
inner join sites s on c.client_id = s.client_id
inner join leads l on l.site_id = s.site_id
where l.registered_datetime >= '2011/01/01' and l.registered_datetime <= '2011/12/31'
group by c.client_id;

-- 8

select concat_ws(' ',c.first_name, c.last_name) as Client_Name, s.domain_name, count(s.domain_name),
	concat(monthname(l.registered_datetime),' ',date_format(l.registered_datetime,"%d"),', ', year(l.registered_datetime)) as Fecha
	from clients c 
inner join sites s on c.client_id = s.client_id
inner join leads l on s.site_id = l.site_id
where l.registered_datetime >= '2011/01/01' and l.registered_datetime <= '2011/12/31'
group by s.domain_name
order by client_name;

select concat_ws(' ',c.first_name, c.last_name) as Client_Name, s.domain_name, count(s.domain_name) as number_of_leads	from clients c 
inner join sites s on c.client_id = s.client_id
inner join leads l on s.site_id = l.site_id
group by s.domain_name
order by client_name, number_of_leads desc;

-- 9
select concat_ws(' ',c.first_name,c.last_name) as Cliente, sum(b.amount) as Total_Revenue, monthname(b.charged_datetime) as Mes, year(b.charged_datetime) as year_charge from clients c
inner join billing b on c.client_id = b.client_id
group by cliente, year_charge, mes
order by cliente;

-- 10
select concat_ws(' ',c.first_name,c.last_name) as Cliente, group_concat(distinct(s.domain_name) separator " / ") from clients c
inner join sites s on c.client_id = s.client_id
inner join leads l on s.site_id = l.site_Id
group by c.client_id
order by c.first_name;









