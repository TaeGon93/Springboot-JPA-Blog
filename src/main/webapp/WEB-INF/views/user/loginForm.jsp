<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>

<div class="container">
	<form action="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="username">User Name:</label> <input type="text" class="form-control" placeholder="Enter UserName" id="username" name="username">
		</div>

		<div class="form-group">
			<label for="password">Password:</label> <input type="password" class="form-control" placeholder="Enter password" id="password" name="password">
		</div>

		<button id="btn-login" class="btn btn-primary">로그인</button>
	</form>
	
</div>

<%@include file="../layout/footer.jsp"%>


