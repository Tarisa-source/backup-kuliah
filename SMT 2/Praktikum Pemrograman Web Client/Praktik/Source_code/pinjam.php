<?php 
include 'koneksi.php';
	if (isset($_POST['nim'])) {
		$nim = $_POST['nim'];
		$nama = $_POST['nama'];
		$total_barang = $_POST['total_barang'];
		$tgl_pinjam = $_POST['tgl_pinjam'];
		$tgl_kembali = $_POST['tgl_kembali'];


			if (!empty($_POST['barang'])) {
					foreach ($_POST['barang'] as $selected) {
						$sql="insert into bayar (nim,nama,total_barang,tgl_pinjam,tgl_kembali,barang) values ('$nim','$nama','$total_barang','$tgl_pinjam','$tgl_kembali','$selected')";
						$hasil=mysqli_query($kon,$sql);
						echo "<style>
						td{
							width: 8%;
							text-align: left;
							background-color:  #ff99ff;
							color: white;
							border: hidden;
							padding: 2px;
							padding-right: 2px;
						}
							</style>
							<table width=100%  >
							<tr>
								<td>$nim</>
								<td>$nama</td>
								<td>$selected</td>
								<td>$total_barang</td>
								<td>$tgl_pinjam</td>
								<td>$tgl_kembali</td>
							<tr>
							<?php

							?>
						</table>";
				}
			
		}
		
			
	} 

 ?>