package kukulam.module.testing.level.C;

import java.util.Collection;
import java.util.LinkedList;

class CollectionHandler {

    /**
     * Create new collection with objects from collection a and collection b.
     * @return Collection with strings.
     * @throws InvalidArgumentsException when one of given collection is null.
     */
    Collection<String> add(Collection<String> a, Collection<String> b) throws InvalidArgumentsException {
        if (a == null || b == null)
            throw new InvalidArgumentsException("Invalid arguments, params cannot be null");

        LinkedList<String> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    /**
     * Create new collection from given objects.
     * @return Collection with strings or null when arguments are not provided.
     * @throws InvalidArgumentsException when one of given string is blank.
     */
    Collection<String> create(String... arguments) throws InvalidArgumentsException {
        if (arguments.length == 0)
            return null;

        for (String text : arguments) {
            if (text.isEmpty()) throw new InvalidArgumentsException("");
        }

        LinkedList<String> result = new LinkedList<>();
        for (String text : arguments) {
            result.add(text);
        }

        return result;
    }

    /**
     * Create new collection with common objects from collection a and b.
     * @return Collection with strings.
     * @throws InvalidArgumentsException when one of given collection is null.
     */
    Collection<String> common(Collection<String> a, Collection<String> b) throws InvalidArgumentsException {
        if (a == null || b == null)
            throw new InvalidArgumentsException("Invalid arguments, params cannot be null");

        LinkedList<String> result = new LinkedList<>(a);
        result.retainAll(b);

        return result;
    }

    static class InvalidArgumentsException extends Exception {
        InvalidArgumentsException(String message) {
            super(message);
        }
    }
}


