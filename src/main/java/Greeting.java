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
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null || names[i].equals("")) {
                names[i] = "przyjacielu";
            }
        }
        if (names.length == 1) {
            return String.format("Witaj, %s.", names[0]);
        } else {
            String stringFormat = "Witaj, %s";
            for(int i =1; i < names.length; i++ ){
                if(i == names.length -1){
                    stringFormat += " i %s.";
                    break;
                }
                stringFormat += ", %s";
            }
            return String.format(stringFormat, names);
        }



//        else if(names.length == 4 ) {
//            return String.format("Witaj, %s, %s, %s i %s.", names[0], names[1], names[2], names[3]);
//        }
//            else {
//            return String.format("Witaj, %s i %s.", names[0], names[1])
//          }

    }
}
