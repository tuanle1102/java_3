CREATE DATABASE QLCC
go

USE [QLCC]
GO

/****** Object:  Table [dbo].[users]    Script Date: 11/11/2022 11:05:32 AM ******/
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

USE [QLCC]
GO

/****** Object:  Table [dbo].[listds]    Script Date: 11/11/2022 11:06:03 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[listds](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[hoten] [nvarchar](100) NULL,
	[namsinh] [nvarchar](100) NULL,
	[sdt] [nvarchar](100) NULL,
	[gioitinh] [nvarchar](100) NULL,
	[maphong] [nvarchar](100) NULL,
	[hinh] [image] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

CREATE TABLE HoaDon
(
	maHD  NVARCHAR(100),
	hotenchuho NVARCHAR(100) NOT NULL,
	canho NVARCHAR(100) NOT NULL,
	time Date NOT NULL,
	trangthai NVARCHAR(100)
)
go