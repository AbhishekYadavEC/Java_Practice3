<!DOCpath html>
<%@page isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Customer Form</title>
</head>
<body>
    <form:form action="calcEmi" modelAttribute="emi">
        Enter Principal amount:<form:input path="principal"/><br>

        Enter Rate of Interest:<form:input path="rateOfInt"/><br>

        Enter Time in Years:<form:input path="timeInYears"/><br>

        <input type="submit" value="Calulate EMI"/>  <br>
        </form:form>
</body>
</html>