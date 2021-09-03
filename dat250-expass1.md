# DAT250
Getting Started on Heroku with Java

Before starting the Heroku tutorial i had to install both Git and Maven on my computer. The Git installation was pretty straight forward, i just downloaded and ran the installer from the web-page given in the assignment description without any trouble. Installing Maven was a bit more tedious, after downloading the zip file on https://maven.apache.org/download.cgi i had to find a youtube video to help me with setting environment variables in Windows.
To check that the installations were successful i ran the commands "mvn -v" and "git --version" in the command promt.

Going through the Heroku tutorial was smooth and painless for the most part. The only trouble i ran into was in the "Define config vars" part. The tutorial asks you to input som lines of code on line 56 in Main.java. For me line 56 was in the middle of a method so pasting the code there did not make sense. I added the code outside the method but got the error message "method hello(java.util.Map<java.lang.String,java.lang.Object>) is already defined in class com.example.Main" when running "mvn clean install". To fix this i ended up removing the existing code for the hello method and replaced it with the code given in the tutorial. After doing that i could run "mvn clean install" successfully.
