package Week3;

public class votingMachineTest {
    public static void main(String[] args) {
        votingMachine votingMachine = new votingMachine();

        votingMachine.voteLabor();
        votingMachine.voteLabor();
        votingMachine.voteLabor();
        votingMachine.voteLabor();
        votingMachine.voteLabor();
        votingMachine.voteLabor();
        votingMachine.voteConservative();
        votingMachine.voteConservative();
        votingMachine.voteConservative();

        System.out.println("Labour party votes: "+ votingMachine.getLaborPartyVotes());
        System.out.println("Conservative party votes: "+ votingMachine.getConservativePartyVotes());
    }
}
