package enhsp2;

import enhsp2.ENHSP;

public class heuristicsJar {



    public static void main(String[] args) throws Exception {
        ENHSP p = new ENHSP(false);
        p.parseInput(args);
        p.configurePlanner();
        p.parsingDomainAndProblem(args);
        p.retrieveHeuristicValue();
    }
}
