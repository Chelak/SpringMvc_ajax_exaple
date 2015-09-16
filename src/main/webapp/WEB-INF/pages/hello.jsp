<html>
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

<body>
	<h1>${message}</h1>

	<div class="container">
		<div class="row">
			<div id="id01"></div>
		</div>
	</div>

</body>
<script>
	$(document).ready(function() {

		// Get all products AJAX Request

		$('#product').click(function() {
			$.ajax({
				url:"http://localhost:8080/rest/product"
			}).then(function(product){
				$('.productId').append(product.productId);
				$('.productName').append(product.productName);
				$('.productStock').append(product.productStock);
				$('.productPrice').append(product.productPrice);
				$('.productDescription').append(product.productDescription);
			});
		});



	});






</script>
<script>
	$(document).ready(function() {
		$("#test").click(function(){
			$.get("/ajax",function(data,status){
				alert("Data: " + data + "\nStatus: " + status);
			});
		});
	});
</script>

<script src="resource/js/bootstrap.js"></script>
<script src="resource/js/json.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js" type="text/javascript" ></script>
</html>