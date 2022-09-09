package day2_homework_30;

public class Product {
	
	// Kisitlanma Yada Yetkilendirme Isleminde Kullanilan Ozellikler
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String productCode;
	
	// get Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// return Komutu Ile Okunacak Veriyi Donduruyoruz 
	public int getId() {
		return id;
	}
	
	// set Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// Bu Kisimda this Anahtar Kelimesi Fonksiyonun Bulundugu Class Icindeki Id yi Belirtir
	// id Ise Set Fonksiyonu Icindeki Parametre Olan Id yi Belirtir
	public void setId(int id) {
		this.id = id;
	}

	// get Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// return Komutu Ile Okunacak Veriyi Donduruyoruz
	public String getName() {
		return name;
	}
	
	// set Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// Bu Kisimda this Anahtar Kelimesi Fonksiyonun Bulundugu Class Icindeki name i Belirtir
	// name Ise Set Fonksiyonu Icindeki Parametre Olan name i Belirtir
	public void setName(String name) {
		this.name = name;
	}
	
	// get Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// return Komutu Ile Okunacak Veriyi Donduruyoruz
	public String getDescription() {
		return description;
	}
	
	// set Ile Baslayan Fonksiyon Veriyi Okumak ��in Kullanilir
	// Bu Kisimda this Anahtar Kelimesi Fonksiyonun Bulundu�u Class Icindeki description � Belirtir
	// id Ise Set Fonksiyonu Icindeki Parametre Olan Description � Belirtir
	public void setDescription(String description) {
		this.description = description;
	}
	
	// get Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// return Komutu Ile Okunacak Veriyi Donduruyoruz
	public double getPrice() {
		return price;
	}
	
	// set Ile Baslayan Fonksiyon Veriyi Okumak ��in Kullanilir
	// Bu Kisimda this Anahtar Kelimesi Fonksiyonun Bulundu�u Class Icindeki price � Belirtir
	// price Ise Set Fonksiyonu Icindeki Parametre Olan price � Belirtir
	public void setPrice(int price) {
		this.price = price;
	}

	// get Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// return Komutu Ile Okunacak Veriyi Donduruyoruz
	public int getStockAmount() {
		return stockAmount;
	}
	
	// set Ile Baslayan Fonksiyon Veriyi Okumak ��in Kullanilir
	// Bu Kisimda this Anahtar Kelimesi Fonksiyonun Bulundu�u Class Icindeki stokAmount u Belirtir
	// stockAmount Ise Set Fonksiyonu Icindeki Parametre Olan stockAmount u Belirtir
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	// get Ile Baslayan Fonksiyon Veriyi Okumak Icin Kullanilir
	// return Komutu Ile Okunacak Veriyi Donduruyoruz
	public String getColor() {
		return color;
	}
	
	// set Ile Baslayan Fonksiyon Veriyi Okumak ��in Kullanilir
	// Bu Kisimda this Anahtar Kelimesi Fonksiyonun Bulundu�u Class Icindeki color � Belirtir
	// color Ise Set Fonksiyonu Icindeki Parametre Olan color � Belirtir
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getProductCode() {
		return this.name.substring(0,1) + id;
	}
}