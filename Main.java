class Main {
  public static void main(String[] args) {
    System.out.println("M & M Color Counts");

    int averagenum = 55;
    System.out.println("The average # of M & M per bag is: " + averagenum);

    double blueper = 0.24;
    System.out.println("The % of blue M & M is: " + blueper);
    double brownper = 0.13;
    System.out.println("The % of brown M & M is: " + brownper);
    double greenper = 0.16;
    System.out.println("The % of green M & M is: " + greenper);
    double orangeper = 0.20;
    System.out.println("The % of orange M & M is: " + orangeper);
    double redper = 0.13;
    System.out.println("The % of red M & M is: " + redper);
    double yellowper = 0.14;
    System.out.println("The % of yellow M & M is: " + yellowper);

    int numbag = 10;
    System.out.println("The # of M & M bags is: " + numbag);

    int totalnum = averagenum*numbag;
    System.out.println("The total # of M & M is: " + totalnum);

    double bluenum = totalnum*blueper;
    System.out.println("The total # of blue M & M is: " + bluenum);
    double brownnum = totalnum*brownper;
    System.out.println("The total # of brown M & M is: " + brownnum);
    double greennum = totalnum*greenper;
    System.out.println("The total # of geen M & M is: " + greennum);
    double orangenum = totalnum*orangeper;
    System.out.println("The total # of orange M & M is: " + orangenum);
    double rednum = totalnum*redper;
    System.out.println("The total # of red M & M is: " + rednum);
    double yellownum = totalnum*yellowper;
    System.out.println("The total # of yellow M & M is: " + yellownum);

    double sum = bluenum+brownnum+greennum+orangenum+rednum+yellownum;
    System.out.println("The sum is: " + sum);

    if(bluenum > brownnum && greennum > orangenum)
    System.out.println("Blue over Brown and Green over Orange"); 

    if(brownnum <= rednum)
    System.out.println("Brown is less than or equal to Red");

    if(sum == totalnum)
    System.out.println("Numbers match");




    
  }
}