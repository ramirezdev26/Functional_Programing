import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// Functional Phonebook
public class PhoneBook {
    static List<String> contacts = new ArrayList<String>();

    Function<Integer, String> searchContact = s -> contacts.get(s);
    String contact = searchContact.apply(0);
    // System.out.print(contact);
    Consumer<String> addContact = s -> contacts.add(s);
    // System.out.print(addContact.accept("123456"));
    Consumer<String> removeContact = s -> contacts.remove(String.valueOf(s));
    // System.out.print(removeContact.accept(0));
    Supplier<List> getAllContacts = () -> contacts;
    // System.out.print(getAllContacts.get());

}
