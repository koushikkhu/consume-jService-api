<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Clue</h1>
			<h2>Question: ${clue.question}</h2>
			<h2>Answer: ${clue.answer}</h2>
			
			<p>
				Click on this button to see random clue
				<input type="button" name="button" value="refresh" onclick="randomclue();" />
			</p>
		</div>
	</div>
	<script>
	function randomNumber(min, max) { 
	    return Math.floor(Math.random() * (max - min + 1) + min);
	}	
	function randomclue() {
		var clueId = randomNumber(1,100);
	  	window.location = 'http://localhost:8080/clues/clue/' + clueId;
	}
	</script>	
</body>
</html>
