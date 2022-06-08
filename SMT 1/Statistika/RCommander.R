
editDataset(uji1)
editDataset(uji1)
uji2 <- read.table("E:/tugas 2020/Statistika/uji2.txt", header=TRUE, 
  stringsAsFactors=TRUE, sep="", na.strings="NA", dec=".", strip.white=TRUE)
uji2 <- read.table("E:/tugas 2020/Statistika/uji2.txt", header=TRUE, 
  stringsAsFactors=TRUE, sep="", na.strings="NA", dec=".", strip.white=TRUE)
uji1 <- within(uji1, {
  IPK_Kode <- Recode(IPK, '0 : 1.9 = 1; 2 : 2.9 = 2; else = 3', 
  as.factor=TRUE)
})
uji1$Sks_baru <- with(uji1, Sks+20)
uji1$Sks_baru <- with(uji1, Sks+20)
uji1 <- within(uji1, {
  IPK_Kode <- NULL 
})
uji1 <- uji1[-c(2,3),]
editDataset(Lat1A)
Lat1A <- within(Lat1A, {
  kd_nil <- Recode(Nilai, 
  '0 - 20 = 1; 21 - 40 = 2; 41 - 60 = 3; 61 - 100 = 4; 81 - 100 = 5', 
  as.factor=TRUE)
})
Lat1A <- within(Lat1A, {
  kd_nil <- Recode(Nilai, 
  '0 - 20 = 1; 21 - 40 = 2; 41 - 60 = 3; 61 - 100 = 4; 81 - 100 = 5;', 
  as.factor=TRUE)
})
Lat1A <- within(Lat1A, {
  kd_nil <- Recode(Nilai, 
  '0 : 20 = 1; 21 : 40 = 2; 41 : 60 = 3; 61 : 100 = 4; 81 : 100 = 5; ;', 
  as.factor=TRUE)
})
tgs1A$INSENTIF <- with(tgs1A, Banyak * 1000)
tgs1A$INSENTIF <- with(tgs1A, Banyak * 1000)

