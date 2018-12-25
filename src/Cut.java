import javafx.scene.shape.Line;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Cut{

    /**
     * Le tableau représentant une coupe
     */
    private final int[] theCut;
    private Necklace necklace;

    /**
     * Crée une coupe initiale, intialisée à 0,1,2,...
     *
     * @param t le nombre de coupes
     */
    public Cut(int t) {
        theCut = IntStream.range(0, t).toArray();
    }

    /**
     * C'est un constructeur privé, il initialise une coupe avec des données
     * fournies
     *
     * @param arr
     */
    private Cut(int[] arr) {
        theCut = Arrays.copyOf(arr, arr.length);
    }

    /**
     * cet methode cherche une coupe a traver la recherche aux profondeur,
     * ou f : est la profondeur multipliée par -1,
     * dans l'implementation on va simplement ajouter les neauveaux neoud au queue de la
     *
     * @param necklace the necklace that we are going to find the cut to.
     */
    public static String solveDepth(Necklace necklace, Cut cut) {
        ArrayList<Cut> open = cut.actions(necklace.getChainLength());
        ArrayList<Cut> closed = new ArrayList<>();

        while (!open.isEmpty()) {
            Cut mCut = open.get(0);
            closed.add(mCut);
            open.remove(0);
            if (mCut.isFair(necklace)) {
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("");
                System.out.println("Solve Depth :");
                mCut.applyTo(necklace);
                mCut.statistic(open.size(), closed.size());
                return mCut.statistic(open.size(), closed.size());
            } else {
                for (Cut c : mCut.actions(necklace.getChainLength())) {
                    if (!open.contains(c) && !closed.contains(c)) {
                        open.add(c);
                    }
                }
            }
        }
        return null;
    }

    public static String solveWidth(Necklace necklace, Cut cut, JPanel panel) {
        ArrayList<Cut> open = cut.actions(necklace.getChainLength());
        ArrayList<Cut> closed = new ArrayList<>();

        while (!open.isEmpty()) {
            Cut mCut = open.get(0);
            closed.add(mCut);
            open.remove(0);
            if (mCut.isFair(necklace)) {
                mCut.applyTo(necklace, panel);
                return mCut.statistic(open.size(), closed.size());
            } else {
                for (Cut c : mCut.actions(necklace.getChainLength())) {
                    if (!open.contains(c) && !closed.contains(c)) {
                        open.add(0, c);
                    }
                }
            }
        }

        return null;
    }

    //cette méthode n'est pas obligatoire
    //mais peut servir à comparer les performances
    public static String solveRandom(Necklace necklace, Cut cut) {
        ArrayList<Cut> open = cut.actions(necklace.getChainLength());
        ArrayList<Cut> closed = new ArrayList<>();
        Random random = new Random();

        while (!open.isEmpty()) {
            Cut mCut = open.get(0);
            closed.add(mCut);
            open.remove(0);
            if (mCut.isFair(necklace)) {
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("");
                System.out.println("Solve Random :");
                mCut.applyTo(necklace);
                return mCut.statistic(open.size(), closed.size());
            } else {
                for (Cut c : mCut.actions(necklace.getChainLength())) {
                    if (!open.contains(c) && !closed.contains(c)) {
                        open.add(random.nextInt(open.size() + 1), c);
                    }
                }
            }
        }
        return null;
    }

    /**
     * This methode use a funcion of evaluation f for sorting the open --- ,
     * whereas f = g + h.
     * where g : cost of the present state,
     * and h: is the distance of Manhatten between DBrother0ne and DBrotherTwo.
     *
     * @param necklace : the necklace that is going to be cuted.
     */
    public static String solveHeuristic1(Necklace necklace, Cut cut) {
        cut.setNecklace(necklace);

        ArrayList<Cut> open = cut.actions(necklace.getChainLength());
        ArrayList<Cut> closed = new ArrayList<>();

        while (!open.isEmpty()) {
            Cut mCut = open.get(0);
            //Cut mCut= Collections.min(open);
            closed.add(mCut);
            open.remove(0);
            if (mCut.isFair(necklace)) {
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("");
                System.out.println("Solve Heuristic 01 - Manhattan's distance :");
                mCut.applyTo(necklace);
                return mCut.statistic(open.size(), closed.size());
            } else {
                for (Cut c : mCut.actions(necklace.getChainLength())) {
                    if (!open.contains(c) && !closed.contains(c)) {
                        if (open.isEmpty())
                            open.add(c);
                        else if (c.manhattanDistance(necklace) < open.get(0).manhattanDistance(necklace))
                            open.add(c);
                        else
                            open.add(1, c);
                    }
                }
            }
        }
        return null;
    }

    public static String solveHeuristic2(Necklace necklace, Cut cut) {
        cut.setNecklace(necklace);

        ArrayList<Cut> open = cut.actions(necklace.getChainLength());
        ArrayList<Cut> closed = new ArrayList<>();

        while (!open.isEmpty()) {
            Cut mCut = open.get(0);
            closed.add(mCut);
            open.remove(0);
            if (mCut.isFair(necklace)) {
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("");
                System.out.println("Solve Heuristic 02 - Euclidean's distance :");
                mCut.applyTo(necklace);
                return mCut.statistic(open.size(), closed.size());
            } else {
                for (Cut c : mCut.actions(necklace.getChainLength())) {
                    if (!open.contains(c) && !closed.contains(c)) {
                        if (open.isEmpty())
                            open.add(c);
                        else if (c.euclideanDistance(necklace) < open.get(0).euclideanDistance(necklace))
                            open.add(c);
                        else
                            open.add(1, c);
                    }
                }
            }
        }
        return null;
    }

    public static String solveHeuristic3(Necklace necklace, Cut cut) {
        cut.setNecklace(necklace);

        ArrayList<Cut> open = cut.actions(necklace.getChainLength());
        ArrayList<Cut> closed = new ArrayList<>();

        while (!open.isEmpty()) {
            Cut mCut = open.get(0);
            closed.add(mCut);
            open.remove(0);
            if (mCut.isFair(necklace)) {
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("");
                System.out.println("Solve Heuristic 03 - Hamming's distance :");
                mCut.applyTo(necklace);
                return mCut.statistic(open.size(), closed.size());
            } else {
                for (Cut c : mCut.actions(necklace.getChainLength())) {
                    if (!open.contains(c) && !closed.contains(c)) {
                        if (open.isEmpty())
                            open.add(c);
                        else if (c.hammingDistance(necklace) < open.get(0).hammingDistance(necklace))
                            open.add(c);
                        else
                            open.add(1, c);
                    }
                }
            }
        }
        return null;
    }

    public static void solveHeuristic4() {
        //TODO
    }

    public void setNecklace(Necklace necklace) {
        this.necklace = necklace;
    }

    @Override
    public String toString() {
        return "Cut : " + Arrays.stream(theCut).mapToObj(n -> "" + n).collect(Collectors.joining(","));
    }

    /**
     * Effectue un affichage du résultat du découpage
     *
     * @param neckl le collier à découper
     */
    public void applyTo(Necklace neckl) {
        int ind = 0;
        System.out.println("######################");
        int[] chunk;
        for (int c : theCut) {
            chunk = neckl.extract(ind, c + 1);
            System.out.print('[');
            System.out.print(Arrays.stream(chunk).mapToObj(n -> "" + n).collect(Collectors.joining(",")));
            System.out.print("],");
            ind = c + 1;
        }

        chunk = neckl.extract(ind);
        System.out.print('[');
        System.out.print(Arrays.stream(chunk).mapToObj(n -> "" + n).collect(Collectors.joining(",")));
        System.out.println("]");
    }

    public void applyTo(Necklace necklace, JPanel panel){
        JCuttedNecklace mNecklace = new JCuttedNecklace(necklace, theCut);
        mNecklace.setPreferredSize(new Dimension(1000, 100));
        mNecklace.setMaximumSize(new Dimension(1000, 100));
        panel.add(mNecklace);
        panel.repaint();
    }
    public String applyToString(Necklace neckl) {
        int ind = 0;
        String str = "";
        int[] chunk;
        for (int c : theCut) {
            chunk = neckl.extract(ind, c + 1);
            str += '[';
            str += (Arrays.stream(chunk).mapToObj(n -> "" + n).collect(Collectors.joining(",")));
            str += "],";
            ind = c + 1;
        }

        chunk = neckl.extract(ind);
        str += '[';
        str += (Arrays.stream(chunk).mapToObj(n -> "" + n).collect(Collectors.joining(",")));
        str += "]";

        return str;
    }

    /**
     * Détermine si la coupe assure que chaque frère obtienne le même nombre de
     * perles de chaque type
     *
     * @param neckl le collier à découper
     * @return vrai si la coupe est correcte, faux sinon
     */
    public boolean isFair(Necklace neckl) {
        int ind = 0;
        ArrayList<int[]> parts = new ArrayList();
        for (int c : theCut) {
            parts.add(neckl.extract(ind, c + 1));
            ind = c + 1;
        }
        parts.add(neckl.extract(ind));

        int[] brother1 = new int[neckl.getBeads()];
        int[] brother2 = new int[neckl.getBeads()];
        Arrays.fill(brother1, 0);
        Arrays.fill(brother2, 0);

        int lenParts = parts.size();
        for (int i = 0; i < lenParts; i += 2) {
            int[] currentPart = parts.get(i);
            if (currentPart.length == 0) {
                throw new Error("Problème");
            }
            for (int elt : currentPart) {
                brother1[elt]++;
            }
        }

        for (int i = 1; i < lenParts; i += 2) {
            int[] currentPart = parts.get(i);
            if (currentPart.length == 0) {
                throw new Error("Problème");

            }
            for (int elt : currentPart) {
                brother2[elt]++;
            }
        }

        for (int i = 0; i < brother1.length; i++) {
            if (brother1[i] != brother2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Cette fonction teste l'égalité des coupes. Ceci permet de comparer les
     * coupes par la méthode equals ou tester l'appartenance à une liste
     *
     * @param obj l'objet à comparer
     * @return vrai uniquement s'il s'agit de la même coupe
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        Cut cut = (Cut) obj;
        for (int i = 0; i < theCut.length; i++) {
            if (theCut[i] != cut.theCut[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Cette méthode détermine les actions possibles à partir d'une coupe
     *
     * @param len la longueur du collier
     * @return la liste des coupes que l'on peut dériver
     */
    public ArrayList<Cut> actions(int len) {
        ArrayList<Cut> res = new ArrayList();
        for (int i = 0; i < theCut.length; i++) {
            theCut[i]++;
            if (isValid(theCut, len)) {
                res.add(new Cut(theCut));
            }
            theCut[i]--;

            theCut[i]--;
            if (isValid(theCut, len)) {
                res.add(new Cut(theCut));
            }
            theCut[i]++;
        }
        return new ArrayList<>(res.stream().filter(
                (Cut cut) -> isValid(cut.theCut, len))
                .collect(Collectors.toList())
        );
    }

    private boolean isValid(int[] cut, int len) {
        if (Arrays.stream(cut).filter(i -> i < 0 || i >= len - 1).findFirst().isPresent()) {
            return false;
        }
        for (int i = 1; i < cut.length; i++) {
            if (cut[i] == cut[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private int manhattanDistance(Necklace necklace) {
        int[] brotherOne = new int[necklace.getBeads()];
        int[] brotherTwo = new int[necklace.getBeads()];
        Arrays.fill(brotherOne, 0);
        Arrays.fill(brotherTwo, 0);

        int brother = 1;
        int index = 0;

        ArrayList<int[]> brotherOneParts = new ArrayList();
        ArrayList<int[]> brotherTwoParts = new ArrayList();

        for (int c : theCut) {
            if (brother == 1) {
                brotherOneParts.add(necklace.extract(index, c + 1));
                index = c + 1;
            } else {
                brotherTwoParts.add(necklace.extract(index, c + 1));
                index = c + 1;
            }
        }
        if (brother == 1)
            brotherOneParts.add(necklace.extract(index));
        else
            brotherTwoParts.add(necklace.extract(index));

        for (int[] part : brotherOneParts) {
            for (int elt : part) {
                brotherOne[elt]++;
            }
        }

        for (int[] part : brotherOneParts) {
            for (int elt : part) {
                brotherOne[elt]++;
            }
        }
        int distance = 0;
        for (int i = 0; i <= necklace.getBeads() - 1; i++) {
            distance += Math.abs(brotherOne[i] - brotherTwo[i]);
        }
        return distance;
    }

    private int euclideanDistance(Necklace necklace) {
        int[] brotherOne = new int[necklace.getBeads()];
        int[] brotherTwo = new int[necklace.getBeads()];
        Arrays.fill(brotherOne, 0);
        Arrays.fill(brotherTwo, 0);

        int brother = 1;
        int index = 0;

        ArrayList<int[]> brotherOneParts = new ArrayList();
        ArrayList<int[]> brotherTwoParts = new ArrayList();

        for (int c : theCut) {
            if (brother == 1) {
                brotherOneParts.add(necklace.extract(index, c + 1));
                index = c + 1;
            } else {
                brotherTwoParts.add(necklace.extract(index, c + 1));
                index = c + 1;
            }
        }
        if (brother == 1)
            brotherOneParts.add(necklace.extract(index));
        else
            brotherTwoParts.add(necklace.extract(index));

        for (int[] part : brotherOneParts) {
            for (int elt : part) {
                brotherOne[elt]++;
            }
        }

        for (int[] part : brotherOneParts) {
            for (int elt : part) {
                brotherOne[elt]++;
            }
        }
        int distance = 0;
        int j = 0;
        for (int i = 0; i <= necklace.getBeads() - 1; i++) {
            j = brotherOne[i] - brotherTwo[i];
            distance += j ^ 2;
        }
        return (int) Math.sqrt(distance);
    }

    private int hammingDistance(Necklace necklace) {
        int[] brotherOne = new int[necklace.getBeads()];
        int[] brotherTwo = new int[necklace.getBeads()];
        Arrays.fill(brotherOne, 0);
        Arrays.fill(brotherTwo, 0);

        int brother = 1;
        int index = 0;

        ArrayList<int[]> brotherOneParts = new ArrayList();
        ArrayList<int[]> brotherTwoParts = new ArrayList();

        for (int c : theCut) {
            if (brother == 1) {
                brotherOneParts.add(necklace.extract(index, c + 1));
                index = c + 1;
            } else {
                brotherTwoParts.add(necklace.extract(index, c + 1));
                index = c + 1;
            }
        }
        if (brother == 1)
            brotherOneParts.add(necklace.extract(index));
        else
            brotherTwoParts.add(necklace.extract(index));

        for (int[] part : brotherOneParts) {
            for (int elt : part) {
                brotherOne[elt]++;
            }
        }

        for (int[] part : brotherOneParts) {
            for (int elt : part) {
                brotherOne[elt]++;
            }
        }
        int distance = 0;
        int j = 0;
        for (int i = 0; i <= necklace.getBeads() - 1; i++) {
            j = brotherOne[i] - brotherTwo[i];
            distance += omega(j);
        }
        return (int) distance;
    }


    private int omega(int a) {
        if (a == 0)
            return 0;
        return 1;
    }


    private String statistic(int open, int closed) {
        return "Number of states :\t" + (open + closed) + "\n" +
                "Number of explored states :\t" + closed + "\n" +
                "Conversion rate :\t" + ((closed * 100) / open) + "%";
    }

    public  int[] getCut(){
        return theCut;
    }
}
