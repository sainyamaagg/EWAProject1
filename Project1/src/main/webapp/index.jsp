<!DOCTYPE html>
<html lang="en">
    
    <head>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>House Rental Management System</title>
        <link rel="stylesheet" type="text/css" href="CSS/style.css">
        <link rel="stylesheet" href="CSS/fontawesome.min.css">
        <link rel="stylesheet" href="CSS/all.min.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;600;700&display=swap" rel="stylesheet">
        <link rel="icon" href="Assets/fav.ico.ico">
        <%--<jsp:include page="/VisitServlet"/> --%>
    
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
        
        <section class="showcase">
            
            <div class="showcase-content">
                
                <h1>India's No. 1 Property Portal We Make A Difference</h1>
                
                <p>Property owners get free posting when they register <br> 
                Get to know about newly posted properties <br>
                Manage your properties with ease <br>
                Get Instant alerts about responses</p>
                
                <a href="buyers.jsp" class="btn">Search a property</a>
                <a href="login.jsp" class="btn">Post a property</a>
            
            </div>
        
        </section>
        
        <section class="about">
            
            <div class="about-container" id="aboutid">
                
                <h2 class="about-heading">Why Use Rental</h2>
                
                <div class="about-wrapper">
                    
                    <div class="about-image">
                        
                        <img src="Assets/photo-1560518883-ce09059eeffa.jpg" alt="Why Use Rental">
                    
                    </div>
                    
                    <div class="about-content">
                        
                        <h2>World's Largest NoBrokerage Property Site</h2>
                        
                        <ul class="fa-ul">
                            
                            <li>
                                
                                <span class="fa-li"><i class="fas fa-circle-notch"></i></span>
                                We directly connect you to verified owners
                            
                            </li>
                            
                            <li>
                                
                                <span class="fa-li"><i class="fas fa-circle-notch"></i></span>
                                Easy listing process
                            
                            </li>
                            
                            <li>
                                
                                <span class="fa-li"><i class="fas fa-circle-notch"></i></span>
                                Extensive information makes it easy
                            
                            </li>
                        
                        </ul>
                    
                    </div>
                
                </div>
            
            </div>
        
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
                
                <span>All Rights Reserved Made by - Group 2</span><br>
                <span><jsp:include page="/VisitServlet"/></span>
            
            </div>
        
        </footer>
    
    </body>

</html>
