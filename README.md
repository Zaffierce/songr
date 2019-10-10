# Songr Application

This application is used to store your favorite Albums and add Songs to each individual album.

# Setup

To get this application running, please perform the following steps.
1.  Install a postgres SQL database, with the database name of `songr`
2.  Run this application using `./gradlew bootRun`
3.  Open a new browser and go to http://localhost:8080/

# Routes

Home page - http://localhost:8080/
* On this page, you may add an individual album with Artist/Band name, Album title, Album Track Count, Album Length (in seconds), and the Album's thumbnail.

http://localhost:8080/albums
* On this page, all of the albums that you have added will be displayed here.
* You may click on the thumbnail of each album to view the individual songs
* You may delete the album from the database on this page

Individual album page
* On this page, you may add individual songs to an album with Song name, Song length (in seconds), and the track number.
* Currently, you may not delete a song from an album.

http://localhost:8080/hello/{username}
* {username} is the path variable in which you may enter your own username, which just Welcomes you.

http://localhost:8080/capitalize/{keyword}
* {keyword} is the path variable in which you may enter word(s) in, which will capitalize them for you when you hit enter.


