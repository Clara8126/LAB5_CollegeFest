<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Save Student</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<h3>Save Student</h3>
		<form action="/StudentManagement/students/save" method="post">
          <input type="hidden" name="id" value="${student.id}">
          <div class="form-inline">
				<input type="text" name="FirstName" value="${student.Firstname}"
					placeholder="FirstName" class="form-control mb-4 col-4">
			</div>
			<div class="form-inline">
				<input type="text" name="LastName" value="${student.Lastname}"
					placeholder="LastName" class="form-control mb-4 col-4">
			</div>
			<div class="form-inline">
				<input type="text" name="Department" value="${student.department}"
					placeholder="Department" class="form-control mb-4 col-4">
			</div>
			<div class="form-inline">
				<input type="text" name="Country" value="${student.country}"
					placeholder="Country" class="form-control mb-4 col-4">
			</div>
			<button type="submit" class="btn btn-info col-2">Submit</button>
		</form>

		<a href="/StudentManagement/students/list">Back to Student List</a>

	</div>
</body>
</html>