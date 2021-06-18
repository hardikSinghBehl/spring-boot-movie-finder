# Spring-boot:Thymeleaf application consuming OMDB API
### [Running Application](https://spring-boot-movie-finder.herokuapp.com/)

## Application Flow
* User types in the movie title in /index page which sends a POST request to /result with the movie title as parameter
* result controller recieves the movieTitle, sends an HTTP request through RestTemplate.class to OMDB Server
* Response from OMDB is mapped to the defined DTOs in the project
* The DTO is added as an attribute to the model and is processed by thymeleaf in result.html which is then returned as the view

![ezgif com-gif-maker (2)](https://user-images.githubusercontent.com/69693621/122505944-dce29380-cfec-11eb-8f45-7e26a3b57987.gif)

## Local Setup
* Requirements
  * Java 16
  * Maven 
* Generate OMDB API key [HERE](http://www.omdbapi.com/apikey.aspx?__EVENTTARGET=patreonAcct&__EVENTARGUMENT=&__LASTFOCUS=&__VIEWSTATE=%2FwEPDwUKLTIwNDY4MTIzNQ9kFgQCAQ9kFgYCAQ8QDxYCHgdDaGVja2VkaGRkZGQCAw8QDxYCHwBnZGRkZAIFDxYCHgdWaXNpYmxlaGQCAw8WAh8BaGQYAQUeX19Db250cm9sc1JlcXVpcmVQb3N0QmFja0tleV9fFgMFC3BhdHJlb25BY2N0BQtwYXRyZW9uQWNjdAUIZnJlZUFjY3T9KVyjFXf3sUoQGdfyUyoaE3EzSZd6JAlWD73EGMuM%2FA%3D%3D&__VIEWSTATEGENERATOR=5E550F58&__EVENTVALIDATION=%2FwEdAAgOeQd1entIweCP5QevJXAhmSzhXfnlWWVdWIamVouVTzfZJuQDpLVS6HZFWq5fYphdL1XrNEjnC%2FKjNya%2Bmqh8hRPnM5dWgso2y7bj7kVNLSFbtYIt24Lw6ktxrd5Z67%2F4LFSTzFfbXTFN5VgQX9Nbzfg78Z8BXhXifTCAVkevdzC1sAGcNpORjYVcQlhjj0fBvm4CWA8JD1IFllxmE92%2F&at=patreonAcct&Email2=&FirstName=&LastName=&TextArea1=)
* Enter above recieved key in **application.properties**
* Run the below commands in the core
  * mvn clean install
  * mvn spring-boot:run
* Go to the below URI in any browser
  * http://localhost:9090  
