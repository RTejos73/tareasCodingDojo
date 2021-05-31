use world;

/*1 */ 
select c.name, l.language, l.percentage  from countries c
JOIN languages l ON c.code = l.country_code
WHERE l.language = "Slovene"
order by l.percentage DESC;

/*2*/
select p.name, count(*) AS cities
from countries p
left join cities c ON p.code = c.country_code
group by p.name
order by cities desc;

/*3*/
select co.name, ci.name, ci.population from countries co
left join cities ci ON co.code = ci.country_code
where ci.population > 500000 and co.code = 'mex'
order by ci.population desc;

/*4*/
select co.name, l.language, l.percentage from countries co
join languages l ON co.code = l.country_code
where l.percentage > 89
group by co.name
order by l.percentage desc;

/*5*/
select name, surface_area, population from countries
where surface_area < 501 and population > 100000;

/*6*/
select name, government_form, capital, life_expectancy from countries
where government_form = 'Constitutional Monarchy'
	and capital > 200 and life_expectancy > 75;

/*7*/
select co.name, ci.name, ci.district, ci.population from countries co
join cities ci ON co.code = ci.country_code
where ci.district = 'Buenos Aires' and ci.population > 500000;

/*8*/
select region, count(name) AS Cantidas_de_Paises
from countries
group by region
order by  Cantidas_de_Paises desc;
