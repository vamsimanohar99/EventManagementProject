<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Metadata</title>

<link href="css/styles1.css" rel="stylesheet" type="text/css" />
</head>
 <body>
 <div id="container">
<div id="a"><a href="AccountController?action=Logout" >Logout</a></div>
 <table id="table" class="tbl">
    <tr>
        
     
          <th><a href="ServletController?action=listevent">List Events</a></th>
       
        <th><a href="ServletController?action=insert">Add Event</a></th>
		<center><table id="table" class="tb2">
       </tr>

<table border="1" width="100%" height="100%">
<center><table id="table1" class="tb2">
    <tr>
        <th>Event Details</th>
        <th>CFP Setup</th>
        <th>Review Setup</th>
        <th>Session Setup</th>
        <th>New Event</th>
        <th>Abstract List</th>
       </tr> 
      </table>
      <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.............................................................................................................@.......................</p>
<h2>Event Metadata &nbsp client/vendor &nbsp sponsored participants </h2></center>

<form action="sponsorship.jsp"><table>
		<tr>
			<h1>sponsored Participants</h1>
			</tr>
			<tr>
			<td>speakers</td>
			 <td><input type="radio" name="yes" value="yes"> yes<br></td>
  			<td><input type="radio" name="no" value="no"> no<br></td>
			
		

		<tr>
			
			<td><input type="checkbox" id="perdem" name="perdem" value="perdem"></td>
			<td>perdem</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="travel" name="travel" value="travel"></td>
			<td>travel</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="lodging" name="lodging" value="lodging"></td>
			<td>lodging</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="groundtransportation" name="groundtransportation" value="groundtransportation"></td>
			<td>groundtransportation</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="honorarium" name="honorarium" value="honorarium"></td>
			<td>honorarium</td>
			
		</tr>
		
		
			<td>participants</td>
			 <td><input type="radio" name="yes" value="yes"> yes<br></td>
  			<td><input type="radio" name="no" value="no"> no<br></td>
  			
  			
  			<tr>
			
			<td><input type="checkbox" id="perdem" name="perdem" value="perdem"></td>
			<td>perdem</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="travel" name="travel" value="travel"></td>
			<td>travel</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="lodging" name="lodging" value="lodging"></td>
			<td>lodging</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="groundtransportation" name="groundtransportation" value="groundtransportation"></td>
			<td>groundtransportation</td>
			
		</tr>
		<tr>
			
			<td><input type="checkbox" id="honorarium" name="honorarium" value="honorarium"></td>
			<td>honorarium</td>
			
		</tr>
		</tr>
		<td align="center">
		<input type="submit" formaction="save" formmethod="post" value="save" />
		</td>
		</table>
		</form>
</table>
</table></center>
<td><input align="left" type="submit" name="next" onclick='window.location.assign("welcome.jsp")' value="next" id="next"></td>
</body></html>