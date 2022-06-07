public class ExpChecker {
    private static final CharQueue queue;
    private static int count;

    static {
        queue = new CharQueue();
    }

    public static boolean checkBalance (String exp) {
        clearAll();
        for (char c: exp.toCharArray()) {
            if (exp.isBlank()) return false;
            if (isABracket(c)) {
                queue.enqueue(c);
                count++;
            }
        }
        return isTheQueueAPalindrome();
    }

    private static void clearAll() {
        count = 0;
        queue.clear();
    }

    private static boolean isTheQueueAPalindrome()  {
        if (count % 2 == 1) return false;
        String half = "";
        for (int i=0; i<count/2; i++) {
            half = queue.dequeue() + half;      // Be basic and not use a StringBuilder
        }
        for (int i=0; i<count/2; i++) {
            if (!compatibleBrackets(half.charAt(i), queue.dequeue())) {
                return false;
            }
        }
        return true;
    }

    private static boolean compatibleBrackets(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    private static boolean isABracket(char c) {
        return c == ')' || c == '}' || c == ']' || c == '(' || c == '{' || c == '[';
    }
}
