package Week3;

import java.util.Random;

public class votingMachine {


    //vote for labor
    //vote for a conservative
    // get number of votes for each parties

   private int laborPartyVotes;
   private int conservativePartyVotes;

    //clear the machine state
    public void clearState(){
        laborPartyVotes = 0;
        conservativePartyVotes = 0;
    }

    public void voteLabor(){
        this.laborPartyVotes +=1;
    }

    public void voteConservative(){
        conservativePartyVotes += getRandomVoteCount();
    }

    public int getConservativePartyVotes() {

        return conservativePartyVotes;
    }

    public int getLaborPartyVotes() {

        return laborPartyVotes;
    }

    public int getRandomVoteCount(){
        var randomizer = new Random();
        return randomizer.nextInt(25);
    }
}
