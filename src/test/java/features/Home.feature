Feature: US_004 Bir kullanici olarak hastaneye ait bilgilere kolay erisim icin ana sayfada boardlarin olmasini istiyorum.
  @homepage
  Scenario: US_004> TC_001 Anasayfada slidebar altinda bulunan Insurance Plans,Pediatric Services, Lab Testing, Opening Hours boardlarinin gorunur olmasi testi.
    Given Kullanici Anasayfa adresine gider
    When Anasayfa slidebar altinda bulunan Insurance plans, Pediatric Services, Lab Testing, Opening Hours Boardlarinin gorunur oldugunu dogrular
