/**
 * Created by Joshua on 10/9/2016.
 */
public class EnchantedMaze extends Maze{

    MazeFactory mazeFactory;

    public EnchantedMaze (MazeFactory mazeFactory)
    {
        this.mazeFactory = mazeFactory;
    }

    void makeMaze() // puts together the pieces for the enchanted maze
    {
        System.out.println("Making maze " + getName());

        room = mazeFactory.addRoom();
        door = mazeFactory.addDoor();
        wall = mazeFactory.addWall();
    }

}
