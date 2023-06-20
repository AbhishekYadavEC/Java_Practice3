<!DOCpath html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page isELIgnored="false"%>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration</h2>
    <form:form method="POST" action="register" modelAttribute="userForm">
        <table>
            <tr>
                <td>Username:</td>
                <td><form:input path="username" />
                    <form:errors path="username"/>
                </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><form:radiobutton path="gender" value="male" label="Male"/>
                    <form:radiobutton path="gender" value="female" label="Female"/></td>
            </tr>
            <tr>
                 <td>Hobbies :</td>
                 <td>
                 Dancing : <form:checkbox path="hobbies" value="dancing"/>
                 Cricket : <form:checkbox path="hobbies" value="cricket"/>
                 Listening Song :<form:checkbox path="hobbies" value="song"/>
                 </td>
            </tr>
            <tr>
                <td>Preferred Holiday Location:</td>
                <td><form:select path="preferredHolidayLocation">
                        <option value="">Select</option>
                        <option value="temple">Temple</option>
                        <option value="market">Market</option>
                        <option value="mountain">Mountain</option>
                        <option value="city">City</option>
                    </form:select></td>
            </tr>
              <tr>
                  <td>Date of Birth:</td>
                  <td><form:input path="birthDate"/></td>
                  <td><form:errors path="birthDate"/></td>
              </tr>
        </table>
        <input type="submit" value="Register"/>
    </form:form>

</body>

</html>