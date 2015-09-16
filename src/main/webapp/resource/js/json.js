/**
 * Created by user on 9/16/2015.
 */
var xmlhttp = new XMLHttpRequest();
var url = "http://localhost:8080/rest/products";

xmlhttp.onreadystatechange=function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
        myFunction(xmlhttp.responseText);
    }
}
xmlhttp.open("GET", url, true);
xmlhttp.send();
function myFunction(response) {
    var arr = JSON.parse(response);
    var i;
    var out = "<table>";

    for(i = 0; i < arr.length; i++) {
        out += "<tr><td>" +
            arr[i].productId +
            "</td><td>" +
            arr[i].productName +
            "</td><td>" +
            arr[i].productStock +
            "</td></tr>"+
            arr[i].productPrice +
            "</td></tr>"+
            arr[i].productDescription +
            "</td></tr>";
    }
    out += "</table>";
    document.getElementById("id01").innerHTML = out;
}