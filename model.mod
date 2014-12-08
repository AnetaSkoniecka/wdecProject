# ostateczne
reset;

# wprowadzamy
param majatek_firmy;
param max_kredyt;
param gotowka;
param zadluzenie ;
param amortyzacja;
param koszt_staly_prod;
param oproc_konta ;
param oproc_kredytu;
param stawka_podatku;
param niesprzedane_produkty_odsprzedane_za;
param max_produkcja;
param min_jakosc;
param max_jakosc;
param ryzyko;
#param max_ryzyko;

var cena >=0;
var jakosc >=0;
var wolumen >=0;

var reklama_tv >=0;
var reklama_internet >=0;
var reklama_magazyn >=0;

var koszt_jedn_zmienny >= 0;
#var ryzyko >= 0;
var zysk >= 0;
var koszty >= 0;
                                                     
maximize funkcja_celu: zysk;

subject to ogr1: koszty = koszt_staly_prod + wolumen * koszt_jedn_zmienny + reklama_tv + reklama_internet + reklama_magazyn + amortyzacja;
subject to ogr2: koszt_jedn_zmienny = 0.15827136*jakosc-0.8322906 + 7.9067*10^-6*wolumen+7-188042*7.9067*10^-6;
#subject to ogr22: koszt_jedn_zmienny = 0.00065 * jakosc * jakosc  - 0.025 * jakosc + 7.89; # w. Wioli
subject to ogr3: zysk = wolumen * cena - koszty;

subject to ogr4: koszty <= gotowka;
subject to ogr5: jakosc <= 100;
subject to ogr55: jakosc >= 10;
subject to ogr6: wolumen <= max_produkcja;
subject to ogr7: cena >= koszt_jedn_zmienny;

subject to ogr8: ryzyko = (-0.01 * ((-cena) - 55 / 2) * ((-cena) - 55 / 2) - ((-cena) - 5) * (100 / 45)) / 50 - (0.8 * reklama_tv + 0.7 * reklama_magazyn + 0.5 *reklama_internet) / 200000 ; # dodatkowa wersja


data ddata.dat;
solve;

display zysk ;
display wolumen ;
display jakosc ;
display koszt_jedn_zmienny ;
display reklama_tv ;
display reklama_internet ;
display reklama_magazyn ;
display cena ;
display ryzyko;