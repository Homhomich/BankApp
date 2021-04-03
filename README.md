# BankApp

20.Моделирование обслуживания в
филиале банка
Необходимо создать компьютерную модель обслуживания потока
заявок, поступающих от клиентов банка, несколькими
клерками (2≤ N ≤ 7) в одном из филиалов банка. Известно
недельное расписание работы филиала банка: 5 дней по 8
часов и один день – 6 часов, возможны перерывы на обед.
При моделировании работы заявки на обслуживание (т.е. приход
клиентов) поступают случайным образом. Случайной величиной является
отрезок времени между последовательным появлением двух заявок, она имеет
нормальное или равномерное распределение в некотором интервале (например,
от 0 до 10 минут), причем плотность потока заявок зависит от дня недели и
времени дня – в конце недели и в конце дня клиенты приходят чаще, т.е.
плотность потока выше. Длительность обслуживания каждой заявки – также
случайное число в некотором диапазоне (например, от 2 до 30 минут), но
длительность не зависит от входного потока заявок. Еще одна случайная
величина – прибыль, получаемая банком от обслуживания клиента, она
варьируется в пределах от 3 тыс. до 50 рублей.
Поступившие заявки (клиенты) образуют общую очередь,
максимальная длина которой – K человек (10≤ K ≤ 25). Если очередь достигла
такой длины, то вновь прибывающие клиенты уходят, и вероятность прихода
следующих уменьшается – тем самым банк теряет своих потенциальных
клиентов.
Клиенты банка ожидают своей очереди на обслуживание в общем зале с
информационным табло, на котором высвечиваются номер
клиента, взятого только что на обслуживание, и номер места клерка,
обслуживающего этого клиента. В каждый день работы филиала заявки на
обслуживание нумеруются последовательно, начиная с 1, по мере их прихода в
банк.
Цель моделирования работы банка – определение прибыли банка и ее
зависимости от числа работающих клерков; выявление “узких” мест в работе
банка: нехватки клерков (возможное следствие этого – потеря клиентов), простой
клерков (следствие – лишние траты на их зарплату). Прибыль высчитывается с
учетом дневной зарплаты каждого клерка (2 тыс. руб.).
Период моделирования – месяц, шаг моделирования – интервал времени
от 10 минут до 1 часа. Следует включить в параметры моделирования: числа N и
K, шаг моделирования, диапазоны разброса случайных величин – промежутка
между приходом клиентов и время их обслуживания, законы распределения этих
случайных величин. Необходимо также учесть в модели уменьшение потока
клиентов при наличии достаточно большой (более 7 человек) очереди.
Визуализация моделируемого процесса должна предусматривать показ
текущей ситуации в банке, том числе – скопившуюся очередь, занятость клерков,
появление новых и уход обслуженных клиентов, информационное табло. Следует
предусмотреть вывод в ходе моделирования и по его окончании подсчитанной
статистики: количества обслуженных и потерянных клиентов, максимальную,
минимальную и среднюю длину очереди, среднее время ожидания клиентов в
очереди, среднюю занятость клерков, а также полученную банком прибыль.