package atmuyg;

import java.util.Scanner;

public class atmuyg {

	public atmuyg() {
		
	}

	public static void main(String[] args) {
		
		String islemSecenekleri = "Bakiye görüntülemeiçin 1"+"Para cekmek için 2"+
		"Farklı hesaba para yatırmak için 3"+"çıkmak için  q tuşuna basın";
		
		Scanner scanner = new Scanner(System.in);
		
		
		double elifBakiye=2450;
		String elifIban="1234 1234";
		String elifKullanici="elif123";
		String elifSifre="1234";
		
		
		double dilekBakiye=1200;
		String dilekIban="5678 5678";
		String dilekKullanici="dilek567";
		String dilekSifre="5678";
		
		
		
		System.out.println("ATM'YE HOŞGELDİNİZ");
		System.out.println("LÜTFEN BİLGİLERİNİZİ GİRİNİZ");
		
		System.out.println("KULLANICI ADI  :");
		String kullaniciAdi =scanner.nextLine();
		
		System.out.println("Sifre :");
		String sifre =scanner.nextLine();
		
		if(kullaniciAdi.equals("elif123")&& sifre.equals("1234"))
		{
			System.out.println("ElifX hesabına giriş yapıldı...");
			System.out.println(islemSecenekleri);
			
			System.out.println("lutfen bir secim yapiniz :");
			String secim = scanner.nextLine();
			
			switch(secim) 
			{
			case "1":
			System.out.println("Bakiyeniz :" + elifBakiye);
			break;
			
			case "2":
			System.out.println("Çekmek istediğiniz tutarı girin :");
			int cekilecekTutar = scanner.nextInt();
			if(elifBakiye>=cekilecekTutar)
			{
				elifBakiye-=cekilecekTutar;
				System.out.println("Kalan tutar : "+ elifBakiye);
			}else {
				System.out.println("Yeterli bakiye yok");
			}
			break;
			
			case"3":
				System.out.println("Ne kadar yatırmak istiyorsunuz");
				int yatirilacakTutar = scanner.nextInt();
				if(yatirilacakTutar<=elifBakiye) {
					System.out.println("iban giriniz :");
					scanner.nextLine();
					String yatirilacakIBAN = scanner.nextLine();
					if(yatirilacakIBAN.equals(dilekIban)) {
						System.out.println("para dilekX kişisine yatiriliyor");
						elifBakiye-=yatirilacakTutar;
						dilekBakiye+=yatirilacakTutar;
						
						System.out.println("bakiyeniz : "+ elifBakiye);
						System.out.println("dilekin bakiyesi: "+ dilekBakiye);
					}
				}
				break;
			
			}
		}
		else if(kullaniciAdi.equals("dilek567")&&sifre.equals("5678")) {
			System.out.println("DilekX hesabına giriş yapıldı...");
			System.out.println(islemSecenekleri);
			System.out.println("lutfen bir secim yapiniz :");
			String secim = scanner.nextLine();
			switch(secim) 
			{
			case "1":
			System.out.println("Bakiyeniz :" + dilekBakiye);
			break;
			
			case "2":
			System.out.println("Çekmek istediğiniz tutarı girin :");
			int cekilecekTutar = scanner.nextInt();
			if(dilekBakiye>=cekilecekTutar)
			{
				dilekBakiye-=cekilecekTutar;
				System.out.println("Kalan tutar : "+ dilekBakiye);
			}else {
				System.out.println("Yeterli bakiye yok");
			}
			break;
			
			case"3":
				System.out.println("Ne kadar yatırmak istiyorsunuz");
				int yatirilacakTutar = scanner.nextInt();
				if(yatirilacakTutar<=dilekBakiye) {
					System.out.println("iban giriniz :");
					scanner.nextLine();
					String yatirilacakIBAN = scanner.nextLine();
					if(yatirilacakIBAN.equals(elifIban)) {
						System.out.println("para elifX kişisine yatiriliyor");
						dilekBakiye-=yatirilacakTutar;
						elifBakiye+=yatirilacakTutar;
						
						System.out.println("bakiyeniz : "+ dilekBakiye);
						System.out.println("elifin bakiyesi: "+ elifBakiye);
					}
				}
				break;
			
			}
		}
		else {
			System.out.println("Kullanıcı adınız veya şifreniz yanlış");
		}
		

	}

}
