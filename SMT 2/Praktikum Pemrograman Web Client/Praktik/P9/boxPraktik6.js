function myfunction() {
	var person = prompt("Silahkan masukan nama ","Harus huruf !");
	if (person!= null) {
		document.getElementById('demo').innerHTML = "Hallo "+person+" Tetap semangatkan ??";
	}
}