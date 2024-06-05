<h1>Sejfy</h1>
<h2>Treść zadania:</h2>
<a>Mamy n sejfów. Każdy z nich można otworzyć odpowiednim kluczem lub zniszczyć, żeby dostać się do zawartości. Klucze do tych sejfów znajdują się w tych samych sejfach - w każdym sejfie może być 1 klucz, więcej, lub może ich nie być w ogóle. Do każdego sejfu pasuje tylko jeden klucz i wiemy, w którym sejfie znajduje się on znajduje.

Zadaniem jest napisanie programu, który zwróci informację jaka jest najmniejsza liczba sejfów, które trzeba zniszczyć żeby dostać się do zawartości wszystkich z nich.</a>

<h2>Rozwiązanie</h2>

Rozwiązanie opiera się na wykorzystaniu grafów nieskierowanych. Każdy sejf jest reprezentowany przez wierzchołek grafu, a krawędzie między wierzchołkami reprezentują, że w danym sejfie znajduje się klucz do innego sejfu. Następnie stosuje się algorytm przeszukiwania grafu w głąb (DFS) w celu znalezienia spójnych składowych, czyli grup sejfów, do których można uzyskać dostęp za pomocą zniszczenia jednego z sejfów.

Algorytm:

1. Przypisz każdemu sejfowi wierzchołek w grafie.
2. Jeśli sejf A zawiera klucz do sejfu B, dodaj krawędź między wierzchołkami reprezentującymi sejf A i B.
3. Użyj DFS, aby znaleźć spójne składowe w grafie.
4. Liczba spójnych składowych jest równa najmniejszej liczbie sejfów, które trzeba zniszczyć.

<h2>Zawartość</h2>
<ul>
<li><b>"SafesAndKeys.java"</b>: Główna klasa zawierająca algorytm rozwiązujący problem najmniejszej liczby sejfów do zniszczenia.</li>
<ul><li>Metoda <b>"run"</b>: Metoda uruchamiająca program i wywołująca algorytm.</li>
<li>Metoda <b>"dfs"</b>: Algorytm DFS</li>
<li>Metoda <b>"countConnectedComponents"</b>: Zlicza spójne składowe w grafie.</li>
<li>Metoda <b>"addEdge"</b>: Dodaje krawędź między sejfami w grafie.</li>
</ul>
<li><b>"SafesAndKeysTest.java"</b>: Trzy testy jednostkowe dla klasy SafesAndKeys</li>

</ul>

Do testów zostały użyte następujące grafy:
<div style="white-space: nowrap;">
  <img src="https://github.com/OlaMotorola/SafesAndKeys/assets/84777172/680fcd46-e54d-46e4-b2fe-f1c932854a24" height="180">
  <img src="https://github.com/OlaMotorola/SafesAndKeys/assets/84777172/ebf86578-c535-461c-9e60-dc13574d1da0" height="180">
  <img src="https://github.com/OlaMotorola/SafesAndKeys/assets/84777172/425a0f2a-5e8a-4055-b2a7-cc07efba0b68" height="180">
</div>

<h3>Autor: Aleksandra Zając</h3>

