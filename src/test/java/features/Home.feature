Feature: US_004 Bir kullanici olarak hastaneye ait bilgilere kolay erisim icin ana sayfada boardlarin olmasini istiyorum.
  @homepage
  Scenario: US_004> TC_001 Anasayfada slidebar altinda bulunan Insurance Plans,Pediatric Services, Lab Testing, Opening Hours boardlarinin gorunur olmasi testi.
    Given Kullanici Anasayfa adresine gider
    When Anasayfa slidebar altinda bulunan Insurance plans, Pediatric Services, Lab Testing, Opening Hours Boardlarinin gorunur oldugunu dogrular




  @mervenur
  Scenario:  US012  heallifehospital.com About Us menusunun olmasi testi
             TC01 bir kullanıcı olarak hastaneye ait bilgilere ulasabılmem için about us menusunun oldugu testi

    Given kullanici url adresine gider
    Then   kullanici About Us butonuna tiklar
    Then   kullanici About Hospital  basligini gorur
    When    kullanici Meet Our Doctors  basligini gorur
    When   kullanici FAQ's   basligini gorur
    Then    kullanici Departments  basligini gorur
    And    kullanici Testimonials  basligini gorur

  @mervenur

  Scenario:      US012  heallifehospital.com About Us menusunun olmasi testi
                   TC02 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden about hospital sayfsına yonlendırme testi

    Given kullanici url adresine gider
    Then   kullanici About Us butonuna tiklar
    Then   kullanici About Hospital  basligini gorur
    Then  kullanici about hospital yazisina tiklar ve sayfaya ulasir.
    Then kullanici sayfada some words about us ve our mission basligini gordugunu dogrular
    Then kullanici sayfada openin hours bilgilerini gordugunu dogrular
    When  kullanici sayfanin our specialist kisminda hastane doktorlarin resimlerini isimlerini ve title larını gorur

  @mervenur
  Scenario: US012  heallifehospital.com About Us menusunun olmasi testi
                TC03 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden meert our doctor sayfasına yonlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici meet our doctors yazisina tiklyarak sayfaya ulasir
    Then kullanici  general practitioner yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    Then kullanici ophthalmologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    Then  kullanici paediatrician yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    When kullanici cardiologist yazisina tiklayarak bu bolumde calısan doktorlari ve bilgilerini gorur
    When kullanici gynaecologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    And kullanici neurologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur

  @mervenur
  Scenario:  US012  heallifehospital.com About Us menusunun olmasi testi
             TC04  Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden FAQ sayfasına yonlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici FAQ yazisina tiklayarak sayfaya ulasir
    When kullanici bu sayfada what our clients say ve what our doctor say basliklarini  gorur
    And  kullanici sayfadaki sorulardan herhangi birini tikladiginda cevabini gorur

  @mervenur
  Scenario:  US012  heallifehospital.com About Us menusunun olmasi testi
            TC05 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden departments sayfasına yönlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    When kullanici departments yazisina tiklayarak sayfaya ulasir
    And kullanici sayfada hastahane departmanlarini resimleri ve kucuk aciklama yazisiyla birlikte gorur

  @mervenur
  Scenario: US012  heallifehospital.com About Us menusunun olmasi testi
      TC06 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden testimonials sayfasına yonlendirme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici testimonials yazisina tiklayarak sayfaya ulasir
    And kullanici sayfada hastahanede tedavi gormus kisilerin yorumlarini gorur












