WeatherRun:
Weather app utilizing the Google API to help runners know what to wear based on weather. Developed when I studied abroad ina group of 4 developers - we equally contributed and I was most interested in user experience. 

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
