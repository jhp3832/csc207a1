package game;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import sprites.CleanHallway;
import sprites.Dirt;
import sprites.Dumpster;
import sprites.DustBall;
import sprites.Sprite;
import sprites.Vacuum;
import sprites.Wall;

/**
 * A class that represents the basic functionality of the vacuum game.
 * This class is responsible for performing the following operations:
 * 1. At creation, it initializes the instance variables used to store the
 *        current state of the game.
 * 2. When a move is specified, it checks if it is a legal move and makes the
 *        move if it is legal.
 * 3. It reports information about the current state of the game when asked.
 */
public class VacuumGame { 

    // a random number generator to move the DustBalls
    private Random random;

    // the grid
    private Grid<Sprite> grid;

    // the first player
    private Vacuum vacuum1;

    /// the second player
    private Vacuum vacuum2;

    // the dirt (both static dirt and mobile dust balls)
    private List<Dirt> dirts;

    // the dumpsters
    private List<Dumpster> dumpsters;

    /**
     * Creates a new VacuumGame that corresponds to the given input text file.
     * Assumes that the input file has one or more lines of equal lengths, and
     * that each character in it (other than newline) is a character that 
     * represents one of the sprites in this game.
     * @param layoutFileName path to the input grid file
     */
    public VacuumGame(String layoutFileName) throws IOException {
        this.dirts = new ArrayList<Dirt>();
        this.dumpsters = new ArrayList<Dumpster>(); // Jen: may not need this
        this.random = new Random();

        // open the file, read the contents, and determine 
        // dimensions of the grid
        int[] dimensions = getDimensions(layoutFileName);
        this.grid = new ArrayGrid<Sprite>(dimensions[0], dimensions[1]);

        // open the file again, read the contents, and store them in grid
        Scanner sc = new Scanner(new File(layoutFileName));

	// INITIALIZE THE GRID HERE

        sc.close();
    }
    
    public Grid<Sprite>getGrid() {
    	
    }


    /**
     * Returns the dimensions of the grid in the file named layoutFileName.
     * @param layoutFileName path of the input grid file
     * @return an array [numRows, numCols], where numRows is the number
     * of rows and numCols is the number of columns in the grid that
     * corresponds to the given input grid file
     * @throws IOException
     */
    private int[] getDimensions(String layoutFileName) throws IOException {       

        Scanner sc = new Scanner(new File(layoutFileName));

        // find the number of columns
        String nextLine = sc.nextLine();
        int numCols = nextLine.length();

        int numRows = 1;

        // find the number of rows
        while (sc.hasNext()) {
            numRows++;
            nextLine = sc.nextLine();
        }

        sc.close();
        return new int[]{numRows, numCols};
    }
}
