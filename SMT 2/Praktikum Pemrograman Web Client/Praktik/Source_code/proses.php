<?php
include 'koneksi.php';
		
?>

<!DOCTYPE html>
<html>
<head>
	<title>Peminjaman</title>
	<link rel="stylesheet" type="text/css" href="tampilan_pinjam.css">
</head>
<body>
	<div class="container">
		<div class="main">
			<form method="post" action="index.php" id="form">
				<h3>Data Peminjaman Barang</h3>
				<hr>
				<label>NIM : </label>
				<input type="text" name="nim" id="nim">
				<label>Nama : </label>
				<input type="text" name="nama" id="nama">
				<input type="checkbox" name="barang[]" value="Router">Router
				<input type="checkbox" name="barang[]" value="Leptop">Leptop
				<br>
				<input type="checkbox" name="barang[]" value="Komputer_tablet">Komputer Tablet
				<input type="checkbox" name="barang[]" value="LCD">LCD Proyekto
				<br>
				<label>Total barang : </label>
				<input type="number" name="total_barang" id="total_barang">
				<br>
				<label>Tgl.pinjam :  </label>
				<br>
				<input type="date" name="tgl_pinjam" id="tgl_pinjam">
				<br>
				<label>Tgl.kembali : </label>
				<br>
				<input type="date" name="tgl_kembali" id="tgl_kembali">
				<br>
				<br>
				<br>
				<hr>
				<input type="submit" name="submit" id="submit" value="Selesai" style="	float: right;font-style: fantasy;">
			</form>
		</div>
	</div>
</body>
</html>