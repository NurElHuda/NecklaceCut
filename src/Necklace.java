import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 *
 */
public class Necklace {

    //Ces constantes représentent la base de tests pour
    //les méthodes de résolution
    public static final String benchmark1 = "0,1,3,1,3,0,4,2,2,2,3,1,3,0,1,1,1,2,2,0,3,2,2,0,0,3,4,1,1,2,0,4,4,3,4,4,3,4,4,0";
    public static final String benchmark2 = "0,0,0,0,3,4,4,4,2,2,1,4,1,1,0,1,2,2,3,1,2,2,3,2,0,1,4,3,4,4,1,3,0,3,3,0,4,2,3,1";
    public static final String benchmark3 = "0,3,2,0,0,3,4,3,4,1,1,4,2,0,3,3,2,3,1,2,2,1,2,0,4,1,3,2,0,3,0,1,4,4,1,1,4,0,2,4";
    public static final String benchmark4 = "4,0,3,4,0,3,3,0,1,2,3,1,0,1,1,1,2,2,2,3,2,2,2,1,0,4,1,4,0,2,1,4,4,4,0,3,3,3,0,4";
    public static final String benchmark5 = "1,0,4,3,0,1,0,0,0,0,1,1,1,2,1,0,3,4,2,2,3,2,2,0,3,3,2,1,3,2,4,3,1,4,4,4,3,4,4,2";
    public static final String benchmark6 = "0,0,0,0,2,0,4,0,1,4,3,3,2,0,3,4,2,2,1,2,1,2,4,2,3,3,0,1,4,2,3,3,4,4,3,1,1,4,1,1";
    public static final String benchmark7 = "0,0,2,3,4,0,0,1,2,1,4,4,1,1,0,1,1,4,2,4,3,2,4,0,2,3,2,3,1,3,3,3,4,2,4,0,1,0,2,3";
    public static final String benchmark8 = "3,0,3,0,0,2,3,4,1,2,1,1,2,1,0,1,4,4,1,2,0,2,2,1,3,3,3,0,2,0,3,3,4,4,4,2,4,1,0,4";
    public static final String benchmark9 = "1,0,0,3,0,0,4,0,1,4,4,1,1,2,4,0,2,2,4,2,1,0,2,2,3,3,3,0,1,3,1,2,3,4,4,1,3,3,2,4";
    public static final String benchmark10 = "4,3,1,0,4,2,0,3,3,1,1,1,3,1,0,3,2,4,0,2,2,1,2,2,2,4,1,3,0,0,0,3,4,4,0,2,1,4,4,3";

    public static final String benchmark11 = "0,1,3,1,3,0,4,2,2,4";

    /**
     * Le nombre de couleurs possibles. Dans l'énoncé, cela correpond à p
     */
    private final int beads;

    /**
     * Ce tableau représente le collier à découper
     */
    private final int[] chain;

    public Necklace(String chainStr) {
        StringTokenizer stk = new StringTokenizer(chainStr, ",");
        chain = new int[stk.countTokens()];
        int i = 0;
        int max = -1;
        while (stk.hasMoreTokens()) {
            chain[i] = new Integer(stk.nextToken());
            if (chain[i] > max) {
                max = chain[i];
            }
            i++;
        }
        beads = max + 1;
    }

    public static void main(String... args) {

        Necklace neckl = new Necklace(benchmark7);
        Cut cut = new Cut(neckl.beads);

        myFrame myFrame = new myFrame();

        //System.out.println(Cut.solveDepth(neckl, cut));
        //System.out.println(Cut.solveWidth(neckl, cut));
        //System.out.println(Cut.solveRandom(neckl, cut));
        //System.out.println(Cut.solveHeuristic1(neckl, cut));
        //System.out.println(Cut.solveHeuristic2(neckl, cut));
        //System.out.println(Cut.solveHeuristic3(neckl, cut));
        //System.out.println("##############################################");
        //Exemple pour explorer les voisins (juste un affichage)
        //cut.actions(neckl.getChainLength()).forEach(next -> next.applyTo(neckl));

        /*
        Pour les gens qui ne sont pas à l'aise avec les lambda-expressions en java,
        voici la version avec for
        for(Cut next : cut.actions(neckl.getChainLength())){
            next.applyTo(neckl);
        }
        */


    }

    public int[] getChain() {
        return chain;
    }

    @Override
    public String toString() {
        return "Necklace : " + Arrays.stream(chain).mapToObj(n -> "" + n).collect(Collectors.joining(","));
    }

    public int[] extract(int begin, int end) {
        return Arrays.copyOfRange(chain, begin, end);
    }

    public int[] extract(int begin) {
        return Arrays.copyOfRange(chain, begin, chain.length);
    }

    /**
     * @return the beads
     */
    public int getBeads() {
        return beads;
    }

    /**
     * @return the chain
     */
    public int getChainLength() {
        return chain.length;
    }

}
