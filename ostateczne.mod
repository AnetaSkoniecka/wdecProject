# ostateczne
reset;

# wprowadzamy
param majatek_firmy;
param max_kredyt;
param gotowka;
param zadluzenie;
param amortyzacja;
param koszt_staly_prod;
param oproc_konta;
param oproc_kredytu;
param stawka_podatku;
param niesprzedane_produkty_odsprzedane_za;
param max_produkcja;
param min_jakosc;
param max_jakosc;

# zmienne decyzyjne
var wolumen >= 0;
var jakosc >= 0;
var koszt_zmienny >= 0;
var rek_tv >= 0;
var rek_internet >= 0;
var rek_magazyn >= 0;
var cena >= 0;
var zaciagany_kredyt >= 0;
var splacana_rata >= 0;

var przychod >= 0;
var koszt_jedn_zmienny >= 0;
var koszty >= 0;
var odsetki >= 0;
var zysk >= 0;



maximize fun: przychod - koszty + odsetki;

# ograniczenia
subject to ogr1: koszty <= gotowka;
subject to ogr2: jakosc <= 100;
subject to ogr3: jakosc >= 0;
subject to ogr4: wolumen <= max_produkcja;
subject to ogr6: cena >= koszt_jedn_zmienny;


subject to ogr7: przychod = wolumen * cena;
subject to ogr8: koszt_jedn_zmienny = 0.00065 * jakosc * jakosc - 0.025 * jakosc + 7.89;
subject to ogr9: koszty = koszt_staly_prod + wolumen * koszt_jedn_zmienny + rek_tv + rek_internet + rek_magazyn + amortyzacja;
subject to ogr11: odsetki = (gotowka - koszty) * oproc_konta;

# interesuje nas
subject to ogr14: zysk = przychod - koszty + odsetki;



# rozwiazywanie
data data.dat;
solve;

display zysk ;
display wolumen ;
display jakosc ;
display koszt_jedn_zmienny ;
display rek_tv ;
display rek_internet ;
display rek_magazyn ;
display cena ;
display zaciagany_kredyt ;
display splacana_rata;




#subject to ogr13: ryzyko;
#subject to ogr12: podatek = odsetki * stawka_podatku # nie wiem od czego odprowadzamy podatek
#subject to ogr5: kredyt <= max_kredyt;
# var podatek;
#param max_ryzyko;
