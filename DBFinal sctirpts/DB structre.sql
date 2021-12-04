USE javamdb;

CREATE TABLE javamdb.song (
  file_name VARCHAR(255) NOT NULL,
  title VARCHAR(255),
  artist VARCHAR(255),
  album VARCHAR(255),
  tracknum VARCHAR(255),
  genre VARCHAR(255),
  PRIMARY KEY (file_name))
;