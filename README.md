# Asteroid Radar App
![AsteroidApp](https://github.com/dev-iram/Asteroid-Radar-App/assets/22479692/bcbca423-f316-488a-974e-d0e3030b77a8)

This is an Asteroid Radar App I created as per specifications in Project 2 as part of Udacity Nanodegree Android Kotlin Developer Course.  
  
  ✦ Programming Language; Kotlin    
  ✦ Minimum SDK; 24  
  ✦ UI Layout; XML  
  ✦ Software Tools;  
  &nbsp;&nbsp;&nbsp;&nbsp;✧ Android Studio: IDE Used to create, compile and build application
  
## Application Screenshots
![](https://github.com/dev-iram/Asteroid-Radar-App/assets/22479692/59d600ae-653f-4e27-af2e-679755d17700)
![](https://github.com/dev-iram/Asteroid-Radar-App/assets/22479692/1bc4832e-72af-4682-9e62-413e8b261bc3)

## Application Logo
 <div align="center">
  <image src="https://github.com/dev-iram/Asteroid-Radar-App/assets/22479692/7dce6655-f8eb-4bdd-99fc-b2e0330642fb" width="400" />
</div>

## Application Demo
 <div align="center">
  <video src="" width="400" />
</div>
    
## Assignment Overview 

Asteroid Radar is an app to view the asteroids detected by NASA that pass near Earth, you can view all the detected asteroids given a period of time with data such as the size, velocity, distance to earth and if they are potentially hazardous. 
In this project, you will apply the skills such as fetching data from the internet, saving data to a database, and display the data in a clear, compelling UI.  
You will need the NEoWs API which is a free, open source API provided by NASA JPL Asteroid team, as they explain it: 
“Is a RESTful web service for near earth Asteroid information. With NeoWs a user can: search for Asteroids based on their closest approach date to Earth, 
lookup a specific Asteroid with its NASA JPL small body id, as well as browse the overall data-set.”

The resulting output of the project will be two screens: 
a Main screen with a list of all the detected asteroids and a 
Details screen that is going to display the data of that asteroid once it´s selected in the Main screen list. 
The main screen will also show the NASA image of the day to make the app more striking.


## Assignment Brief
The application you will build must:

✦ **Main Screen** - with a list of clickable asteroids as seen in the provided design using a RecyclerView with its adapter.   
You could insert some fake manually created asteroids to try this before downloading any data.

✦ **Details Screen** - displays the selected asteroid data once it’s clicked in the Main screen as seen in the provided design. 
The images in the details screen are going to be provided with the starter code: 
an image for a potentially hazardous asteroid and another one for the non-hazardous ones, 
you have to display the correct image depending on the isPotentiallyHazardous asteroid parameter. 
Navigation xml file is already included with starter code.

✦ **Download from API** - Download and parse the data from NASA NeoWS (Near Earth Object Web Service) API. 
As this response cannot be parsed directly with Moshi, we are providing a method to parse the data “manually” for you, it’s called parseAsteroidsJsonResult inside NetworkUtils class, 
we recommend trying for yourself before using this method or at least take a close look at it as it is an extremely common problem in real-world apps. 
For this response we need retrofit-converter-scalars instead of Moshi, you can check this dependency in build.gradle (app) file.

✦ **Save to Database** - When asteroids are downloaded, save them in the local database.

✦ **Display Asteroids** - Fetch and display the asteroids from the database and only fetch the asteroids from today onwards, ignoring asteroids before today. 
Also, display the asteroids sorted by date (Check SQLite documentation to get sorted data using a query).  

✦ **Cache Data** - Be able to cache the data of the asteroid by using a worker, so it downloads and saves today's asteroids in background once a day when the device is charging and wifi is enabled.  

✦ **Display Image of the Day** - Download Picture of Day JSON, parse it using Moshi and display it at the top of Main screen using Picasso Library. 
(You can find Picasso documentation here: https://square.github.io/picasso/(opens in a new tab)) 
You could use Glide if you are more comfortable with it, although be careful as we found some problems displaying NASA images with Glide.

✦  **Content Description** - Add content description to the views: Picture of the day (Use the title dynamically for this), details images and dialog button. Check if it works correctly with talk back.

✦ **No Internet Usability** - Make sure the entire app works without an internet connection.

## Submission Feedback 

## 1st Submission -   ✅/❌
### 15th February 2024
```
```







