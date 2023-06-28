public class Thompson implements ThompsonNFA{
    private final NFAState start;
    private final NFAState finale;

    public Thompson(NFAState start, NFAState finale) {
        this.start = start;
        this.finale = finale;
    }

    @Override
    public NFAState getStatoIniziale() {
        return this.start;
    }

    @Override
    public NFAState getStatoFinale() {
        return this.finale;
    }

    @Override
    public boolean accept(String s) {
        return false;
    }
}
