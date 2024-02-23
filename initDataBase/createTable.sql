CREATE TABLE `Coffe_point` (
    `coffe_point_id` int PRIMARY KEY, `name` varchar(255), `logo` varchar(255), `description` varchar(255), `address` varchar(255), `email` varchar(255), `brand_id` int, `work_time` varchar(255)
);

CREATE TABLE `Brand` (
    `brand_id` int PRIMARY KEY, `name` varchar(255), `owner_id` int, `phone` varchar(255)
);

CREATE TABLE `User` (
    `user_id` int PRIMARY KEY, `login` varchar(255), `email` varchar(255), `password` varchar(255), `has_premium` boolean
);

ALTER TABLE `Coffe_point`
ADD FOREIGN KEY (`brand_id`) REFERENCES `Brand` (`brand_id`);

ALTER TABLE `Brand`
ADD FOREIGN KEY (`owner_id`) REFERENCES `User` (`user_id`);