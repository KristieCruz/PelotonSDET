# PelotonSDET

PelotonLoginandShop:
To be run in Eclipse as a Java application with Selenium external JARs added to the Classpath. 

What PelotonLoginandShop is solving:
PelotonLoginandShop is solving the navigation to login and shop on the Peloton site. 

What PelotonLoginandShop is doing:
PelotonLoginandShop is determining whether or not the Sign In options are available for the user. By maximizing the instantiated browser window, it is allowing for a higher possibling of the element 'Sign In' to be found'. Alternatively, if an exception is thrown, the browser is directed to the login page where a list of email and passwords are entered welcoming the user to a more interactive exerience or asking them to try again. PelotonLoginandShop also features a nested for loop to demonstrate login attempts in high volume. 
With more time:
PelotonLoginandShop would have investigated how to automate with respect to a user forgetting their password (which would be suggested after many login failures) and captcha (which occurs when logging in repeatedly). 


OpenWeatherCity:
To be run in Eclipse as a Java Application with Selenium external JARs added to the Classpath.
What OpenWeatherCity is doing: using the endpoint of the OpenWeatherAPI to determine the current weather of a city entered by the user. 
What OpenWeatherCity is doing:
OpenWeatherCity is using API keys to instantiate the browser to find and print the minimum and maximum temperature of the city the user enters. 
With more time: 
OpenWeatherCity would have investigated how to handle GET and POST requests and the imports and protocols necessary for OpenWeather, similar to the WeatherRun app developed in my junior year (included in this repository). 

DominoesK: 
Simulator of traditional Domino game (user vs computer developed in my freshman year of college)
This program simulates the game of Dominoes.
Objective of the game: To pair matching domino pieces.
 Winner: First person to have zero dominoes remaining.
 Rules:
 1. The first domino to be placed on the board is the highest tile and thus, this determines if either the Computer
    or the Player plays first.
 2. The first tile is placed (by either the Computer or the Player depending on who had the highest tile).
 3. The opposite player places a tile matching a tile already on the board.
 4. The turns continue until one of the player has zero dominoes remaining.
 5. The first player with zero dominoes is the winner. 
 Set-up:
 There are 28 dominoes in a set. 
 Each player is dealt 14 dominoes. 
 Description of Steps for Program: 
 I created ArrayLists for the set of Domino tiles, 
 the set of tiles the Player is dealt 
 and the set of tiles the Computer is dealt. 
 Every time they each have a turn, their ArrayList diminishes in size by 1. 
 I coded loops to create the set of dominoes and deal them. 
 The placement of the first tile is done by a search loop of all the dominoes. 
 Whoever puts down the first & highest domino, waits for their opponent to play a turn.
 Then, the game continues until there is a winner. 


WeatherRun:
Weather app utilizing the Google API to help runners know what to wear based on weather. 
How to run the user interface

The app opens up to a homepage.

On the top left corner of the user interface, there are two diagonal arrows. If you click this image, the size of all the objects and the screen will proportionally increase. It will decrease to the original size when clicked again. Both sizes function in the exact same way.

The sound button is next button, which looks like a speaker. Once the user presses the sound button, sound will be muted. The sound will be unmated upon another press. Note that the image changes to reflect the state of the sound.

The eye represents the object recognition part of the user interface. It will turn object recognition on or off when the user clicks the eye. There will be a cross through the eye when it is off. While in the on position, the object recognition feature allows the user to change between the days of the week. The day of the week can be controlled by responding to the color red (or orange depending on the light). When you move the color up, it will move the slider to earlier dates. When you move the color down, it will show future dates. Effective examples are red wristbands, red sleeves, red pieces of paper, or a severely sunburned arm.

Under these images is the weather picture indicator, it shows the current forecast in picture form and changes based on the day/location accordingly.

A menu allowing the user to choose locations is located under the picture. It displays the current location as well, which is London by default. By clicking on the menu box or the box next to it, the user has the ability to choose between various different locations. If a new location is clicked, the forecast is adjusted for the current day to represent the conditions in that location.

The current day, forecast, high temperature, and low temperature are all shown under location menu.

When looking at the right side of the user interface, you will see a slider that allows the user to choose between 5 different days. There is a pointer that points to the day that is being shown. Days are indicated by abbreviations next to the slider. The user can move this pointer to different days to adjust the weather forecast. When a day changes, the image and weather report details changes as well.

There is a timer in the bottom right of the app. Click the start button to start the time and a reset button, which brings the timer back to zero. It is there in order to help the runner record their running speed.

Various libraries were used to run our app. Javabeads was used to control the sound effects
Java.swing and java.awt were used to help structure the GUI organization and used for images.
Additionally, we used miglayout for a synth look to the user interface and feel for the slider. 

