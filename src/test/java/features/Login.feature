Feature: Login Functionality

  Scenario: Valid Login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should see the home page


      @login
      Scenario:Dashboard panele dogru bilgilerle login olma
        Given kullanici anasayfada
        When login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir
        And user login sayfasinda sagda login penceresi solda latest new bilgileri bulunur
        Then user login sayfasinda (sisteme daha önceden kayitli) bilgiler girilerek dashboard panele login olunur.

        @login2
        Scenario: Dashboard panele yanlis bilgilerle login olamama
          Given kullanici anasayfada
          When login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir
          And username kutusuna dogru email, password kutusuna yanlis sifre girilerek sign in butonuna tiklanir.
          Then Kullanicinin giris yapamadigi dogrulanir
          And username kutusuna yanlis email, password kutusuna dogru sifre girilerek sign in butonuna tiklanir.
          Then Kullanicinin giris yapamadigi dogrulanir
          And username kutusuna yanlis email, password kutusuna yanlis sifre girilerek sign in butonuna tiklanir.
          Then Kullanicinin giris yapamadigi dogrulanir

          @login3
          Scenario:
            Given kullanici anasayfada
            When login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir
            Then User Login sayfasinda forget password linki bulunmali ve bu linke tiklaninca ufpassword sayfasina yönlendirmeli.
            And Forgot password sayfasinda parola sifirlama islemi icin ilgili textBox'a mail adresi girilebilmeli
            And Forgot password sayfasindaki textBox'a girilen mail adresine sifre gönderilmeli.
            Then Forgot password sayfasinda login sayfasina dönmek icin user login linki bulunmali ve bu linke tiklaninca userlogin sayfasina yönlendirmeli.