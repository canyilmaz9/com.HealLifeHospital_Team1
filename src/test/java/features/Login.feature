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


        Scenario: Dashboard panele yanlis bilgilerle login olamama
          Given
          When
          Then