CREATE TABLE quiz.users (
	user_id BIGINT NOT NULL AUTO_INCREMENT,
	admin_id BIGINT NULL,
	email varchar(50) NOT NULL,
	user_password varchar(100) NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	middle_name varchar(50) NULL,
	gender CHAR NULL,
	date_of_birth DATE NULL,
	date_of_registration DATETIME NULL,
	marital_status varchar(15) NULL,
	nationality varchar(50) NULL,
	religion varchar(25) NULL,
	role_id varchar(50) NULL,
	account_status INT NOT NULL,
	mobile_number varchar(25) NULL,
	address varchar(50) NULL,
	city varchar(50) NULL,
	state varchar(50) NULL,
	country varchar(50) NULL,
	job_title varchar(50) NULL,
	company_name varchar(100) NULL,
	image BLOB NULL,
	email_notification CHAR NULL,
	sms_notification CHAR null,
	primary KEY(user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;


CREATE TABLE quiz.user_roles (
	role_id INT NOT NULL AUTO_INCREMENT,
	role_description varchar(100) NOT NULL,
	role_status INT NOT NULL,
	role_maker varchar(100) NOT NULL,
	role_maker_date DATE NOT NULL,
	role_maker_comment varchar(100) NOT NULL,
	role_checker varchar(100) NULL,
	role_checker_date DATE NULL,
	role_checker_comment VARCHAR(100) NULL,
	PRIMARY KEY(role_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

CREATE TABLE quiz.question_types (
	question_type_id INT NOT NULL AUTO_INCREMENT,
	question_type_description varchar(100) NOT NULL,
	PRIMARY KEY(question_type_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into question_types(question_type_description) values('true or false');
insert into question_types(question_type_description) values('multi choice radio');
insert into question_types(question_type_description) values('multi choice check');

CREATE TABLE quiz.quiz_info (
	quiz_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	quiz_name varchar(50) NOT NULL,
	quiz_description varchar(100) NULL,
	quiz_no_of_total_questions INT NULL,
	quiz_no_of_questions_allowed INT NULL,
	status_id TINYINT NOT NULL,
	quiz_start_date DATE NULL,
	quiz_end_date DATE NULL,
	quiz_time_allowed TINYINT NULL,
	quiz_no_of_attempts TINYINT NULL,
	quiz_passing_score TINYINT NULL,
	quiz_question_display_mode TINYINT NULL,
	quiz_question_selection_mode TINYINT NULL,
	quiz_mode_id TINYINT NOT NULL,
	quiz_maker_id TINYINT UNSIGNED NOT NULL,
	quiz_maker_date DATE NOT NULL,
	quiz_maker_comment varchar(100) NOT NULL,
	PRIMARY KEY(quiz_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;