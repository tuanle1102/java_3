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
	maphong nvarchar(100) NULL,
	hinh image NULL
)

GO

CREATE TABLE HoaDon
(
	[id] [int] IDENTITY(1,1) NOT NULL,
	maHD NVARCHAR(100) PRIMARY KEY,
	hoten NVARCHAR(100) NOT NULL,
	maphong  NVARCHAR(100) NOT NULL,
	time Date NOT NULL,
	trangthai NVARCHAR(100)	
)
go

CREATE TABLE Phong
(
	[id] [int] IDENTITY(1,1) NOT NULL,
	maphong NVARCHAR(100) PRIMARY KEY	
)
go

INSERT INTO [dbo].[Phong] (maphong) VALUES('P101') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P102') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P103') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P104') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P201') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P202') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P203') 
INSERT INTO [dbo].[Phong] (maphong) VALUES('P204') 

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

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Bùi Chí Hiền','2002','023987865','Nam','P101')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Lê Quốc Tuấn','2002','023987865','Nam','P101')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Mai Văn Minh','2002','023987865','Nam','P101')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Hà','2002','023987865',N'Nữ','P101')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Trang','2002','023987865',N'Nữ','P101')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Quốc','2002','023987865','Nam','P102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Hùng','2002','023987865','Nam','P102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Chí','2002','023987865','Nam','P102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Mỹ','2002','023987865',N'Nữ','P102')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'An','2002','023987865',N'Nữ','P102')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('Quyên','2002','023987865',N'Nữ','P103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Diệu','2002','023987865',N'Nữ','P103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('Linh','2002','023987865',N'Nữ','P103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Khánh','2002','023987865','Nam','P103')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Hậu','2002','023987865','Nam','P103')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('Long','2002','023987865','Nam','P104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tiến','2002','023987865','Nam','P104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tình','2002','023987865','Nam','P104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Bạch','2002','023987865','Nam','P104')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Phát','2002','023987865','Nam','P104')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES('Trung','2002','023987865','Nam','P201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Nghĩa','2002','023987865','Nam','P201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Nhân','2002','023987865','Nam','P201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Trí','2002','023987865','Nam','P201')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tính','2002','023987865','Nam','P201')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Quan vũ','2002','023987865','Nam','P202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Trương phi','2002','023987865','Nam','P202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Triệu tử long','2002','023987865','Nam','P202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Mã siêu','2002','023987865','Nam','P202')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Hoàng trung','2002','023987865','Nam','P202')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Lữ Bố','2002','023987865','Nam','P203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Điêu Thuyền','2002','023987865',N'Nữ','P203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Đổng Trác','2002','023987865','Nam','P203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Trần Cung','2002','023987865',N'Nữ ','P203')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Phụng Tiên','2002','023987865','Nam','P203')

INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tào Tháo','2002','023987865','Nam','P204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tào Phi','2002','023987865','Nam','P204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tào Hồng','2002','023987865','Nam','P204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tào Nhuệ','2002','023987865','Nam','P204')
INSERT INTO [dbo].[listds] (hoten, namsinh, sdt, gioitinh, maphong) VALUES(N'Tào Ngang','2002','023987865','Nam','P204')

INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd1',N'Bùi Chí Hiên','P101','2022-09-08','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd2',N'Quốc','P102','2022-10-08','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd3',N'Quyên','P103','2022-11-05','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd4',N'Long','P104','2022-09-10','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd5',N'Trung','P201','2022-01-20',N'Đã thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd6',N'Quan vũ','P202','2022-09-27','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd7',N'Lữ Bố','P203','2022-04-23',N'Đã thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd8',N'Tào Ngang','P204','2022-05-06','Chưa thanh toán')
INSERT INTO [dbo].[HoaDon] (maHD, hoten, maphong, time, trangthai) VALUES('hd9',N'Quan Vũ','P202','2022-02-09',N'Đã thanh toán')
