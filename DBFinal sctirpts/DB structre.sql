USE javamdb;

CREATE TABLE javamdb.id3v2list (
  file_name int NOT NULL,
  gname VARCHAR(255) NOT NULL,
  PRIMARY KEY (gname));

create TABLE javamdb.song (
  file_name VARCHAR(255) NOT NULL,
  title VARCHAR(255),
  artist VARCHAR(255),
  album VARCHAR(255),
  tracknum VARCHAR(255),
  genre VARCHAR(255),
  PRIMARY KEY (file_name),
  FOREIGN KEY (genre) REFERENCES id3v2list(gname) ON UPDATE NO ACTION ON DELETE NO ACTION
  );

CREATE TABLE javamdb.album (
  file_name VARCHAR(255) NOT NULL,
  song1 VARCHAR(255),
  song2 VARCHAR(255),
  song3 VARCHAR(255),
  song4 VARCHAR(255),
  song5 VARCHAR(255),
  song6 VARCHAR(255),
  song7 VARCHAR(255),
  song8 VARCHAR(255),
  song9 VARCHAR(255),
  song10 VARCHAR(255),
  song11 VARCHAR(255),
  PRIMARY KEY (file_name),
  FOREIGN KEY (song1) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song2) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song3) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song4) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song5) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song6) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song7) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song8) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song9) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song10) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION,
  FOREIGN KEY (song11) REFERENCES song(file_name) ON UPDATE NO ACTION ON DELETE NO ACTION);
  
  