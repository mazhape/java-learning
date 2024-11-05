public class StringException {
    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";  // Appends "before" to result
                v.length();          // Triggers NullPointerException since v is null
                result += "after";   // This line is skipped due to the exception
            } catch (NullPointerException e) { // Catches the NullPointerException
            }
            result += "catch";       // Appends "catch" to result
            throw new RuntimeException(); // Throws a new RuntimeException
        } finally {
            result += "finally";     // Appends "finally" to result
            throw new Exception();    // Throws a new Exception
        }
    } catch (Exception e) {          // Catches the Exception from the finally block
        result += "done";             // Appends "done" to result
    }
    return result;
    }
    
}
