import java.util.ArrayList;

public class NFAStateCon implements NFAState{

    private final String name;
    private final boolean finale;
    private final boolean iniziale;

    private final ArrayList<NFATransition> transitionsM;

    public NFAStateCon(String name, boolean finale, boolean iniziale, ArrayList<NFATransition> transitionsM) {
        this.name = name;
        this.finale = finale;
        this.iniziale = iniziale;
        this.transitionsM = transitionsM;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFinal() {
        return this.finale;
    }

    @Override
    public boolean inStart() {
        return this.iniziale;
    }

    @Override
    public ArrayList<NFATransition> transizioniUscenti() {
        return this.transitionsM;
    }
}
