Feature: US_004 Bir kullanici olarak hastaneye ait bilgilere kolay erisim icin ana sayfada boardlarin olmasini istiyorum.

  Scenario: US_004> TC_001 Anasayfada slidebar altinda bulunan Insurance Plans,Pediatric Services, Lab Testing, Opening Hours boardlarinin gorunur olmasi testi.
    Given Kullanici Anasayfa adresine gider
    When Anasayfa slidebar altinda bulunan Insurance plans yazisinin gorunur oldugunu dogrular,
    Then Pediatric Services yazisinin gorunur oldugunu dogrular,
    Then Lab Testing boardunun gorunur oldugunu dogrular,
    When Opening Hours Boardlarinin gorunur oldugunu dogrular


    Scenario: US_004> TC_002
    Anasayfada slidebar altinda bulunan Insurance Plans,Pediatric Services, Lab Testing, Opening Hours boardlarinda read morea tiklanildiginda dogru sayfaya yonlendirilmesi testi.
      Given Kullanici Anasayfa adresine gider
      When Anasayfa slidebar altinda bulunan Insurance plans yazisinda read more butonuna tiklar ve Acilan sayfada insurance plans yazisinin oldugunu dogrular
      Then Anasayfaya geri doner
      Then Pediatric Services yazisinda read more butonuna tiklar ve Acilan sayfada our pediatric services yazisinin oldugunu dogrular
      Then Anasayfaya geri doner
      Then Lab Testing yazisinda read more butonuna tiklar ve Acilan sayfada Lab Testing Services yazisinin oldugunu dogrular

  #US_019 Bir kullanici (hasta) olarak OPD bilgilerimi kontrol edebilmek icin Dashboard panelimde OPD menusunun olmasini istiyorum.
  Scenario: US_019>TC_003 Dashboard sidebar'inda OPD menü basliginin dogrulanmasi ve tiklaninca "opdprofile" sayfasina yönlendirmesi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient verifies the OPD button is enable
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies the OPD page opens


  Scenario: US_019>TC_004 OPD menusunden Overview, Visits, Lab Investigation, Treatment History, Timeline sayfalarina erisim bulunmasi testi
    Given  Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient verifies the OPD button is enable
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Overview button is enable
    Then Patient verifies Visits button is enable and click it
    Then Patient verifies Lab investigation button is enable and click it
    Then Patient verifies Treatment History button is enable and click it
    Then Patient verifies Timeline button is enable and click it

  Scenario: US_019>TC_005 Overview sayfasinda hastaya ait profil bilgilerinin dogru sekilde goruntulenmesi, Visits, Lab Investigation, Treatment History, Timeline bilgilerinin ozetlerinin goruntulenmesi, consultant doctor basligi altinda danisman doktorlarin goruntulenmesi testi
    Given  Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies her name on the header
    Then Patient verifes Consultant doctors found
    Then Patient verifies that can be seen details about appointment under the visit details section
    Then Patient verifies that can be seen details about lab investigation summary under the lab investigation section
    And Patient verifies that can be seen details about treatments under the treatments history section
    And Patient verifies that can be seen details about timeline records under the Timeline section


  @homepage
Scenario: US_019>TC_006 Visits sayfasinda Visits List'te (OPD No, Case ID, Appointment Date, Consultant, Reference, Syptomps,Action) basliklari ve text boxin olmasi ve burada arama yapilabilmesi, listede siralama yapilabilmesi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Visits button is enable and click it
    Then Patient verifies OPD No header
    Then Patient verifies Case IDyi on the header
    Then Patient verifies Threatment History header
    Then Patient Timeline header







