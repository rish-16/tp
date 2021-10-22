package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.Arrays;

import seedu.address.logic.commands.FindPatientCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.NameContainsKeywordsPredicate;

/**
 * Parses input arguments and creates a new FindCommand object
 */
<<<<<<< HEAD:src/main/java/seedu/address/logic/parser/FindCommandParser.java
public class FindCommandParser implements Parser<FindPatientCommand> {
=======
public class FindPatientCommandParser implements Parser<FindPatientCommand> {
>>>>>>> 79adfc313cc2a2b69cbd4f0b5e441c22fb304893:src/main/java/seedu/address/logic/parser/FindPatientCommandParser.java

    /**
     * Parses the given {@code String} of arguments in the context of the FindCommand
     * and returns a FindCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public FindPatientCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, FindPatientCommand.MESSAGE_USAGE));
        }

        String[] nameKeywords = trimmedArgs.split("\\s+");

        return new FindPatientCommand(new NameContainsKeywordsPredicate(Arrays.asList(nameKeywords)));
    }

}
