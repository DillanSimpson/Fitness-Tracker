CREATE TABLE usersworkouts (workout_id int, workout_name varchar(255), description varchar(255), length varchar(255));
CREATE TABLE users (user_id int, user_name varchar(255), user_password varchar(255), role varchar(255), active boolean);
CREATE TABLE users_data (user_id int, first_name varchar(255), last_name varchar(255), email varchar(255), age int, sex varchar(255),
 height int, weight int, calories_max int, calories_min int, carbs_max int, fat_max int, sugar_max int, protein_max int,
 protein_min int, plan_id int, plan_name varchar(255), workout_frequency int);
CREATE TABLE food_log (id int, food_name varchar(255), calories int, carbs float, fat float, sugar float, protein float, user_id int);
CREATE TABLE workout_plans (plan_id int, plan_name varchar(255));  

INSERT INTO `fitnesstracker`.`users_data` (`user_id`, `first_name`, `last_name`, `email`, `age`, `sex`, `height`, `weight`, `calories_max`, `calories_min`, `carbs_max`, `fat_max`, `sugar_max`, `protein_max`, `protein_min`, `plan_id`, `plan_name`, `workout_frequency`) VALUES ('1234', 'Joe', 'Goldberg', 'joe.goldberg@gmail.com', '27', 'MALE', '72',  '185', '1600', '1100', '60',  '35', '30', '100', '66', '1', 'KETO','5');
INSERT INTO `fitnesstracker`.`users_data` (`user_id`, `first_name`, `last_name`, `email`, `age`, `sex`, `height`, `weight`, `calories_max`, `calories_min`, `carbs_max`, `fat_max`, `sugar_max`, `protein_max`, `protein_min`, `plan_id`, `plan_name`, `workout_frequency`) VALUES ('1235', 'Love', 'Quinn', 'love.quinn@gmail.com', '26', 'FEMALE', '66', '130', '1400', '1000', '44', '33', '22', '70', '44', '2', 'PALEO', '4');

INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('1', 'Chicken Breast', '165', '0', '3', '0', '23', '1234');
INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('2', 'Blueberries', '84', '21', '0', '14', '1', '1235');
INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('3', 'Steak',  '179', '0', '7','0', '22', '1234');
INSERT INTO `fitnesstracker`.`food_log` (`id`, `food_name`, `calories`, `carbs`, `fat`, `sugar`, `protein`, `user_id`) VALUES ('4', 'Tuna', '110', '0', '1', '0', '10', '1235');

INSERT INTO `fitnesstracker`.`workout_plans` (`plan_id`, `plan_name`) VALUES ('1', 'KETO');
INSERT INTO `fitnesstracker`.`workout_plans` (`plan_id`, `plan_name`) VALUES ('2', 'PALEO');

INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_name`, `description`, `length`) VALUES ('1', 'Squats', '3 sets of 8 squats', '10');
INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_name`, `description`, `length`) VALUES ('2', 'Lunges', '3 sets of 10', '10');
INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_name`, `description`, `length`) VALUES ('3', 'Bench Press', '3 sets of 8', '10');
INSERT INTO `fitnesstracker`.`workouts` (`workout_id`, `workout_name`, `description`, `length`) VALUES ('4', 'Skull Crusher', '3 sets of 8', '10');


INSERT INTO `fitnesstracker`.`users` (`user_id`, `user_name`, `user_password`, `role` , `active`) VALUES ('1', 'jgoldberg', 'killer', 'USER', '1');
INSERT INTO `fitnesstracker`.`users` (`user_id`, `user_name`, `user_password`, `role` , `active`) VALUES ('2', 'lquinn', 'killer', 'USER', '1');
