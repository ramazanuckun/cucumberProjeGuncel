
@web
Feature: US014 Class Work
  Scenario: Kullanici ve Url Testi

    Given kullanici "webUrl" anasayfasinda
    When  kullanici 3 saniye bekler
    Then kullanici Login Portala kadar asagi iner
    And kullanici Login Portala tiklar
    And kullanici diger windowa gecer
    And kullanici "username" kutusuna bilgileri girer
    When  kullanici 3 saniye bekler
    And kullanici "password" bolumune bilgileri girer
    When  kullanici 3 saniye bekler

    And kullanici login butonuna basar
    When  kullanici 3 saniye bekler
    And kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    And kullanici Ok diyerek Popup'i kapatir
    When  kullanici 3 saniye bekler

    And kullanici ilk sayfaya geri doner
    And kullanici ilk sayfaya donuldugunu test eder
    When  kullanici 3 saniye bekler
    And sayfayi kapatir
