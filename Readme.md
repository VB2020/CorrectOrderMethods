Один и тот же экземпляр данного класса
будет вызван 3-мя разными потоками.
Поток А - будет вызывать метод first().
Поток B - second().
Поток С - third().
--------------------------------------------------------
Необходимо реализовать
механизм и изменить программу таким образом,
что методы класса Foo будут вызваны в правильном порядке.

Пример:
Вывод: "firstsecondthird"
Мы не знаем, в каком порядке будут вызваны методы,
но должны гарантировать порядок.

---------------------------------------------
ПОПЕРЕСТАВЛЯЙТЕ МЕСТАМИ:
new Thread_C (foo);
new Thread_B (foo);
new Thread_A (foo);
---------------------------------------------
И РЕЗУЛЬТАТ: " -> first -> second -> third"
НЕ ИЗМЕНИТСЯ!
---------------------------------------------



