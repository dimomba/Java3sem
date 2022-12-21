package task13x2;

public class Person
{
    private String name;
    private String surname;
    private String patronymic;
    public Person(String surname, String name, String patronymic)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString()
    {
        if (!name.equals("") & !patronymic.equals(""))
            return surname.toUpperCase().charAt(0) + surname.toLowerCase().substring(1, surname.length()) + " " + name.toUpperCase().charAt(0) + ". " + patronymic.toUpperCase().charAt(0) + ".";
        else if (!name.equals(""))
            return surname.toUpperCase().charAt(0) + surname.toLowerCase().substring(1, surname.length()) + " " + name.toUpperCase().charAt(0) + ".";
        else
            return surname.toUpperCase().charAt(0) + surname.toLowerCase().substring(1, surname.length());
    }
}