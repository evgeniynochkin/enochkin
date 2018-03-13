package ru.job4j;

/**
* Прфессия доктор.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 13.03.2018
*/
public class Doctor extends Profession {
	Diagnose diagnose;

	/**
	* Диагностирование болезни.
	* @param pacient.
	* @return diagnoz.
	*/
	public Diagnose ill(Pacient pacient) {
		return diagnose;
	}

	/**
	* Лечение пациента.
	* @param pacient.
	*/
	public void heal(Pacient pacient) {
		
	}
}