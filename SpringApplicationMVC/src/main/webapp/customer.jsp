<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<title>Customer Details Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h1>Customer Details Form</h1>
        <form:form method="POST" class="col-3" action="saveCustomer" modelAttribute="customer">
            <div class="form-group">
                <label for="customerId">Customer ID:</label>
                <form:input path="customerId" id="customerId" class="form-control" />
            </div>
            <div class="form-group">
                <label for="customerName">Customer Name:</label>
                <form:input path="customerName" id="customerName" class="form-control" />
            </div>
            <div class="form-group">
                <label for="dateOfBirth">Date of Birth:</label>
                <form:input path="dateOfBirth" id="dateOfBirth" class="form-control" />
            </div>
            <div class="form-group">
                <label for="aadhar">Aadhar:</label>
                <form:input path="aadhar" id="aadhar" class="form-control" />
            </div>
            <button type="submit" class="btn btn-primary mt-3">Submit</button>
        </form:form>
    </div>
</body>
</html>