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
      <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;....................................................@..................................................................................</p>
<h2>Event Metadata &nbsp client/vendor &nbsp sponsored participants </h2></center>
<td valign="top" align="center"><br/>
		<form action="clientdetails.jsp"><table>
		<tr>
			<td colspan="2" align="center"><b>client details</b></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><b>&nbsp;</td>
		</tr>
<tr>
			<td>firstname:</td>
			<td><input id="firstname" type="text" name="firstname" required autofocus/></td>
			<br>
		</tr>
	
	<tr>
			<td>middlename:</td>
			<td><input id="middlename" type="text" name="middlename" /></td>
			<br>
		</tr>
		<tr>
			<td>lastname:</td>
			<td><input id="lastname" type="text" name="lastname" /></td>
			<br>
		</tr>
		<tr>
			<td>address:</td>
			<td><input id="address" type="text" name="address"/></td>
			<br>
		</tr>
		<tr>
			<td>country:</td>
			<td><input id="country" type="text" name="country"/></td>
			<br>
		</tr>
		<tr>
			<td>city:</td>
			<td><input id="city" type="text" name="city" /></td>
			<br>
		</tr>
		<tr>
			<td>state:</td>
			<td><input id="state" type="text" name="state" /></td>
			<br>
		</tr>
		<tr>
			<td>zip:</td>
			<td><input id="zip" type="text" name="zip" /></td>
			<br>
		</tr>
		<tr>
			<td>phone:</td>
			<td><input id="phone" type="text" name="phone" /></td>
			<br>
		</tr>
		<tr>
			<td>mobile:</td>
			<td><input id="mobile" type="text" name="mobile" /></td>
			<br>
		</tr>
		<tr>
			<td>fax:</td>
			<td><input id="fax" type="text" name="fax" /></td>
			<br>
		</tr>
		<tr>
			<td>emailid:</td>
			<td><input id="emailid" type="text" name="emailid" s/></td>
			<br>
		</tr>
		<tr>
			<td>clientweb:</td>
			<td><input id="clientweb" type="text" name="clientweb" /></td>
			<br>
		</tr>
		<tr>
			<td>organisation:</td>
			<td><input id="organisation" type="text" name="organisation" /></td>
			<br>
		</tr>
		<td align="center">
		<input type="submit" formaction="save" formmethod="post" value="save" />
		</td>
		<td><input align="right" type="submit" name="user" onclick='window.location.assign("client.jsp")' value="next" id="next"></td>
		</td></table>
	</form>	</td></table></table></center>	
</body>
</html>