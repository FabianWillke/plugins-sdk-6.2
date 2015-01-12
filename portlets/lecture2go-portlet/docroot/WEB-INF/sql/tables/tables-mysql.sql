create table LG_Coordinator (
	coordinatorId bigint not null primary key,
	institutionId bigint,
	officeId bigint
) engine InnoDB;

create table LG_Host (
	hostId bigint not null primary key,
	protocol varchar(75) null,
	streamer varchar(75) null,
	port integer,
	serverRoot varchar(75) null,
	name varchar(75) null,
	serverTemplate varchar(75) null
) engine InnoDB;

create table LG_Institution (
	institutionId bigint not null primary key,
	parentId bigint,
	name varchar(75) null,
	typ varchar(75) null,
	www varchar(75) null,
	level integer,
	sort integer
) engine InnoDB;

create table LG_Institution_Host (
	institutionHostId bigint not null primary key,
	institutionId bigint,
	hostId bigint
) engine InnoDB;

create table LG_Lastvideolist (
	lastvideolistId integer not null primary key,
	videoId bigint
) engine InnoDB;

create table LG_Lectureseries (
	number_ varchar(75) null,
	eventType varchar(75) null,
	eventCategory varchar(75) null,
	name varchar(75) null,
	shortDesc varchar(75) null,
	semesterName varchar(75) null,
	language varchar(75) null,
	facultyName varchar(75) null,
	instructorsString varchar(75) null,
	lectureseriesId bigint not null primary key,
	password_ varchar(75) null,
	approved integer,
	longDesc varchar(75) null
) engine InnoDB;

create table LG_Lectureseries_Institution (
	lectureseriesInstitutionId bigint not null primary key,
	lectureseriesId bigint,
	institutionId bigint
) engine InnoDB;

create table LG_License (
	licenseId bigint not null primary key,
	videoId bigint,
	ccby integer,
	ccbybc integer,
	ccbyncnd integer,
	ccbyncsa integer,
	ccbysa integer,
	ccbync integer,
	l2go integer
) engine InnoDB;

create table LG_Metadata (
	metadataId bigint not null primary key,
	URLID varchar(75) null,
	format varchar(75) null,
	type_ varchar(75) null,
	language varchar(75) null,
	title varchar(75) null,
	subject varchar(75) null,
	coverage varchar(75) null,
	description varchar(75) null,
	creator varchar(75) null,
	publisher varchar(75) null,
	contributor varchar(75) null,
	rightsHolder varchar(75) null,
	rights varchar(75) null,
	provenance varchar(75) null,
	source varchar(75) null,
	relation varchar(75) null,
	audience varchar(75) null,
	instructionalMethods varchar(75) null,
	date_ datetime null
) engine InnoDB;

create table LG_Office (
	officeId bigint not null primary key,
	name varchar(75) null,
	www varchar(75) null,
	email varchar(75) null,
	institutionId bigint
) engine InnoDB;

create table LG_Producer (
	producerId bigint not null primary key,
	idNum varchar(75) null,
	homeDir varchar(75) null,
	hostId bigint,
	institutionId bigint,
	numberOfProductions bigint,
	approved integer
) engine InnoDB;

create table LG_Producer_Lectureseries (
	producerLectureseriesId bigint not null primary key,
	lectureseriesId bigint,
	producerId bigint
) engine InnoDB;

create table LG_Segment (
	segmentId bigint not null primary key,
	videoId bigint,
	start_ varchar(75) null,
	title varchar(75) null,
	description varchar(75) null,
	end_ varchar(75) null,
	chapter integer,
	userId bigint
) engine InnoDB;

create table LG_Segment_User_Video (
	segmentId bigint,
	userId bigint,
	videoId bigint,
	segmentUserVideoId bigint not null primary key
) engine InnoDB;

create table LG_Sys (
	sysId integer not null primary key,
	version varchar(75) null,
	setupWizard integer
) engine InnoDB;

create table LG_TestEntity (
	testEntityId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	testField varchar(75) null
) engine InnoDB;

create table LG_Upload (
	uploadId bigint not null primary key,
	userId bigint,
	contentLength bigint,
	timestamp bigint,
	status integer,
	videoId integer
) engine InnoDB;

create table LG_Video (
	videoId bigint not null primary key,
	title varchar(75) null,
	tags varchar(75) null,
	lectureseriesId bigint,
	producerId bigint,
	containerFormat varchar(75) null,
	filename varchar(75) null,
	resolution varchar(75) null,
	duration varchar(75) null,
	hostId bigint,
	fileSize varchar(75) null,
	generationDate varchar(75) null,
	openAccess integer,
	downloadLink integer,
	metadataId bigint,
	surl varchar(75) null,
	hits integer,
	uploadDate datetime null,
	permittedToSegment integer,
	rootInstitutionId bigint,
	citation2go integer
) engine InnoDB;

create table LG_Video_Institution (
	videoInstitutionId bigint not null primary key,
	videoId bigint,
	institutionId bigint
) engine InnoDB;

create table LG_Video_Lectureseries (
	videoLectureseriesId bigint not null primary key,
	videoId bigint,
	lectureseriesId bigint
) engine InnoDB;

create table LG_Videohitlist (
	videohitlistId bigint not null primary key,
	hitsPerDay integer,
	hitsPerWeek integer,
	hitsPerMonth integer,
	hitsPerYear integer
) engine InnoDB;