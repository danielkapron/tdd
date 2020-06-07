import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {


//    Stwórz klasę StringCalculator zawierającą metodę
//    int add(String numbers)
//    Metoda może przyjąć co najwyżej dwie liczby oddzielone od siebie przecinkiem i zwraca ich sumę. Na przykład: „”, „1”, „1,2” – dla pustego ciągu znaków wynik jest 0

    //Rozszerz metodę add tak by przyjmowała dowolną ilość znaków

    //Rozszerz metodę add tak by przyjmowała znak końca linii zamiast przecinka (1\n2,3 = 6)

    //Rozszerz metodę add tak by przyjmowała dowolny, określony separator w następujący sposób
    ////[separator]\n[liczby]
    //na przykład „//;\n1;2” powinno zwrócić 3 – separator w tej sytuacji to ;
    //Powyższy separator jest opcjonalny. Poprzednie separatory powinny być w dalszym ciągu obsługiwane

    //Rozszerz metodę add w taki sposób by wykrywała czy ciąg liczb zawiera liczbę ujemną i wyrzucała w takiej sytuacji wyjątek o treści „liczby ujemny są niedopuszczalne: [liczba ujemna]”.

    //Rozszerz metodę add w taki sposób by liczby większe niż 1000 były ignorowane, np.: „2,1001” daje wynik 2
    public int add(String numbers) throws Exception {
        if (numbers.length() == 0) {
            return 0;
        }

        int result = 0;

        String customSeparator = null;
        if (numbers.startsWith("//")) {
            String[] split = numbers.split("\n", 2);

            customSeparator = split[0].substring(2);
            numbers = split[1];
        }

        String separator;
        if (customSeparator == null) {
            separator = "[,|\n]";
        } else {
            separator = "[,|\n|" + customSeparator + "]";
        }

        String[] strings = numbers.split(separator);

        List<Integer> negativeNumbers = new ArrayList<>();

        for (String s : strings) {
            int parsedNumber = Integer.parseInt(s);
            if (parsedNumber < 0) {
                negativeNumbers.add(parsedNumber);
            }

            if (parsedNumber <= 1000) {
                result += parsedNumber;
            }
        }

        if (negativeNumbers.size() > 0) {
            throw new Exception("liczby ujemne są niedopuszczalne: " + Arrays.toString(negativeNumbers.toArray()));
        }

        return result;
    }
}
