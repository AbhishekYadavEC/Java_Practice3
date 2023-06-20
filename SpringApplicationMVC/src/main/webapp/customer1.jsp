<!DOCTYPE html>
 <%@page isELIgnored="false"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <title>Customer Registration</title>
 </head>
 <body>
    <h2>Register Customer</h2>

    <form:form method="post" modelAttribute="customerDetails">
        <label >Customer ID:</label>
        <form:input path="Customer_ID"/><br>

        <label >First Name:</label>
        <form:input path="First_name"/><br>

        <label >Last Name:</label>
        <form:input path="Last_name"/><br>

        <label>Gender:</label>
        <form:radiobutton path="Gender" value="M"/>
        <label >Male</label>
        <form:radiobutton path="Gender" value="F"/>
        <label >Female</label><br>

        <label >Date of Birth:</label>
        <form:input path="Date_Of_Birth"/><br>

        <label >Contact Number:</label>
        <form:input  path="Contact_Number"/><br>

        <label >Email Address:</label>
        <form:input  path="Email_Address"/><br>

        <label >Monthly Income:</label>
        <form:input  path="Monthly_Income"/><br>

        <label >Profession:</label>
        <form:input  path="Profession"/><br>

        <label >Total Monthly Expense:</label>
        <form:input  path="Total_Monthly_Expense"/><br>

        <label >Designation:</label>
        <form:input  path="Designation"/><br>

        <label >Company Name:</label>
        <form:input  path="Company_Name"/><br>

        <button name="submit" type="submit" value="register" formAction="Register">Register</button>
        <button name="add" type="submit" value="add" formAction="Register">add</button>
        <button name="update" type="submit" value="update" formAction="update">update</button>
        <button name="fetch" type="submit" value="fetch" formAction="fetch">fetch</button>

    </form:form>
</body>
</html>
