--quiz_ques_repo
--offline mode and online mode

--This table stores the different types of questions that can come up in a quiz
CREATE TABLE quiz.quiz_ques_types (
	ques_type_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	ques_type_name varchar(50) NOT NULL,
	ques_type_desc varchar(100),
	PRIMARY KEY(ques_type_id),
	UNIQUE(ques_type_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_ques_types(ques_type_name) values('true or false');
insert into quiz_ques_types(ques_type_name) values('multi choice radio');
insert into quiz_ques_types(ques_type_name) values('multi choice check');

------------------------------------------------------------------------------------------

--This table stores the accessibility level of a quiz. Private means its available to only the users it is profiled for while public means any logged in user can see it
CREATE TABLE quiz.quiz_vis_mode (
	vis_mode_id TINYINT NOT NULL AUTO_INCREMENT,
	vis_mode_name varchar(25) NOT NULL,
	vis_mode_desc varchar(100),
	primary key(vis_mode_id),
	UNIQUE(vis_mode_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_vis_mode(vis_mode_name) values('PRIVATE');
insert into quiz_vis_mode(vis_mode_name) values('PUBLIC');

------------------------------------------------------------------------------------------

--This table indicates wether quiz questions appear to the user in the selected order from the DB or it is randomized
CREATE TABLE quiz.quiz_ques_sel_mode (
	sel_mode_id TINYINT NOT NULL AUTO_INCREMENT,
	sel_mode_name varchar(25) NOT NULL,
	sel_mode_desc varchar(25),
	primary key(sel_mode_id),
	UNIQUE(sel_mode_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_ques_sel_mode(sel_mode_name) values('SEQUENTIAL');
insert into quiz_ques_sel_mode(sel_mode_name) values('RANDOM');

------------------------------------------------------------------------------------------

--This table stores values that indicate the difficulty level of a particular question
CREATE TABLE quiz.quiz_diff_level (
	diff_level_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	diff_level_name varchar(25) NOT NULL,
	diff_level_desc varchar(100),
	primary key(diff_level_id),
	UNIQUE(diff_level_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

insert into quiz_diff_level(diff_level_name) VALUES('BEGINNER');
insert into quiz_diff_level(diff_level_name) VALUES('INTERMEDIATE');
insert into quiz_diff_level(diff_level_name) VALUES('ADVANCED');

------------------------------------------------------------------------------------------

--This table contains values that indicate the status of a quiz at any point time
CREATE TABLE quiz.quiz_status (
	status_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	status_name varchar(25) NOT NULL,
	status_desc varchar(100),
	primary key(status_id),
	UNIQUE(status_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

insert into quiz_status(status_name) values('ACTIVE');
insert into quiz_status(status_name) values('INACTIVE');
insert into quiz_status(status_name) values('DISABLED');
insert into quiz_status(status_name) values('IN PROGRESS');
insert into quiz_status(status_name) values('EXPIRED');
insert into quiz_status(status_name) values('STARTED');
insert into quiz_status(status_name) values('COMPLETED');
insert into quiz_status(status_name) values('INCOMPLETE');

------------------------------------------------------------------------------------------
--This table stores values that indicate the role of a user
CREATE TABLE quiz.quiz_user_roles (
	role_id  TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	role_name varchar(25) NOT NULL,
	role_desc varchar(100),
	PRIMARY KEY(role_id),
	UNIQUE(role_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

insert into quiz_user_roles(role_name) values('USER');
insert into quiz_user_roles(role_name) values('ADMIN');

------------------------------------------------------------------------------------------

--This table stores the values that indicate the status of a user
CREATE TABLE quiz.quiz_user_status (
	status_id  TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	status_name varchar(25) NOT NULL,
	status_desc varchar(100),
	primary key (status_id),
	UNIQUE(status_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

select * from quiz_user_status

insert into quiz_user_status(status_name) values('ACTIVE');
insert into quiz_user_status(status_name) values('INACTIVE');
insert into quiz_user_status(status_name) values('DISABLED');

------------------------------------------------------------------------------------------

--This table contains values that indicate wether a user can receive email or sms alert
CREATE TABLE quiz.quiz_alert_status (
	status_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	status_name varchar(25) NOT NULL,
	status_desc varchar(100),
	primary key (status_id),
	UNIQUE(status_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_alert_status(status_name) values('ENABLED');
insert into quiz_alert_status(status_name) values('DISABLED');

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_users (
	user_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	user_name varchar(50) NOT NULL,
	email varchar(50) NOT NULL,
	user_pwd varchar(1000) NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	middle_name varchar(50),
	gender CHAR(1),
	date_of_birth DATE,
	date_of_reg DATETIME NOT NULL,
	marital_status varchar(25),
	nationality varchar(50),
	religion varchar(50),
	status_id TINYINT unsigned not NULL,
	role_id TINYINT unsigned not NULL,
	mob_number varchar(25),
	address varchar(50),
	city varchar(50),
	state varchar(50),
	country varchar(50),
	job_title varchar(50),
	company_name varchar(100),
	img_path varchar(100),
	email_alert TINYINT unsigned NOT NULL,
	sms_alert TINYINT unsigned NOT NULL,
	last_login DATETIME,
	last_logout DATETIME,
	primary KEY(user_id),
	UNIQUE(email),
	foreign key (status_id) 
	references quiz_user_status (status_id),
	foreign key (role_id) 
	references quiz_user_roles (role_id),
	foreign key (email_alert) 
	references quiz_alert_status (status_id),
	foreign key (sms_alert) 
	references quiz_alert_status (status_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_users_admin (
	user_id BIGINT UNSIGNED NOT NULL,
	admin_id BIGINT UNSIGNED,
	index user_ind(user_id),
	index adm_ind(admin_id),
	foreign key (user_id) 
	references quiz_users(user_id)
	on delete CASCADE,
	foreign key (admin_id) 
	references quiz_users(user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_info (
	quiz_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	quiz_name varchar(50) NOT NULL,
	quiz_desc varchar(100),
	no_of_total_ques INT,
	no_of_ques_allowed INT,
	status_id TINYINT NOT NULL,
	str_date DATE,
	end_date DATE,
	time_allowed TINYINT,
	no_of_attempts TINYINT,
	passing_score TINYINT,
	dis_mode_id TINYINT,
	sel_mode_id TINYINT,
	vis_mode_id TINYINT NOT NULL,
	mk_id BIGINT UNSIGNED NOT NULL,
	mk_date DATETIME NOT NULL,
	mk_comment varchar(100),
	PRIMARY KEY(quiz_id),
	index mk_ind (mk_id),
	foreign key (mk_id) 
	references quiz_users (user_id),
	foreign key (sel_mode_id) 
	references quiz_ques_sel_mode (sel_mode_id),
	foreign key (vis_mode_id) 
	references quiz_vis_mode (vis_mode_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

INSERT INTO quiz_info(quiz_name,status_id,vis_mode_id,mk_id,mk_date) VALUES('Android',1,1,1,'2017-09-30 10:23:00');

------------------------------------------------------------------------------------------

--This table contains values that represent the different states of a particular question option
CREATE TABLE quiz.quiz_ques_opt_sts (
	opt_sts_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	opt_sts_name varchar(25) NOT NULL,
	opt_sts_desc varchar(100),
	primary key (opt_sts_id),
	UNIQUE(opt_sts_name)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_ques_opt_sts(opt_sts_name) values('CORRECT');
insert into quiz_ques_opt_sts(opt_sts_name) values('INCORRECT');
insert into quiz_ques_opt_sts(opt_sts_name) values('NOOPTION');

------------------------------------------------------------------------------------------
--A quiz can have different question sections or segments
CREATE TABLE quiz.quiz_sections (
	sect_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	quiz_id BIGINT UNSIGNED,
	sect_name varchar(25) NOT NULL,
	sect_desc varchar(100),
	mk_id BIGINT UNSIGNED,
	mk_date DATETIME NOT NULL,
	mk_comment varchar(100),
	primary key (sect_id),
	UNIQUE(sect_name),
	index mk_ind (mk_id),
	foreign key (quiz_id) 
	references quiz_info(quiz_id),
	foreign key (mk_id) 
	references quiz_users(user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;	

INSERT INTO quiz_sections(sect_name,mk_date) VALUES('General Knowledge','2017-09-30 10:23:00');
------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_ques (
	ques_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	quiz_id BIGINT UNSIGNED,
	sect_id BIGINT UNSIGNED,
	ques_name varchar(1000) NOT NULL,
	ques_desc varchar(1000),
	status_id TINYINT UNSIGNED,
	ques_type_id TINYINT UNSIGNED,
	diff_level_id TINYINT UNSIGNED,
	option_a varchar(1000),
	option_b varchar(1000),
	option_c varchar(1000),
	option_d varchar(1000),
	option_e varchar(1000),
	option_a_valid TINYINT UNSIGNED NOT NULL,
	option_b_valid TINYINT UNSIGNED NOT NULL,
	option_c_valid TINYINT UNSIGNED NOT NULL,
	option_d_valid TINYINT UNSIGNED NOT NULL,
	option_e_valid TINYINT UNSIGNED NOT NULL,
	mk_id BIGINT UNSIGNED,
	mk_date TIMESTAMP NOT NULL,
	mk_comment varchar(100),
	primary key(ques_id),
	index mk_ind (mk_id),
	foreign key (mk_id) 
	references quiz_users(user_id),
	foreign key (quiz_id) 
	references quiz_info(quiz_id),
	foreign key (sect_id) 
	references quiz_sections(sect_id),
	foreign key (ques_type_id) 
	references quiz_ques_types(ques_type_id),
	foreign key (diff_level_id) 
	references quiz_diff_level(diff_level_id),
	foreign key (status_id) 
	references quiz_status(status_id),
	foreign key (option_a_valid) 
	references quiz_ques_opt_sts(opt_sts_id),
	foreign key (option_b_valid) 
	references quiz_ques_opt_sts(opt_sts_id),
	foreign key (option_c_valid) 
	references quiz_ques_opt_sts(opt_sts_id),
	foreign key (option_d_valid) 
	references quiz_ques_opt_sts(opt_sts_id),
	foreign key (option_e_valid) 
	references quiz_ques_opt_sts(opt_sts_id)
	
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_scores (
	user_id BIGINT UNSIGNED,
	quiz_id BIGINT UNSIGNED,
	sect_id BIGINT UNSIGNED,
	status_id TINYINT UNSIGNED,
	time_rmn TINYINT UNSIGNED,
	str_date DATE NOT NULL,
	end_date DATE,
	score TINYINT UNSIGNED,
	index user_ind (user_id),
	index quiz_ind (quiz_id),
	foreign key (user_id) 
	references quiz_users(user_id),
	foreign key (quiz_id) 
	references quiz_info(quiz_id),
	foreign key (sect_id) 
	references quiz_sections(sect_id),
	foreign key (status_id) 
	references quiz_status(status_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_scores_hist (
	user_id BIGINT UNSIGNED,
	quiz_id BIGINT UNSIGNED,
	sect_id BIGINT UNSIGNED,
	status_id TINYINT UNSIGNED,
	time_rmn TINYINT UNSIGNED,
	str_date DATE NOT NULL,
	end_date DATE,
	score TINYINT UNSIGNED,
	index user_ind (user_id),
	index quiz_ind (quiz_id),
	foreign key (user_id) 
	references quiz_users(user_id),
	foreign key (quiz_id) 
	references quiz_info(quiz_id),
	foreign key (sect_id) 
	references quiz_sections(sect_id),
	foreign key (status_id) 
	references quiz_status(status_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_grps (
	grp_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	grp_desc varchar(50) NOT NULL,
	mk_id BIGINT UNSIGNED,
	mk_date DATETIME NOT NULL,
	mk_comment varchar(100),
	primary key(grp_id),
	index mk_ind (mk_id),
	foreign key (mk_id) 
	references quiz_users(user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_grps_membrs (
	grp_id BIGINT UNSIGNED,
	user_id BIGINT UNSIGNED,
	index user_ind (user_id),
	foreign key (grp_id) 
	references quiz_user_grps(grp_id),
	foreign key (user_id) 
	references quiz_users(user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_grps_quiz (
	grp_id BIGINT UNSIGNED NOT NULL,
	quiz_id BIGINT UNSIGNED,
	no_of_attempts TINYINT UNSIGNED DEFAULT 1,
	index grp_ind (grp_id),
	index quiz_ind (quiz_id),
	foreign key (grp_id) 
	references quiz_user_grps(grp_id),
	foreign key (quiz_id) 
	references quiz_info(quiz_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_events (
	event_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	event_name varchar(50) NOT NULL,
	mk_id BIGINT UNSIGNED,
	mk_date DATETIME NOT NULL,
	mk_comment varchar(100),
	primary key(event_id),
	foreign key (mk_id) 
	references quiz_users(user_id)
	on delete CASCADE
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

insert into quiz_user_events(event_name,mk_id,mk_date) values('OTHER',1,'2017-09-30 10:23:00');
insert into quiz_user_events(event_name,mk_id,mk_date) values('LOGIN',1,'2017-09-30 10:23:00');
insert into quiz_user_events(event_name,mk_id,mk_date) values('LOGOUT',1,'2017-09-30 10:23:00');

------------------------------------------------------------------------------------------

CREATE TABLE quiz.quiz_user_trail (
	user_id BIGINT UNSIGNED NOT NULL,
	event_id TINYINT UNSIGNED DEFAULT 1,
	event_date DATETIME NOT NULL,
	ip_address varchar(50) NOT NULL,
	mac_address varchar(50),
	event_ref varchar(100),
	event_comment varchar(1000),
	index user_ind (user_id),
	foreign key (user_id) 
	references quiz_users(user_id)
	on delete CASCADE,
	foreign key (event_id) 
	references quiz_user_events(event_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

------------------------------------------------------------------------------------------
select * from quiz_alert_status;

select * from quiz_user_roles;
select * from quiz_user_status;
select * from quiz_status;

select * from quiz_ques_types;
select * from quiz_vis_mode;
select * from quiz_ques_sel_mode;
select * from quiz_diff_level;

select * from quiz_users;
select * from quiz_users_admin;

select * from quiz_info;
select * from quiz_ques;
select * from quiz_user_scores;
select * from quiz_user_scores_hist;

select * from quiz_user_grps;
select * from quiz_user_grps_membrs;
select * from quiz_user_grps_quiz;

select * from quiz_sections;


INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('teslimkuku@gmail.com','admin','Teslim','Kuku','2017-09-30 10:23:00',1,2,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('kazeem.olawale@yahoo.com','8uuyrtey','Kazeem','Olawale','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('azeez_layi@gmail.com','asxde4567','Azeez','Layi','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

INSERT INTO quiz_users(email, user_pwd, first_name, last_name, date_of_reg, status_id, role_id, email_alert, sms_alert) 
VALUES('','','','','2017-09-30 10:23:00',1,1,1,1);

insert into quiz_users_admin(user_id,admin_id) values(2,1);
insert into quiz_users_admin(user_id,admin_id) values(3,1);


INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,'',1,2,1,'','','','','',2,2,2,2,2,1,'2017-09-30 10:23:00');

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid)
VALUES(1,1,'The first-generation Android phones were released in October _____',1,2,1,
'2004','2005','2006','2007','2008',2,2,2,2,1);

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid)
VALUES(1,1,"Google's marketplace for Android apps is _____",1,2,1,'Google App Store','Google Play','Android Play','Youtube',
'Google Market',2,1,2,2,2);


INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,'By creating apps with the _____ library from the start, you avoid having to reimplement your code if you decide to support older Android versions to target a wider audience.',1,2,1,'AppCompat','','','','',1,2,2,2,2,1,'2017-09-30 10:23:00');

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"In addition, at the 2015 Google I/O developer conference, Google introduced the _____ for using material design in Android 2.1 and higher. Material design support also is built into most of Android Studio’s app templates.",1,2,1,'','','','Android Design Support Library','',2,2,2,1,2,1,'2017-09-30 10:23:00');

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"_____ is an online site for testing your apps across a wide range of devices, device orientations, locales, spoken languages and network conditions.",1,2,1,'','','Cloud Test Lab','','',2,2,1,2,2,1,'2017-09-30 10:23:00');

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,'Android Wear runs on _____',1,2,1,'','','','smart watches','',2,2,2,1,2,1,'2017-09-30 10:23:00');

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"_____ runs directly on some smart TVs and media players that you can connect to your TV (typically via HDMI cables).",1,2,1,'','Android TV','','','',2,1,2,2,2,1,'2017-09-30 10:23:00');

INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"If you'd like to work with new features in Android Studio early access and beta releases, Google releases these versions in the so-called _____",1,2,1,'','Canary Channel and Beta Channel','','','',2,1,2,2,2,1,'2017-09-30 10:23:00');


INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"The Android SDK's Android emulator allows you to test apps on your computer rather than on an Android device—this is essential, of course, if you do not have Android devices. To do so, you create _____ that run in the emulator.",1,2,1,'','','Android Virtual Devices (AVDs)','','',2,2,1,2,2,1,'2017-09-30 10:23:00');


INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"The Android operating system was developed by Android, Inc., which was acquired by Google in _____",1,2,1,'','','','2005','',2,2,2,1,2,1,'2017-09-30 10:23:00');



INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,"In _____, the Open Handset Alliance was formed to develop, maintain and evolve Android, driving innovation in mobile technology and improving the user experience while reducing costs.",1,2,1,'2007','','','','',1,2,2,2,2,1,'2017-09-30 10:23:00');


INSERT INTO quiz_ques(quiz_id, sect_id, ques_name, status_id, ques_type_id, diff_level_id, option_a, option_b, 
					  option_c, option_d, option_e, option_a_valid, option_b_valid, option_c_valid, 
					  option_d_valid, option_e_valid,mk_id,mk_date)
VALUES(1,1,'The corresponding name for the Android version, Android 1.5 is _____.',1,2,1,'','Cupcake','','','',2,1,2,2,2,1,'2017-09-30 10:23:00');