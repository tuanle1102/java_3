CREATE DATABASE QLCC
go

USE QLCC
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[users](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
	[pass] [nvarchar](50) NULL,
	[quyen] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

USE QLCC
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE listds(
	id int IDENTITY(1,1) NOT NULL,
	hoten nvarchar(100) NULL,
	namsinh nvarchar(100) NULL,
	sdt nvarchar(100) NULL,
	gioitinh nvarchar(100) NULL,
	maphong nvarchar(100) PRIMARY KEY,
	hinh image NULL
)

GO

CREATE TABLE HoaDon
(
	[stt] [int] IDENTITY(1,1) NOT NULL,
	maHD NVARCHAR(100) PRIMARY KEY,
	hoten NVARCHAR(100) NOT NULL,
	maphong  NVARCHAR(100) NOT NULL,
	time Date NOT NULL,
	trangthai NVARCHAR(100)

	FOREIGN KEY (maphong) REFERENCES dbo.listds(maphong)
)
go

INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('buichihien','a12345','Admin') 
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('lequoctuan','b12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('maivanminh','c12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('nguyenquanbao','d12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('nguyentrungkhoa','e12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('tranthanhhoai','f12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('nguyendacmaikhanh','g12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('nguyenchautuan','j12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('nguyenxuangiang','l12345','user')
INSERT INTO [dbo].[users] (name, pass, quyen) VALUES('nguyenthanhdanh','p12345','user')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('bùi chí hiền','2002','023987865','Nam','p001')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('lê quốc tuấn','2002','023987865','Nam','p001')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('mai văn minh','2002','023987865','Nam','p001')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('hà','2002','023987865','Nữ','p001')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('trang','2002','023987865','Nữ','p001')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('quốc','2002','023987865','Nam','p102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('hùng','2002','023987865','Nam','p102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('chí','2002','023987865','Nam','p102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('mỹ','2002','023987865','Nữ','p102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('an','2002','023987865','Nữ','p102')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('quyên','2002','023987865','Nữ','p103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('diệu','2002','023987865','Nữ','p103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('linh','2002','023987865','Nữ','p103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('khánh','2002','023987865','Nam','p103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('hậu','2002','023987865','Nam','p103')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('long','2002','023987865','Nam','p104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tiến','2002','023987865','Nam','p104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tình','2002','023987865','Nam','p104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('bạch','2002','023987865','Nam','p104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('phát','2002','023987865','Nam','p104')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('trung','2002','023987865','Nam','p201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('nghĩa','2002','023987865','Nam','p201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('nhân','2002','023987865','Nam','p201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('trí','2002','023987865','Nam','p201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tính','2002','023987865','Nam','p201')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('quan vũ','2002','023987865','Nam','p202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('trương phi','2002','023987865','Nam','p202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('triệu tử long','2002','023987865','Nam','p202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('mã siêu','2002','023987865','Nam','p202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('hoàng trung','2002','023987865','Nam','p202')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('lữ bố','2002','023987865','Nam','p203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('điêu thuyền','2002','023987865','Nữ','p203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('đổng trác','2002','023987865','Nam','p203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('trần cung','2002','023987865','Nữ ','p203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('phụng tiên','2002','023987865','Nam','p203')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tào tháo','2002','023987865','Nam','p204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tào phi','2002','023987865','Nam','p204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tào hồng','2002','023987865','Nam','p204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tào nhuệ','2002','023987865','Nam','p204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('tào ngang','2002','023987865','Nam','p204')

INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd1','bùi chí hiên','p001','2022-09-08','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd2','lê quốc tuấn','p001','2022-10-08','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd3','mai văn minh','p001','2022-11-05','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd4','tào tháo','p204','2022-09-10','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd5','tào phi','p204','2022-01-20','Đã thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd6','tào hồng','p204','2022-09-27','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd7','tào nhuệ','p204','2022-04-23','Đã thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd8','tào ngang','p204','2022-05-06','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd9','quan vũ','p202','2022-02-09','Đã thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd10','trương phi','p202','2022-04-15','Chưa thanh toán')