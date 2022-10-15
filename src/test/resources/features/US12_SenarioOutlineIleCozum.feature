Feature: US011 Class Work

  @guru
  Scenario Outline:  TC01_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given kullanici "guruUrl" anasayfasinda
    And "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Company         |
      | Group           |
      | Prev Close (Rs) |
      | Prev Close (Rs) |
      | % Change        |

    Scenario: kullanici sayfayi kapatir
      Given sayfayi kapatir