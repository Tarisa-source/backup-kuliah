<?php
	if (isset($_POST['nama'])) {
		$nama = $_POST['nama'];

		echo "<span class='success'>Dengan <b> METODE POST</b></span>";
		echo "<br>Nama : ".$nama;
	} 

?>