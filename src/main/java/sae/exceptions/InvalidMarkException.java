package sae.exceptions;

/**
 * Custom exception class representing an error when the mark command is invalid.
 */
public class InvalidMarkException extends SaeException {

    /**
     * Returns a string representation of the exception message.
     *
     * @return A message indicating that the mark command failed.
     */
    @Override
    public String toString() {
        return "☹ OOPS!!! I wasn't able to mark the task. Use the list command to check if the task exists.";
    }
}
