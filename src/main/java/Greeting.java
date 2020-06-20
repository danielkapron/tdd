import java.util.ArrayList;
import java.util.List;

public class Greeting {

    // Napisz metodę greet(name), która wstawi wartość name w powitanie. Na przykład, kiedy name to „Jan” to metoda powinna zwrócić tekst „Witaj, Jan.”

    // Dodaj obsługę null i pustego ciągu znaków. Jeśli name jest puste lub null to metoda ma zwrócić „Witaj, przyjacielu.”

    // Dodaj obsługę dwóch imion. Kiedy name ma postać tablicy zawierającej dwa imiona to oba imiona
    // mają zostać wpisane do powitania, na przykład, gdy name = [„Jan”, „Karolina”] to metoda ma zwrócić „Witaj, Jan i Karolina”

    // Zadanie 4
    //Dodaj obsługę dowolnej liczby imion. Kiedy name ma postać tablicy zawierającej wiele imion to wszystkie imiona mają
    // zostać wpisane do powitania, na przykład, gdy name = [„Jan”, „Karolina”, „Wojciech”, „Marta”] to metoda ma
    // zwrócić „Witaj, Jan, Karolina, Wojciech i Marta

    //Zadanie 5
    //Jeśli elementy name są ciągami znaków oddzielonych przecinkiem to powinny one zostać rozdzielone,
    // np.: dla name = [„Jan”, „Karolina, Wojciech”] metoda ma zwrócić „Witaj, Jan, Karolina i Wojciech




    public String greet(String... names) {

        List<String> formattedNames = new ArrayList<>();

        for(String name : names){
            if(name != null) {
                String[] stringArray = name.split(",");

                for (String stringArrayItem : stringArray) {
                    formattedNames.add(stringArrayItem.trim()); // trim czysci biale znaki na poczatku i koncu
                }
            } else {
                formattedNames.add(name);
            }
        }

        for (int i = 0; i < formattedNames.size(); i++) {
            if (formattedNames.get(i) == null || formattedNames.get(i).equals("")) {
                formattedNames.set(i, "przyjacielu");
            }
        }
        if (formattedNames.size() == 1) {
            return String.format("Witaj, %s.", formattedNames.toArray());
        } else {
            String stringFormat = "Witaj, %s";

            for (int i = 1; i < formattedNames.size() - 1; i++) {
                stringFormat += ", %s";
            }

            stringFormat += " i %s.";

            return String.format(stringFormat, formattedNames.toArray());
        }

    }
}
