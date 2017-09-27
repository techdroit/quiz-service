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