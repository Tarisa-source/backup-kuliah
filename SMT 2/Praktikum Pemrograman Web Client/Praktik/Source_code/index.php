<!DOCTYPE html>
<html lang="en">
<head>
	<title>Rumah Makan Sawahan</title>
	<link rel="stylesheet" type="text/css" href="tampilan.css">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1 " >
</head>
<body style="border-style: none;">
<div class="container">
	<div class="header">
		<h1>"Peminjaman Barang"</h1>
	</div>
	<div class="row">
		<div class="column midle">
			<form method="post" action="proses.php" id="form">
				<ol type="A">
					<li>ALat</li>
					<ol type="none">
						<li>Router</li>
						<li>Leptop</li>
						<li>Komputer Tablet</li>
						<li>LCD Proyekto</li>
					</ol>
						
				</ol>
				<input type="submit" id="bayar" name="bayar" value="Pinjam" style="	background-color: #ff99ff;height: 45px;width: 60px;padding-right: 10px;padding-left: 10px; float: right;">
			</form>
		</div>

		<div class="column midle">
			<table>
				<thead>
					<tr>
						<th>NIM</th>
						<th>Nama</th>
						<th>Barang</th>
						<th>Total</th>
						<th>Tgl.pinjam</th>
						<th>Tgl.kembali</th>
					</tr>
					<tr>
						<?php 
							include 'pinjam.php';
						 ?>
					</tr>
				</thead>
			</table>
		</div>
	</div>
		
	<div class="row">
		<div class="footer">
			<p>©2021</p>
		</div>
	</div>
</div>
</body>
</html>