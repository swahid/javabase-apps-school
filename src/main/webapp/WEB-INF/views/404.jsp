<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>404 Page no found</title>
	<meta name="viewport" content="width=device-width">
	<link href="<c:url value='/resources/css/error.css' />" rel="stylesheet"></link>
</head>
<body>
	<div class="error-page-wrap">
		<article class="error-page gradient">
			<hgroup>
				<h1>404</h1>
				<h2>oops! page not found</h2>
			</hgroup>
			<a href="<c:url value='/' />" title="Back to site" class="error-back">back</a>
		</article>
	</div>
</body>
</html>