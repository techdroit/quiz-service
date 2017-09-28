CREATE TABLE quiz.quiz_users (
	user_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	admin_id BIGINT UNSIGNED NULL,
	email varchar(50) NOT NULL,
	user_pwd varchar(100) NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	middle_name varchar(50) NULL,
	gender CHAR(1) NULL,
	date_of_birth DATE NULL,
	date_of_reg DATETIME NOT NULL,
	marital_status varchar(25) NULL,
	nationality varchar(50) NULL,
	religion varchar(50) NULL,
	role_id TINYINT NOT NULL,
	mob_number varchar(25) NULL,
	address varchar(50) NULL,
	city varchar(50) NULL,
	state varchar(50) NULL,
	country varchar(50) NULL,
	job_title varchar(50) NULL,
	company_name varchar(100) NULL,
	img_path varchar(100) NULL,
	email_alert CHAR(1) NOT NULL DEFAULT '0',
	sms_alert CHAR(1) NOT NULL DEFAULT '0',
	primary KEY(user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;


CREATE TABLE quiz.quiz_user_roles (
	role_id TINYINT NOT NULL AUTO_INCREMENT,
	role_desc varchar(100) NOT NULL,
	status_id TINYINT NOT NULL,
	role_mk_id BIGINT NOT NULL,
	role_mk_date DATETIME NOT NULL,
	role_mk_comment varchar(100) NOT NULL,
	role_chk_id BIGINT NULL,
	role_chk_date DATETIME NULL,
	role_chk_comment VARCHAR(100) NULL,
	PRIMARY KEY(role_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;


CREATE TABLE quiz.quiz_ques_types (
	ques_type_id TINYINT NOT NULL AUTO_INCREMENT,
	ques_type_desc varchar(100) NOT NULL,
	PRIMARY KEY(ques_type_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_ques_types(ques_type_desc) values('true or false');
insert into quiz_ques_types(ques_type_desc) values('multi choice radio');
insert into quiz_ques_types(ques_type_desc) values('multi choice check');

--select * from quiz_question_types;

CREATE TABLE quiz.quiz_info (
	quiz_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	quiz_name varchar(50) NOT NULL,
	quiz_desc varchar(100) NULL,
	quiz_no_of_total_ques INT NULL,
	quiz_no_of_ques_allowed INT NULL,
	status_id TINYINT NOT NULL,
	quiz_start_date DATE NULL,
	quiz_end_date DATE NULL,
	quiz_time_allowed TINYINT NULL,
	quiz_no_of_attempts TINYINT NULL,
	quiz_passing_score TINYINT NULL,
	dis_mode_id TINYINT NULL,
	sel_mode_id TINYINT NULL,
	vis_mode_id TINYINT NOT NULL,
	quiz_mk_id TINYINT UNSIGNED NOT NULL,
	quiz_mk_date DATE NOT NULL,
	quiz_mk_comment varchar(100) NOT NULL,
	PRIMARY KEY(quiz_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

CREATE TABLE quiz.quiz_vis_mode (
	vis_mode_id TINYINT NOT NULL AUTO_INCREMENT,
	vis_mode_desc varchar(25) NOT null,
	primary key(vis_mode_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_vis_mode(vis_mode_desc) values('PRIVATE');
insert into quiz_vis_mode(vis_mode_desc) values('PUBLIC');
--select * from quiz_mode;

CREATE TABLE quiz.quiz_status (
	status_id TINYINT NOT NULL AUTO_INCREMENT,
	status_desc varchar(25) NULL,
	primary key(status_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

insert into quiz_status(status_desc) values('ACTIVE');
insert into quiz_status(status_desc) values('INACTIVE');
insert into quiz_status(status_desc) values('IN PROGRESS');
insert into quiz_status(status_desc) values('EXPIRED');
insert into quiz_status(status_desc) values('STARTED');
insert into quiz_status(status_desc) values('COMPLETED');
insert into quiz_status(status_desc) values('INCOMPLETE');

--select * from quiz_status;

CREATE TABLE quiz.quiz_ques_sel_mode (
	sel_mode_id TINYINT NOT NULL AUTO_INCREMENT,
	sel_mode_desc varchar(25) NOT null,
	primary key(sel_mode_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

insert into quiz_ques_sel_mode(sel_mode_desc) values('SEQUENTIAL');
insert into quiz_ques_sel_mode(sel_mode_desc) values('RANDOM');
--select * from quiz_question_selection_mode;

CREATE TABLE quiz.quiz_diff_level (
	diff_level_id TINYINT NOT NULL AUTO_INCREMENT,
	diff_level_desc varchar(25) NOT null,
	primary key(diff_level_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

insert into quiz_diff_level(diff_level_desc) VALUES('BEGINNER');
insert into quiz_diff_level(diff_level_desc) VALUES('INTERMEDIATE');
insert into quiz_diff_level(diff_level_desc) VALUES('ADVANCED');
--select * from quiz_difficulty_level;

CREATE TABLE quiz.quiz_ques (
	ques_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	quiz_id BIGINT UNSIGNED NOT NULL,
	ques_desc varchar(1000) NOT NULL,
	ques_comment varchar(1000) NOT NULL,
	status_id TINYINT UNSIGNED NOT NULL,
	ques_type_id TINYINT UNSIGNED NOT NULL,
	diff_level_id TINYINT UNSIGNED NOT NULL,
	ques_option_a varchar(100) NULL,
	ques_option_b varchar(100) NULL,
	ques_option_c varchar(100) NULL,
	ques_option_d varchar(100) NULL,
	ques_option_e varchar(100) NULL,
	ques_option_a_valid TINYINT UNSIGNED NULL,
	ques_option_b_valid TINYINT UNSIGNED NULL,
	ques_option_c_valid TINYINT UNSIGNED NULL,
	ques_option_d_valid TINYINT UNSIGNED NULL,
	ques_option_e_valid TINYINT UNSIGNED NULL,
	ques_mk_id BIGINT UNSIGNED NOT NULL,
	ques_mk_date DATE NOT NULL,
	ques_mk_comment varchar(100) NULL,
	ques_last_mk_id BIGINT UNSIGNED NULL,
	ques_last_mk_date DATETIME null,
	primary key(ques_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

CREATE TABLE quiz.quiz_user_scores (
	user_id BIGINT UNSIGNED NOT NULL,
	quiz_id BIGINT UNSIGNED NOT NULL,
	status_id TINYINT UNSIGNED NOT NULL,
	time_rmn TINYINT UNSIGNED NULL,
	str_date DATE NOT NULL,
	end_date DATE NULL,
	score TINYINT UNSIGNED null
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

CREATE TABLE quiz.quiz_user_scores_hist (
	user_id BIGINT UNSIGNED NOT NULL,
	quiz_id BIGINT UNSIGNED NOT NULL,
	status_id TINYINT UNSIGNED NOT NULL,
	time_rmn TINYINT UNSIGNED NULL,
	str_date DATE NOT NULL,
	end_date DATE NULL,
	score TINYINT UNSIGNED null
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

CREATE TABLE quiz.quiz_user_grps (
	grp_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	grp_desc varchar(50) NOT NULL,
	grp_mk_id BIGINT UNSIGNED NOT NULL,
	grp_mk_date DATETIME NOT NULL,
	grp_mk_comment varchar(100) null,
	primary key(grp_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;

CREATE TABLE quiz.quiz_user_grps_info (
	grp_id BIGINT UNSIGNED NOT NULL,
	user_id BIGINT UNSIGNED NOT NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci ;

CREATE TABLE quiz.quiz_user_grps_quiz (
	grp_id BIGINT UNSIGNED NOT NULL,
	quiz_id BIGINT UNSIGNED NOT NULL,
	no_of_attempts TINYINT UNSIGNED DEFAULT 1
)
ENGINE=InnoDB
DEFAULT CHARSET=latin1
COLLATE=latin1_swedish_ci;