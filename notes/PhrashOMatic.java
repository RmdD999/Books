public class PhrashOMatic {

    public static void main(String[] args){

        //make three sets of words to choose from. Add your own!
        String[] wordListOne = {"24/7","multiTier","30,000 foot","B-to-B","win-win",
                                "front-end","web-based","pervasive","smart","six-sigma",
                                "critical-patch","dynamic"};
        
        String[] wordListTwo = {"empowered", "sticky", 
                                "value-added", "oriented", "centric", "distributed", 
                                "clustered", "branded","outside-the-box", "positioned", 
                                "networked", "focused", "leveraged", "aligned", 
                                "targeted", "shared", "cooperative", "accelerated"};

         String[] wordListThree = {"process", "tipping-point", 
                                "solution", "architecture", "core competency", "strategy", 
                                "mindshare", "portal","space", "vision", 
                                "paradigm", "mission"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length; 

    
        //generate three random numbers
        int rand1 = (int)(Math.random() * oneLength); //Generate random number between 0 - list length
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        //new build a phrase
        String phrase = wordListOne[rand1] + " " + 
                        wordListThree[rand2] + " " + 
                        wordListThree[rand3] + " ";

        System.out.println("what we need is a " + phrase);
    }
}
