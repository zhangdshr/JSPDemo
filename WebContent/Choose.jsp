<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="edu.mum.cs545.*"%>
<!DOCTYPE html>
<html>
 <head>
 <title>Choose</title>
 </head>
 <body>
 <form method='post' action='ChooseServlet'>
 <p>Is JSP cool?</p>
 <input type='radio' value='1' name='radioJSPCool' <%= RadioState.yesCheckRadioJSPCool %>><span>Yes</span><br/>
 <input type='radio' value='0' name='radioJSPCool' <%= RadioState.noCheckRadioJSPCool %>><span>No</span><br/>
 <input type='submit' name='btnSubmit' value='Submit'/>
 <p>Is JSF way cool?</p>
 <input type='radio' value='1' name='JSFwayCool' <%= RadioState.yesCheckJSFwayCool %>><span>Yes</span><br/>
 <input type='radio' value='0' name='JSFwayCool' <%= RadioState.noCheckJSFwayCool %>><span>No</span><br/>
 <input type='submit' name='btnSubmit' value='Submit'/>
 <p>Is the moon made of cheese?</p>
 <input type='radio' value='1' name='moonCheese' <%= RadioState.yesCheckMoonCheese %>><span>Yes</span><br/>
 <input type='radio' value='0' name='moonCheese' <%= RadioState.noCheckMoonCheese %>><span>No</span><br/>
 <input type='submit' name='btnSubmit' value='Submit'/>
 </form>
 </body>
</html>