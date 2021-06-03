SELECT * FROM amigos.users;

-- 1
select u.first_name, u.last_name, u2.first_name, u2.last_name from users u 
inner join friendships f ON u.id = f.user_id
inner join users u2  ON f.friend_id = u2.id
where u.id = f.user_id; 



