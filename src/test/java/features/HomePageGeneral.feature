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

    #fail
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


  #fail
Scenario: US_019>TC_006 Visits sayfasinda Visits List'te (OPD No, Case ID, Appointment Date, Consultant, Reference, Syptomps,Action) basliklari ve text boxin olmasi ve burada arama yapilabilmesi, listede siralama yapilabilmesi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Visits button is enable and click it
    Then Patient verifies OPD No header
    Then Patient verifies Case IDyi on the header
    Then Patient verifies Appointment date on the header
    Then Patient verifies consultant on the header
    Then Patient verifies Reference on the header
    Then Patient verifies Symptoms on the header
    And Patient verifies Action on the header
    And Patient can search appointments on the page



    #fail
  Scenario: US_019>TC_007 Visits listteki Actions basligi altindan ziyaretin detaylari ve recete bilgilerine erisimin olmasi ve dogru hasta adina kayit olmus olmasi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Visits button is enable and click it
    Then Patients' visit's details and medication details are enable under the Action header



    #fail

  Scenario: US_019>TC_008 Lab Investigation sayfasindaki Lab Investigation list'te (Test Name, Case ID, Lab, Sample Collected, Expected Date, Approved By, Action) basliklarinin olmasi,   text boxin olmasi ve burada arama yapilabilmesi, listede siralama yapilabilmesi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Lab investigation button is enable and click it
    Then Patient verifies Test Name is enable on the header
    Then Patient verifies Case ID is enable on the header
    Then Patient verifies Lab is enable on the header
    Then Patient verifies Sample Collected is enable on the header
    Then Patient verifies Expected Date is enable on the header
    Then Patient verifies Approved By is enable on the header
    Then Patient verifies Action is enable on the header
    Then Patient verifies search box is clickable and searchable


    #fail
  Scenario: US_019>TC_009 Lab Investigation List'te Action basligi altinda test sonucu görüntülenebilmesi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Lab investigation button is enable and click it
    Then Patients' Labs details enable under the Action header

  #fail

  Scenario: US_019>TC_010 Treatment History sayfasinda Treatment History list'te (OPD No, Case ID, Appointment Date, Syptomps, Consultant, Action) basliklarinin olmasi, text boxin olmasi ve burada arama yapilabilmesi, listede siralama yapilabilmesi testi
    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    And Patient clicks to OPD button on the left side bar menu
    Then Patient verifies Treatment History button is enable and click it
    Then Patient verifies OPD No is enable under the Treatment History page
    Then Patient verifies Case ID is enable under the Treatment History page
    Then Patient verifies Appointment Date is enable under the Treatment History page
    Then Patient verifies Syptomps is enable under the Treatment History page
    Then Patient verifies Consultant is enable under the Treatment History page
    Then Patient verifies Action is enable under the Treatment History page
    Then Patient verifies text box is is clickable and searchable


    Scenario: US_019>TC_011 Timeline sayfasinda gelecekte hastayi bekleyen islemleri gosteren bir line olmasi ve bu lineda gerekli bilgilerin siralanmasi testi
      Given Kullanici Anasayfa adresine gider
      When Patient clicks the login button
      And Patient logins to patient dashboard
      And Patient clicks to OPD button on the left side bar menu
      Then It can be seen that a line and enable to see timeline information

  @homepage
   #US030 Gallery sayfasinda farkli bölümler (Health & Wellness, Hospitals and Directions, Specialities, Recreation Centre, Your Health, Surgery) ile ilgili her bölüme ait sayfalarin  olmasi ve ustune tiklanildiginda dogru sayfaya yonlendirilmesi testi
    Scenario: US_030>TC_012 Ana sayfa header bölümündeki Gallery linkine tiklandiginda "gallery" sayfasina yönlendirmesi testi
      Given Kullanici Anasayfa adresine gider
      And User reach gallery section
      Then User clicks gallery button
      Then The link redirected gallery page

    Scenario: US_030>TC_013 Gallery sayfasinda farkli bölümler (Health & Wellness, Hospitals and Directions, Specialities, Recreation Centre, Your Health, Surgery) ile ilgili her bölüme ait sayfalarin  olmasi ve ustune tiklanildiginda dogru sayfaya yonlendirilmesi testi
      Given Kullanici Anasayfa adresine gider
      And User reach gallery section
      Then User clicks gallery button
      Then The link redirected gallery page
      Then verification of the Health & Wellness page is clickable and forwarding correct link
      Then verification of the Hospitals and Directions page is clickable and forwarding correct link
      Then verification of the Specialities page is clickable and forwarding correct link
      Then verification of the Recreation Centre page is clickable and forwarding correct link
      Then verification of the Your Health page is clickable and forwarding correct link
      Then verification of the Surgery page is clickable and forwarding correct link



















