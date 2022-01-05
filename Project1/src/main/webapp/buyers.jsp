<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>House Rental Management System</title>
<link rel="stylesheet" type="text/css" href="CSS/buyersstyle.css">
<link rel="stylesheet" href="CSS/all.min.css">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;600;700&display=swap" rel="stylesheet">
<link rel="icon" href="Assets/fav.ico.ico">
</head>
<body>
<header>
            
            <nav>
                
                <div class="container">
                    
                    <div class="left-nav">
                        
                        <h2>Rental</h2>
                    
                        <ul class="nav-items">
                        
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="#aboutid">Why Use Rental</a></li>
                            <li><a href="#contactid">Contact Us</a></li>
                    
                        </ul>
                
                    </div>
                
                    <div class="right-nav">
                        
                        <a href="signup.jsp" class="sign" >Sign In</a>
                        
                        
                     
                
                    </div>
                
                </div>
            
            </nav>
        
        </header>
<section class="buyers-container">
<form action="buyers2.jsp" method="get">
            
            <div class="buyers-details" id="buyers">
                
                <h2>World's Largest No Brokerage Property Site</h2>
                <h2>Search a property</h2>
                
                <div class="buyers-items">
                
                    <p>Please enter your city: </p>        
                    <input type="text" placeholder="City" name="city" size="40" required>
                        
                </div>
                        
                <div class="buyers-items">
                
                    <p>Apartment Type:</p>
                    
                    <input type="radio" id="1rk" name="apartmentType" value="1RK" required>
                    <label for="1rk">1RK</label>
                            
                    <input type="radio" id="1bhk" name="apartmentType" value="1BHK" required>
                    <label for="1bhk">1BHK</label>
                    
                    <input type="radio" id="2bhk" name="apartmentType" value="2BHK" required>
                    <label for="2bhk">2BHK</label>
                    
                    <input type="radio" id="3bhk" name="apartmentType" value="3BHK" required>
                    <label for="3bhk">3BHK</label>
                    
                    <input type="radio" id="4bhk" name="apartmentType" value="4BHK" required>
                    <label for="4bhk">4BHK</label>
                    
                    <input type="radio" id="4+bhk" name="apartmentType" value="4+BHK" required>
                    <label for="4+bhk">4+BHK</label>
                        
                </div>
                
                <%--<div class="buyers-items">
                        
                    <p>Living Type:</p>
                    
                    <input type="radio" id="fullhouse" name="livingType" value="Full House">
                    <label for="fullhouse">Full House</label>
                    
                    <input type="radio" id="pg/hostel" name="livingType" value="PG/Hostel">
                    <label for="pg/hostel">PG/Hostel</label>
                    
                    <input type="radio" id="flats" name="livingType" value="Flats">
                    <label for="flats">Flats</label>
                    
                </div> --%>
                    
                <div class="buyers-items">
                        
                    <input type="submit" value="Search">
                    
                </div>
            
            </div>
            
            </form>
</section>
<footer class="contact">
        
        <form action="" method="post">
            
            <div class="contact-container" id="contactid">
                
                <h2>Contact Us</h2>
                
                <div class="contact-items">
                            
                    <input type="text" placeholder="Your Name" name="Name" size="40">
                        
                </div>
                        
                <div class="contact-items">
                            
                    <input type="text" placeholder="Your Email" name="Email" size="40">
                        
                </div>
                
                <div class="contact-items">
                        
                    <textarea placeholder="Your Message" name="Message" rows="6" cols="82"></textarea>
                    
                </div>
                    
                <div class="contact-items">
                        
                    <button class="contact-btn-1">Send Message</button>
                    
                </div>
            
            </div>
            
            </form>
            
            <div class="last-container">
                
                <span>All Rights Reserved Made by - Group 2</span>
            
            </div>
        
        </footer>
</body>
</html>