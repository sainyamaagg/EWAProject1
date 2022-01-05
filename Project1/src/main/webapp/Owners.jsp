<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>House Rental Management System</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<section class="owners-details">
<form action="OwnersSide" method="post">
            
            <div class="owners-details" id="owners">
                
                <h2>World's Largest No Brokerage Property Site</h2>
                <h2>Give us some of your details</h2>
                
                <div class="owners-items">
                
                    <p>Please enter your email and password: </p>        
                    <input type="email" placeholder="Email" name="email" size="40" required>
                    <input type="password" placeholder="Password" name="password" size="40" required>
                        
                </div>
                
                <div class="owners-items">
                
                    <p>Please enter your location: </p>        
                    <input type="text" placeholder="City" name="city" size="40" required>
                    <input type="text" placeholder="Address" name="address" size="80" required>
                    
                        
                </div>
                        
                <div class="owners-items">
                
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
                
                <div class="owners-items">
                        
                    <p>Living Type:</p>
                    
                    <input type="radio" id="fullhouse" name="livingType" value="Full House" required>
                    <label for="fullhouse">Full House</label>
                    
                    <input type="radio" id="pg/hostel" name="livingType" value="PG/Hostel" required>
                    <label for="pg/hostel">PG/Hostel</label>
                    
                    <input type="radio" id="flats" name="livingType" value="Flats" required>
                    <label for="flats">Flats</label>
                    
                </div>
                
                <div class="owners-items">
                
                    <p>Please enter your expected rent: </p>        
                    <input type="text" placeholder="Rent" name="rent" size="40" required>
                        
                </div>
                
                <div class="owners-items">
                
                    <p>Please enter your Personal details: </p>        
                    <input type="text" placeholder="Full Name" name="ownerName" size="40" required>
                    <input type="text" placeholder="Contact No." name="ownerContact" size="40" required>
                        
                </div>
                
                <div class="owners-items">
                        
                    <textarea placeholder="Description" name="description" rows="6" cols="82" required></textarea>
                    
                </div>
                    
                <div class="owners-items">
                        
                    <input type="submit" value="Post your property">
                    
                </div>
            
            </div>
            
            </form>
</section>
<%@ include file="Footer.jsp" %>
</body>
</html>