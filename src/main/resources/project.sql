CREATE TABLE `user` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `username` varchar(64) DEFAULT NULL,
                        `avatar` varchar(255) DEFAULT NULL,
                        `email` varchar(64) DEFAULT NULL,
                        `password` varchar(64) DEFAULT NULL,
                        `status` int NOT NULL,
                        `last_login` datetime DEFAULT NULL,
                        PRIMARY KEY (`id`),
                        KEY `UK_USERNAME` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

CREATE TABLE `blog` (
                        `id` bigint NOT NULL AUTO_INCREMENT,
                        `user_id` bigint NOT NULL,
                        `title` varchar(255) NOT NULL,
                        `description` varchar(255) NOT NULL,
                        `content` longtext,
                        `created` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
                        `status` tinyint DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;