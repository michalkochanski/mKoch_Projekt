Projekt funkcjonalny, umożliwia zarządzanie studentami.

Studentów i Grupy można:
	- wyświetlić wszystkie,
	- wyświetlić pojedyńczo(przeciążone metody),
	- dodawać,
	- edytować,
	- usunąć.

Zastosowałem Interfejsy do każdego z menadżerów. Wzorcem wykorzystanym jest wzorzec iterator - przy operacjach na bazie.

W paczce Managers znajdują się menadżery obsługujące edycję studentów i grup.

W paczce Persons znajdują się klasy grup i studentów oraz ich interfejsy. 

W paczce Services znajduje się plik główny(main) oraz klasy obsługujące bazę danych. Odwołują się do nich odpowiednie metody z menadżerów.

Korzystam z MySQL oraz serwera zewnętrznego który znajduje się na wykupionym przeze mnie hostingu.
W folderze DBfiles zamieściłem wszystkie pliki dotyczące bazy danych: creaty, inserty oraz dane dostępowe.

Przepraszam że testów nie wykonałem, już nie dałem rady...

W pliku main.java jest przykład wykorzystania: dodaje użytkownika/grupę, później go edytuje a na końcu usuwa.