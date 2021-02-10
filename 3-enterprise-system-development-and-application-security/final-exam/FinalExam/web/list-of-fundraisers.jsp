<%-- 
    Document   : list-of-fundraisers
    Created on : Dec 7, 2020, 2:38:46 PM
    Author     : Owner
--%>

<%@page import="edu.txstate.mjm356.Fundraiser"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Of Fundraisers</title>
    </head>
    <body>
        <h1>Fundraisers that you can donate to:</h1>
        <%
            ArrayList<Fundraiser> fundraisers = (ArrayList<Fundraiser>) request.getAttribute("FundraiserList");
            for(Fundraiser aFundraiser : fundraisers){
        %>
        
        <p><%=aFundraiser.getId()%> : <%=aFundraiser.getTitle()%> : <%=aFundraiser.getOrganizer()%> : <%=aFundraiser.getGoalAmount()%> <a href="ServletSelectedFundraiser?fundraiserId=<%=aFundraiser.getId()%>">Select</a></p>
        
        <%
            }
        %>
    </body>
</html>
