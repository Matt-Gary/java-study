package candidacy;


import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionProcess {
    public static void main(String[] args) {
        System.out.println("Selection process");
        String[] candidates = { "FILIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JOAO" };
        int succededCandidates = 0;
        int currentCandidates = 0;
        double salaryBase = 2000.0;
        List<String> candidatesList = new ArrayList<String>();
        while (succededCandidates < 5 && currentCandidates < candidates.length) {
            String candidate = candidates[currentCandidates];
            double salaryExpectation = expectedValue();
            System.out.println("The candidate " + candidate + ". Request salary: " + salaryExpectation);
            if (salaryBase >= salaryExpectation) {
                System.out.println("O candidate " + candidate + " succed in selection process");
                succededCandidates++;
                candidatesList.add(candidate);
            }
            currentCandidates++;
        }
        for (String candidate : candidatesList) {
            System.out.println("Selected candidate: " + candidate);
            contactCandidate(candidate);
        }
    }

    static void contactCandidate(String candidate) {
        int attempts = 1;
        boolean continueAttempts = true;
        boolean answered = false;
        do {
            answered = callAnswer();
            continueAttempts = !answered;
            if(continueAttempts)
                attempts++;
            else
                System.out.println("Success call");

        } while (continueAttempts && attempts < 3);
        if (answered)
            System.out.println("We contacted with " + candidate + " in " + attempts + " attempt(s)");
        else
            System.out.println("We weren't able to contact with "+ candidate+", maximum number of attempts: "+attempts);
    }
    
    static boolean callAnswer() {
        return new Random().nextInt(3)==1;
    }
    static double expectedValue() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analyzeCandidate(double salaryExpectation) {
        double salaryBase = 2000.0;
        if (salaryBase > salaryExpectation) 
            System.out.println("Call to the candidate");
        else if(salaryBase == salaryExpectation)
            System.out.println("Call to the candidate with counter proposal");
        else 
            System.out.println("Waiting for results of other students");
    
    }
}
