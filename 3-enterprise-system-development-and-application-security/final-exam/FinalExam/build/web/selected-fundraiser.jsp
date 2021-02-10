<%-- 
    Document   : selected-fundraiser
    Created on : Dec 7, 2020, 3:00:22 PM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selected Fundraiser</title>
    </head>
    <body>
        
        <p>Fundraiser You <strong>Previously</strong> Donated To: <strong>${cookie.PreviousDonation.value}</strong></p>
        
        <h1>Selected Fundraiser:</h1>       
        <p>Title: ${SelectedFundraiser.title}</p>
        <p>Organizer: ${SelectedFundraiser.organizer}</p>
        <p>Goal Amount: ${SelectedFundraiser.goalAmount}</p>
        
        <h2>Submit a Donation:</h2>
        <form action="ServletSubmitDonation" method="post">
            <label>Your Name:</label><input type="text" name="name"><br>
            <label>Your Email:</label><input type="text" name="email"><br>
            <label>Your Amount to Donate ($):</label><input type="text" name="donationAmount"><br>
            <input type="hidden" name="selectedFundraiserId" value="${SelectedFundraiser.id}">
            <input type="hidden" name="selectedFundraiserTitle" value="${SelectedFundraiser.title}">
            <input type="submit" formaction="ServletDisplayListOfFundraisers" value="Back">
            <input type="submit" value="Donate">            
        </form>
        
    </body>
</html>
