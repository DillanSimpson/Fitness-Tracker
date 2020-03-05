/*Create Schema*/
DROP SCHEMA IF EXISTS fitnesstracker;
CREATE SCHEMA fitnesstracker;
USE fitnesstracker;

/*Create Tables*/
CREATE TABLE users (id int NOT NULL AUTO_INCREMENT, username character(50) NOT NULL, password character(50) NOT NULL, enabled boolean NOT NULL, PRIMARY KEY (id));
CREATE TABLE authorities (username character(50) NOT NULL, authority character(50) NOT NULL);
CREATE TABLE workouts (workout_id int, workout_type varchar(255), category varchar(255), workout_name varchar(255), description varchar(255), length varchar(255));
CREATE TABLE users_data (user_id int NOT NULL AUTO_INCREMENT, first_name varchar(255), last_name varchar(255), username varchar(255), age int, sex varchar(255),
 height int, weight int, calories_max int, calories_min int, carbs_max int, fat_max int, sugar_max int, protein_max int,
 protein_min int, workout_frequency int, plan_id int, workout_id int, date_created date, PRIMARY KEY (user_id));
CREATE TABLE food_log (id int, food_name varchar(255), calories int, carbs float, fat float, sugar float, protein float, user_id int);
CREATE TABLE workout_plans (plan_id int, plan_name varchar(255));  
CREATE TABLE workout_log (workout_id int, reps int, weight int, sets int, distance float, user_id int); 

/*Insert Data*/
INSERT INTO `fitnesstracker`.`users_data` (`first_name`, `last_name`, `username`, `age`, `sex`, `height`, `weight`, `calories_max`, `calories_min`, `carbs_max`, `fat_max`, `sugar_max`, `protein_max`, `protein_min`, `workout_frequency`, `plan_id`, `workout_id`, `date_created`) VALUES ('Joe', 'Goldberg', 'joe.goldberg@gmail.com', '27', 'MALE', '72',  '185', '1600', '1100', '60',  '35', '30', '100', '66', '5', '0', '1', '2020-03-04');
INSERT INTO `fitnesstracker`.`users_data` (`first_name`, `last_name`, `username`, `age`, `sex`, `height`, `weight`, `calories_max`, `calories_min`, `carbs_max`, `fat_max`, `sugar_max`, `protein_max`, `protein_min`, `workout_frequency`, `plan_id`, `workout_id`, `date_created`) VALUES ('Love', 'Quinn', 'love.quinn@gmail.com', '26', 'FEMALE', '66', '130', '1400', '1000', '44', '33', '22', '70', '44', '4', '1', '2', '2020-03-05');

INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('1', 'Chicken Breast', '165', '0', '3', '0', '23', '1234');
INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('2', 'Blueberries', '84', '21', '0', '14', '1', '1235');
INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('3', 'Steak',  '179', '0', '7','0', '22', '1234');
INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('4', 'Tuna', '110', '0', '1', '0', '10', '1235');

INSERT INTO `fitnesstracker`.`workout_plans` (`plan_id`, `plan_name`) VALUES ('1', 'KETO');
INSERT INTO `fitnesstracker`.`workout_plans` (`plan_id`, `plan_name`) VALUES ('2', 'PALEO');

INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_type`, `category`, `workout_name`, `description`, `length`) VALUES ('1', 'Free Weight', 'Legs', 'Squats', '3 sets of 8 squats', '10');
INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_type`, `category`, `workout_name`, `description`, `length`) VALUES ('2', 'Aerobic', 'Full Body', 'Run', '2 miles', '10');
INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_type`, `category`, `workout_name`, `description`, `length`) VALUES ('3', 'Free Weight', 'Chest', 'Bench Press', '3 sets of 8', '10');
INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_type`, `category`, `workout_name`, `description`, `length`) VALUES ('4', 'Free Weight', 'Arms', 'Skull Crusher', '3 sets of 8', '10');

INSERT INTO `fitnesstracker`.`users` (`username`, `password`, `enabled`) VALUES ('jgoldberg@email.com', 'killer', '1');
INSERT INTO `fitnesstracker`.`users` (`username`, `password`, `enabled`) VALUES ('lquinn@email.com', 'killer', '1');

INSERT INTO `fitnesstracker`.`authorities` (`username`, `authority`) VALUES ('jgoldberg@email.com', 'USER');
INSERT INTO `fitnesstracker`.`authorities` (`username`, `authority`) VALUES ('lquinn@email.com', 'USER');

INSERT INTO `fitnesstracker`.`workout_log` (`workout_id`, `reps`, `weight`, `sets`, `distance`, `user_id`) VALUES ('1', '8', '40', '2', '0', '1');
INSERT INTO `fitnesstracker`.`workout_log` (`workout_id`, `reps`, `weight`, `sets`, `distance`, `user_id`) VALUES ('2', '0', '0', '0', '2.5', '2');
