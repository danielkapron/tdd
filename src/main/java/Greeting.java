public class Greeting {

    // Napisz metodę greet(name), która wstawi wartość name w powitanie. Na przykład, kiedy name to „Jan” to metoda powinna zwrócić tekst „Witaj, Jan.”

    // Dodaj obsługę null i pustego ciągu znaków. Jeśli name jest puste lub null to metoda ma zwrócić „Witaj, przyjacielu.”

    // Dodaj obsługę dwóch imion. Kiedy name ma postać tablicy zawierającej dwa imiona to oba imiona
    // mają zostać wpisane do powitania, na przykład, gdy name = [„Jan”, „Karolina”] to metoda ma zwrócić „Witaj, Jan i Karolina”


    public String greet(String... names){

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null || names[i].equals("")) {
                names[i] = "przyjacielu";
            }
        }

        if(names.length == 1){
            return String.format("Witaj, %s.", names[0]);
        } else {
            return String.format("Witaj, %s i %s.", names[0], names[1]);
        }

    }

}
