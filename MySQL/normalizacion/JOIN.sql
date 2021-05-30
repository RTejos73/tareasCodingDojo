use lead_gen_business;

SELECT c.first_name, c.last_name, b.amount, b.charged_datetime FROM clients c
JOIN billing b on c.id = b.id;

SELECT s.domain_name, l.first_name, l.last_name   FROM sites s
JOIN leads l ON s.id = l.id;

SELECT c.first_name AS cients_first, c.last_name AS clients_last, s.domain_name, l.first_name AS leads_first
FROM clients c
JOIN sites s ON s.id = c.id
JOIN leads l ON l.id = s.id;


SELECT c.first_name, c.last_name, s.domain_name FROM clients c
LEFT JOIN sites s ON c.id = s.id;


SELECT c.first_name, c.last_name, sum(b.amount) AS suma FROM clients c
JOIN billing b ON c.id = b.id
GROUP BY c.id;


SELECT group_concat('  ', s.domain_name) , c.first_name, c.last_name FROM clients c
JOIN sites s ON c.id = s.clients_id
GROUP BY c.id;

SELECT count(l.id) as cant, s.domain_name FROM sites s
JOIN leads l ON s.id = l.sites_id
GROUP BY s.id;


select * from sites order by clients_id;