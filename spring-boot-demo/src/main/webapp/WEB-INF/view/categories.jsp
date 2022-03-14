<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body onload="displayListOfCategories()">
	<div>
		<div>
			<h1>Categories</h1>
		</div>
	</div>
	<script>
		function displayListOfCategories() {
			let categoryNames = "";
			for (let category of ${categories}) {
  				categoryNames += "<li>" + category.title + "</li>"; 
			}
		}
	</script>
	displayListOfCategories()
</body>
</html>
