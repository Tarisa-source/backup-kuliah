function kakulatorMini() {
	var n1 = parseFloat(document.getElementById('n1').value);
	var n2 = parseFloat(document.getElementById('n2').value);
	var pilihan = document.getElementById('operator').value;
	if (pilihan === '+') {
		document.getElementById('result').value = n1+n2;
	}

	if (pilihan === '-') {
		document.getElementById('result').value = n1-n2;
	}

	if (pilihan === '/') {
		document.getElementById('result').value = n1 /n2;
	}

	if (pilihan === '*') {
		document.getElementById('result').value = n1 * n2;
	}
}