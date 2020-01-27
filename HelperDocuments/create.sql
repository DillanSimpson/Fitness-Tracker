CREATE TABLE workouts (workout_id int, workout_name varchar(255), description varchar(255), length varchar(255));
CREATE TABLE users (user_id int, first_name varchar(255), last_name varchar(255), email varchar(255), age int, sex varchar(255), 
height int, weight double, plan_id int, plan_name varchar(255), calories_max int, calories_min int, sugar_max int, 
carbs_max int, fat_max int, workout_frequency int);
CREATE TABLE food_log (id int, food_name varchar(255), calories int, sugar int, carbs int, fat int);
CREATE TABLE workout_plans (plan_id int, plan_name varchar(255)); 